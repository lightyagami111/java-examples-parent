package lightyagami111.example_xml_bind_unmarshaller.shop_content;

import lightyagami111.example_xml_bind_unmarshaller.shop_content.model.Properties;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ApplicationXMLUnmarshaller {

    private static final String XML_FILE_NAME = "shop_content/Shop_de_LU.xml";


    @SneakyThrows
    public static void main(String[] args) {
        XMLUnmarshallerContent converter = new XMLUnmarshallerContent();
        Properties shopContent = (Properties) converter.convertFromXMLToObject(XML_FILE_NAME);

        //all keys
//        List<String> keysSorted = new ArrayList<>();
//        shopContent.folders.forEach((folder) -> {
//            if (folder.pages != null) {
//                folder.pages.forEach((page) -> {
//                    if (page.entries != null) {
//                        page.entries.forEach((entry) -> {
//                            keysSorted.add(entry.key);
//                        });
//                    }
//                });
//            }
//        });

        //no duplicated
        HashMap<String, String> map = new HashMap<>();
        shopContent.folders.forEach((folder) -> {
            if (folder.pages != null) {
                folder.pages.forEach((page) -> {
                    if (page.entries != null) {
                        page.entries.forEach((entry) -> {
                            map.put(entry.key, entry.value);
                        });
                    }
                });
            }
        });

        List<String> keysSorted = new ArrayList<>(map.keySet());
        Collections.sort(keysSorted, String::compareTo);
        System.out.println(String.join("\n", keysSorted));


    }

}
