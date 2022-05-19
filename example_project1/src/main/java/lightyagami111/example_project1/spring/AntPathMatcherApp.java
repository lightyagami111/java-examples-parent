package lightyagami111.example_project1.spring;

import org.springframework.util.AntPathMatcher;

public class AntPathMatcherApp {

    public static void main(String[] args) {
        String pattern = "/h2-console/**";
        String path = "/h2-console/login.do";
        AntPathMatcher antPathMatcher = new AntPathMatcher();
        System.out.println(antPathMatcher.match(pattern, path));
    }

}
