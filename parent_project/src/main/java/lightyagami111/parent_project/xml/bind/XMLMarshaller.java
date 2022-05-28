package lightyagami111.parent_project.xml.bind;

import lombok.SneakyThrows;

import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;

public abstract class XMLMarshaller {

    protected abstract Marshaller getMarshaller();

    @SneakyThrows
    public ByteArrayOutputStream convertFromObjectToXmlOutputStream(Object o) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        getMarshaller().marshal(o, bos);
        return bos;
    }

}
