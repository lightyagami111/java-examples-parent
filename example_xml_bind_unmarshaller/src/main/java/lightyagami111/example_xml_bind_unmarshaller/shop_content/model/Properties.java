package lightyagami111.example_xml_bind_unmarshaller.shop_content.model;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Properties {
    
    @XmlElement(name = "folder")
    public List<Folder> folders;

    @Override
    public String toString() {
        return Arrays.deepToString(folders.toArray());
    }
    
    
    
    
    
}
