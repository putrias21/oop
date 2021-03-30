/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
/**
 *
 * @author putri aurelia
 */
public class Week5_no1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabung tabung1 = new Tabung(5, 10);
        Tabung tabung2 = new Tabung(7.5, 15.5);
        
        System.out.println("Object pertama");
        System.out.println("--------------");
        System.out.println("Radius : " + tabung1.rad);
        System.out.println("Tinggi : " + tabung1.tinggi);
        System.out.println("Luas alas : " + tabung1.getLuasAlas());
        System.out.println("Volume tabung : " + tabung1.getVolume());
        
        System.out.println("\nObject kedua");
        System.out.println("--------------");
        System.out.println("Radius : " + tabung2.rad);
        System.out.println("Tinggi : " + tabung2.tinggi);
        System.out.println("Luas alas : " + tabung2.getLuasAlas());
        System.out.println("Volume tabung : " + tabung2.getVolume());
        // TODO code application logic here
    }
    
}
