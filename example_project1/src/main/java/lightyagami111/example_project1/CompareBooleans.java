/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightyagami111.example_project1;

/**
 *
 * @author ivaylo
 */
public class CompareBooleans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (Boolean.getBoolean("true")) {
            System.out.println("getBoolean true");
        }
        if (Boolean.getBoolean("TRUE")) {
            System.out.println("getBoolean TRUE");
        }
        
        if (Boolean.valueOf("true")) {
            System.out.println("valueOf true");
        }
        if (Boolean.valueOf("TRUE")) {
            System.out.println("valueOf TRUE");
        }
        if (Boolean.parseBoolean("0")) {
            System.out.println("parseBoolean 0");
        }
        if (Boolean.parseBoolean("1")) {
            System.out.println("parseBoolean 1");
        }
        
        if (Boolean.parseBoolean("true")) {
            System.out.println("parseBoolean true");
        }
        if (Boolean.parseBoolean("TRUE")) {
            System.out.println("parseBoolean TRUE");
        }
        
        if (Boolean.parseBoolean("True")) {
            System.out.println("parseBoolean True");
        }
    }
    
}
