package lightyagami111.parent_project.io.springframework;


import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@Slf4j
@Service
public class ResourceService {

    private static final String CLASSPATH = "classpath:";
    private final ResourceLoader resourceLoader;

    public ResourceService(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    private Resource getResource(Path path) {
        return resourceLoader.getResource(CLASSPATH + path.toString());
    }

    public InputStream getInputStream(Path path) {
        InputStream result = new ByteArrayInputStream(new byte[]{});
        try {
            Resource resource = getResource(path);
            result = resource.getInputStream();
        } catch (IOException e) {
            log.warn(e.getMessage());
        }
        return result;
    }

}
