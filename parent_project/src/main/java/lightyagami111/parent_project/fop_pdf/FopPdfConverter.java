package lightyagami111.parent_project.fop_pdf;

import lombok.SneakyThrows;
import org.apache.fop.apps.*;

import javax.xml.transform.*;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;

public class FopPdfConverter {

    /**
     * Method that will convert/xslt transform/ the given XML data and XSL template to PDF
     * @param xslFileName - fo template file under resource dir "example.xsl"
     * @param bos - xml data (can be obtained through xml marshalling from pojo data model from {@link lightyagami111.parent_project.xml.bind.XMLMarshaller})
     * @param fileOutputName - where to output the resulting pdf "src/main/resources/example.pdf"
     */
    @SneakyThrows
    public void convertToPDF(String xslFileName, ByteArrayOutputStream bos, String fileOutputName) {
        StreamSource xmlSource = new StreamSource(new ByteArrayInputStream(bos.toByteArray()));
        // the XSL FO file
        URL url = FopPdfConverter.class.getResource(xslFileName);
        File xsltFile = new File(url.toURI().getPath());
        // create an instance of fop factory
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        // a user agent is needed for transformation
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
        // Setup output
        OutputStream out;
        out = new java.io.FileOutputStream(fileOutputName);

        try {
            // Construct fop with desired output format
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

            // Setup XSLT
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

            // Resulting SAX events (the generated FO) must be piped through to FOP
            Result res = new SAXResult(fop.getDefaultHandler());

            // Start XSLT transformation and FOP processing
            // That's where the XML is first transformed to XSL-FO and then
            // PDF is created
            transformer.transform(xmlSource, res);
        } finally {
            out.close();
        }
    }

}
