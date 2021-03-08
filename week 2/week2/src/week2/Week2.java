/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
    import java.util.Scanner;
    import java.util.Random;
    import java.util.InputMismatchException;
/**
 *
 * @author putri aurelia
 */
public class Week2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka = 0;
        String input = "", loterenumber;
        
        Scanner putri = new Scanner(System.in);
        Random win = new Random();
        
        loterenumber = String.format("%d%d", win.nextInt(10), win.nextInt(10));
        
        do{
            System.out.print("Input angka [0-99]: ");
            try {
                angka = putri.nextInt();
            }catch(InputMismatchException ime){
                putri.nextLine();
                continue;
            }
            if(angka>=0 && angka<=99)
                break;
        }while (true);
        
        if(angka<10){
            input = String.format("0%d", angka);
        }else input = String.valueOf(angka);
        
        if(input.equals(loterenumber)){
            System.out.println("Selamat! Anda memenangkan $10.000");
        }
        else if(input.charAt(0)== loterenumber.charAt(1)&&input.charAt(1)== loterenumber.charAt(0)){
            System.out.println("Selamat! Anda memenangkan $3.000");
        }
        else if(input.charAt(0)== loterenumber.charAt(0)||input.charAt(0)== loterenumber.charAt(1)||input.charAt(1)== loterenumber.charAt(0)||input.charAt(1)== loterenumber.charAt(1)){
            System.out.println("Selamat! Anda memenangkan $1.000");
        }
        else
            System.out.println("Maaf, anda kurang beruntung.");
        
        System.out.println("Angka anda: " + input + ", Angka lotere: " + loterenumber );
        
        // TODO code application logic here
    }
    
}
