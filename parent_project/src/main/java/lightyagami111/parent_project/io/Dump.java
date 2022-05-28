package lightyagami111.parent_project.io;

import lombok.SneakyThrows;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Dump {

    @SneakyThrows
    public static void dumpToFile(String fileName, byte[] content) {
        Files.write(Paths.get(fileName), content);
    }

    public static void dumpToFile(String fileName, String content) throws IOException {
        Files.writeString(Paths.get(fileName), content);
    }

    public static void dumpToYamlFile(String fileName, Object data) throws IOException {
        Yaml yaml = new Yaml();
        StringWriter writer = new StringWriter();
        yaml.dump(data, writer);

        dumpToFile(fileName+".yaml", writer.toString());
    }

    public static void dumpException(String name, Exception ex) throws FileNotFoundException {
        File file = new File(Paths.get(name + ".log").toString());
        PrintStream ps = new PrintStream(file);
        ex.printStackTrace(ps);
        ps.close();
    }

}
