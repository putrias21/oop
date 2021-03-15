/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
    import java.util.Scanner;
    import java.util.Random;
    import java.util.InputMismatchException;
/**
 *
 * @author putri aurelia
 */
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input = 0,number;
        
        Scanner putri = new Scanner(System.in);
        Random magicnumber = new Random();
        number = magicnumber.nextInt(101);
        
        System.out.println("Guess a magic number between 0 and 100");
        do{
            System.out.print("Enter your guess: ");
                try {
                    input = putri.nextInt();
                }catch(InputMismatchException ime){
                    putri.nextLine();
                    continue;
                }
            if(input>=0 && input<=100){
                if(input < number)
                    System.out.println("Your guess is too low");
                else if(input > number)
                    System.out.println("Your guess is too high");
                else
                    System.out.println("Yes, the number is " + number);
            }
        }while(input != number);        
        // TODO code application logic here
    }
    
}
