package lightyagami111.example_xml_bind_unmarshaller.shop_content.model;

import lightyagami111.parent_project.xml.bind.adapters.CDATAAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Entry {
    
    @XmlAttribute
    public String key;
    
    @XmlValue
    @XmlJavaTypeAdapter(value= CDATAAdapter.class)
    public String value;

    @Override
    public String toString() {
        return "\n" + key;
    }
    
    
    
}
