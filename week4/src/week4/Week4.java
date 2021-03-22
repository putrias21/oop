/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
    import java.util.Scanner;
/**
 *
 * @author putri aurelia
 */
public class Week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kota1, kota2;
        
        Scanner putri = new Scanner(System.in);
        
        System.out.print("Input nama kota pertama: ");
        kota1 = putri.nextLine();
        System.out.print("Input nama kota kedua: ");
        kota2 = putri.nextLine();
        
        if(kota1.compareToIgnoreCase(kota2) < 0){
            System.out.println(kota1);
            System.out.println(kota2);
        }else{
            System.out.println(kota2);
            System.out.println(kota1);
        }
        // TODO code application logic here
    }
    
}
