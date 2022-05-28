package lightyagami111.parent_project.xml.bind;

import lightyagami111.parent_project.io.FileResourcesUtils;
import lombok.SneakyThrows;

import java.io.InputStream;
import javax.xml.transform.stream.StreamSource;
import javax.xml.bind.Unmarshaller;

public abstract class XMLUnmarshaller {

    protected abstract Unmarshaller getUnmarshaller();

    @SneakyThrows
    public Object convertFromXMLToObject(String xmlFilePath) {
        InputStream is = FileResourcesUtils.getFileFromResourceAsStream(xmlFilePath);
        return getUnmarshaller().unmarshal(new StreamSource(is));
    }

}
