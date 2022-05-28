package lightyagami111.parent_project.xml;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class XMLValidation {

    public static boolean validateXMLSchema(String xmlToValidateFilePath, String xsdSchemaFilePath){
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(XMLValidation.class.getResource(xsdSchemaFilePath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(Paths.get(xmlToValidateFilePath).toString())));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: "+e.getMessage());
            return false;
        }
        return true;
    }

}
