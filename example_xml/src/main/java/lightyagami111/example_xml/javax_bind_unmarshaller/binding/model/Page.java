package lightyagami111.example_xml.javax_bind_unmarshaller.binding.model;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Page {
    
    @XmlElement(name = "entry")    
    public List<Entry> entries;

    @Override
    public String toString() {
        if (entries != null) {
            return Arrays.toString(entries.toArray());
        }
        return " ";
    }
    
    
    
    
    
}
