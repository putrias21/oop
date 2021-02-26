/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1_1_putri.aurelia.shilo.pkg2301878952;
    import java.util.Scanner;
/**
 *
 * @author putri aurelia
 */
public class Week1_1_PutriAureliaShilo2301878952 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int detik;
        
        Scanner putri = new Scanner(System.in);
        
        System.out.print("Enter an integer for seconds: ");
        detik = putri.nextInt();
        
        System.out.print(detik + " seconds is ");
        if(detik >= 3600){
            System.out.print((detik / 3600) + " hours");
            if(detik % 3600 >= 60)
                System.out.print(" and " + (detik % 3600) / 60 + " minutes");
            if((detik % 3600) % 60 >=1)
                System.out.print(" and " + ((detik % 3600) % 60) + " seconds");
        }
        else if(detik >= 60){
            System.out.print((detik/60) + " minutes ");
            if(detik % 60  >=1)
                System.out.print(" and " + (detik % 60) + " seconds");
        }
        else System.out.print(detik + " seconds");
        // TODO code application logic here
    }
    
}
