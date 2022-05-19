/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightyagami111.example_project1;

import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ivaylo
 */
public class DateFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("DE");
        System.out.println(localeShortDateToString("de", "DE", new Date().getTime()));  
        
        System.out.println("BE");
        System.out.println(localeShortDateToString("nl", "BE", new Date().getTime()));        
        System.out.println(localeShortDateToString("fr", "BE", new Date().getTime()));
        System.out.println(localeShortDateToString("de", "BE", new Date().getTime()));
        
        System.out.println("BA");
        System.out.println(localeShortDateToString("bs", "BA", new Date().getTime()));
        System.out.println(localeShortDateToString("sr", "BA", new Date().getTime()));
        System.out.println(localeShortDateToString("hr", "BA", new Date().getTime()));
        
        System.out.println("CN");
        System.out.println(localeShortDateToString("zh", "CN", new Date().getTime()));
    }
    
    private static String localeShortDateToString(String language, String country, Long timestamp) {
        java.text.DateFormat df = java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT, new Locale(language, country));
        return df.format(new Date(timestamp));
    }
    
}
