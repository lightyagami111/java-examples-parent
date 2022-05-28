package lightyagami111.example_xml_bind_unmarshaller.shop_content;

import lightyagami111.example_xml_bind_unmarshaller.shop_content.model.Properties;
import lightyagami111.parent_project.xml.bind.XMLUnmarshaller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class XMLUnmarshallerContent extends XMLUnmarshaller {
    
    private final Unmarshaller unmarshaller;
    
    public XMLUnmarshallerContent() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Properties.class);
        unmarshaller = context.createUnmarshaller();
    }

    @Override
    public Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }
    
}
