package lightyagami111.example_xml.javax_bind_unmarshaller;

import lightyagami111.example_project1.io.FileResourcesUtils;
import lombok.SneakyThrows;

import java.io.InputStream;
import javax.xml.transform.stream.StreamSource;
import javax.xml.bind.Unmarshaller;

public abstract class XMLUnmarshaller {

    abstract Unmarshaller getUnmarshaller();

    @SneakyThrows
    public Object convertFromXMLToObject(String xmlFilePath) {
        try (InputStream is = FileResourcesUtils.getFileFromResourceAsStream(xmlFilePath)) {
            return getUnmarshaller().unmarshal(new StreamSource(is));
        }
    }

}
