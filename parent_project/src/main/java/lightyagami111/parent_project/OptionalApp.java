/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightyagami111.parent_project;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ivaylo Rusev
 */
public class OptionalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> list1 = Arrays.asList("1");
        
        System.out.println(java.util.Optional.ofNullable(list1).orElse(Arrays.asList("2")).stream().findFirst().orElse("2"));
        
    }
    
}
