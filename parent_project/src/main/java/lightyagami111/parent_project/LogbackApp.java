package lightyagami111.parent_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Arrays;


public class LogbackApp {

    private static final Logger logger = LoggerFactory.getLogger(LogbackApp.class);

    public static void main(String[] args) {

        String classpath = System.getProperty("java.class.path");
        String[] classPathValues = classpath.split(File.pathSeparator);
        System.out.println(Arrays.toString(classPathValues));


        logger.debug("Hello from Logback");

        logger.debug("getNumber() : {}", getNumber());

    }

    static int getNumber() {
        return 5;
    }

}
