/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightyagami111.parent_project;

import java.util.*;

/**
 *
 * @author Ivaylo Rusev
 */
public class LocaleJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale l = new Locale("bg", "BG");
        Locale.setDefault(Locale.Category.DISPLAY, l);
        
        for (Locale value : Locale.getAvailableLocales()) {
            System.out.println(value.getDisplayCountry());
        }
        
    }
    
}
