package lightyagami111.parent_project.spring;

import org.springframework.util.AntPathMatcher;

public class AntPathMatcherApp {

    public static void main(String[] args) {
        String pattern = "/h2-console/**";
        String path = "/h2-console/login.do";
        AntPathMatcher antPathMatcher = new AntPathMatcher();
        System.out.println(antPathMatcher.match(pattern, path));
    }

}
