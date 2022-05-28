package example_xhtml2fo;

import lightyagami111.parent_project.io.Dump;
import lightyagami111.parent_project.io.FileResourcesUtils;
import lombok.SneakyThrows;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

public class ApplicationXhtml2fo {

    public static void main(String[] args) {
        StreamSource xslTemplate = new StreamSource(FileResourcesUtils.getFileFromResourceAsStream("template_invoice.xsl"));
        Dump.dumpToFile("example_xhtml2fo/src/main/resources/sample_ibm.fo", convertXhtml2fo_ibm(xslTemplate));
        Dump.dumpToFile("example_xhtml2fo/src/main/resources/sample_antenna.fo", convertXhtml2fo_antenna(xslTemplate));
    }

    public static byte[] convertXhtml2fo_ibm(Source xhtmlSource) {
        StreamSource xslTemplate = new StreamSource(FileResourcesUtils.getFileFromResourceAsStream("xhtml2fo_ibm.xsl"));
        return convertXhtml2fo(xhtmlSource, xslTemplate);
    }

    public static byte[] convertXhtml2fo_antenna(Source xhtmlSource) {
        StreamSource xslTemplate = new StreamSource(FileResourcesUtils.getFileFromResourceAsStream("xhtml2fo_antenna.xsl"));
        return convertXhtml2fo(xhtmlSource, xslTemplate);
    }

    @SneakyThrows
    public static byte[] convertXhtml2fo(Source xhtmlSource, Source xslTemplate) {
        StringWriter writer = new StringWriter();
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer(xslTemplate);
        transformer.transform(xhtmlSource, new StreamResult(writer));

        return writer.toString().getBytes(StandardCharsets.UTF_8);
    }

}
