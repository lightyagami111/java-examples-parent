package lightyagami111.example_xml.javax_bind_unmarshaller;

import lightyagami111.example_xml.javax_bind_unmarshaller.binding.model.Properties;

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
    Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }
    
}
