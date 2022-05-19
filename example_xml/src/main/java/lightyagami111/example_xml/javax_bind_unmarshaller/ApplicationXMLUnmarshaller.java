package lightyagami111.example_xml.javax_bind_unmarshaller;

import lightyagami111.example_xml.javax_bind_unmarshaller.binding.model.Properties;
import lombok.SneakyThrows;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationXMLUnmarshaller {

    private static final String XML_FILE_NAME = "Shop_de_LU.xml";


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
        List<String> keysSorted = map.keySet().stream().collect(Collectors.toList());


        Collections.sort(keysSorted, (o1, o2) -> o1.compareTo(o2));

        System.out.println(String.join("\n", keysSorted));


    }

}
