/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_no2;
    import java.util.GregorianCalendar;
/**
 *
 * @author putri aurelia
 */
public class Week5_no2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GregorianCalendar calendar= new GregorianCalendar();

        
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        System.out.println("Current Date : " + calendar.get(GregorianCalendar.DAY_OF_MONTH) + " " + month[calendar.get(GregorianCalendar.MONTH)] + " " + calendar.get(GregorianCalendar.YEAR));
        
        long setTimeInMillis = calendar.getTimeInMillis();
        
        System.out.println("\nWaktu berlalu sejak 1 January 1970 adalah " + calendar.getTimeInMillis() + " millisecond, atau :");
        
        if(setTimeInMillis >= 3.154e+10){
            System.out.print((int) (setTimeInMillis / 3.154e+10) + " tahun ");
        }
        if((setTimeInMillis % 3.154e+10) >= 2.628e+9){
            System.out.print((int) ((setTimeInMillis % 3.154e+10) /  2.628e+9) + " bulan ");
        }
        if(((setTimeInMillis % 3.154e+10) % 2.628e+9) >= 8.64e+7){
            System.out.print((int) (((setTimeInMillis % 3.154e+10) %  2.628e+9) / 8.64e+7) + " hari.");
        }
        // TODO code application logic here
    }
    
}
