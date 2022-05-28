package lightyagami111.example_xml_bind_unmarshaller.shop_content.model;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Folder {
    
    @XmlElement(name = "page")
    public List<Page> pages;

    @Override
    public String toString() {
        if (pages != null) {
            return Arrays.deepToString(pages.toArray());
        }
        return " ";
    }
    
    
    
    
    
}
