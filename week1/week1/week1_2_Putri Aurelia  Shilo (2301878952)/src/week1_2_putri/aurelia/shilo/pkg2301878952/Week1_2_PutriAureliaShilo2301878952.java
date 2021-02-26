/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1_2_putri.aurelia.shilo.pkg2301878952;
    import java.util.Scanner;
/**
 *
 * @author putri aurelia
 */
public class Week1_2_PutriAureliaShilo2301878952 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hari=0, jumlah, hasil;
        
        Scanner putri = new Scanner(System.in);
        
        String inputhari;
        String[] day = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
        
        System.out.print("Hari: ");
        inputhari = putri.nextLine().toLowerCase();
        
        System.out.print("Jumlah: ");
        jumlah = putri.nextInt();
        
        System.out.println("Jika hari ini adalah " + inputhari + ", hari apakah dalam " + jumlah + " hari berikutnya?");
        
        for(int i=1; i<=day.length; i++){
            if(inputhari.equals(day[i-1])){
                hari = i-1;
            }
        }
        
        hasil = (hari + (jumlah % 7)) % 7;
        
        System.out.print(day[hasil]);
        // TODO code application logic here
    }
    
}
