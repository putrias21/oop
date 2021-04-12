/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
       import java.util.Scanner;
/**
 *
 * @author putri aurelia
 */
public class Week6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] jawaban = {
            {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
            {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
            {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
            {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
            {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
            {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
            {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
            {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}
        };
        
        String[] benar = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        
        int[] jumlahbenar = new int[8];
        
        for(int i = 0; i <= 7; i++){
            int jumlah = 0;
            for(int j = 0; j <= 9; j++){
                if(jawaban[i][j].equals(benar[j]))
                    jumlah++;
            }
            jumlahbenar[i] = jumlah;
        }
        
       System.out.println("Output: ");
       for(int i = 0; i <= 7; i++){
           System.out.println("Mhs " + i + " jumlah jawaban benar adalah " + jumlahbenar[i]);
       }
        
        // TODO code application logic here
    }
    
}
