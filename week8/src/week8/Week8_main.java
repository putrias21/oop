/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;
    import java.util.Scanner;
/**
 *
 * @author putri aurelia
 */
public class Week8_main {
    public static Scanner putri = new Scanner(System.in);
    
    public static Admin admin = new Admin(101, "Putri", "putri@gmail.com", "123456");
        
    public static Customer customer = new Customer(201, "678910");
    
    public static void login(int choice){
        System.out.print("Email : ");
        String email = putri.nextLine();
        System.out.print("Password : ");
        String password = putri.nextLine();

        if(choice == 1) {
            if(admin.email().equals(email) && admin.verify_login(password)) {
                System.out.println("\nWelcome, " + admin.email() + " (admin)");
                System.out.println("\nUser ID : " + admin.user_id());
                System.out.println("Email : " + admin.email());
            }
            else {
                System.out.print("\nWrong email/password, log in failed.");
            }
        }
        else {
            if(customer.login(email, password)) {
                System.out.println("\nWelcome, " + customer.email() + " (customer)");
                customer();
            }
            else {
                System.out.print("\nWrong email/password, log in failed.");
            }
        }
    }
    
    public static void customer(){
        String update;
        
        System.out.println("\nUser ID : " + customer.user_id());
        System.out.println("Customer Name : " + customer.customer_name());
        System.out.println("Address : " + customer.address());
        System.out.println("Email : " + customer.email());
        customer.bill(250000, 5, 10, 5000);
        
        do{
            System.out.print("\nUpdate profile [Y / N] : ");
            update = putri.nextLine(); 
        }while(!update.equalsIgnoreCase("y") && !update.equalsIgnoreCase("n"));
        
        if(update.equalsIgnoreCase("y")){
            System.out.print("\nCustomer Name : ");
            String nama = putri.nextLine();
            System.out.print("Address : ");
            String alamat = putri.nextLine();
            System.out.print("Email : " );
            String email = putri.nextLine();
            customer.update_profile(nama, alamat, email);
            
            System.out.println("\n\nUpdate Success!");
            System.out.println("\nUser ID : " + customer.user_id());
            System.out.println("Customer Name : " + customer.customer_name());
            System.out.println("Address : " + customer.address());
            System.out.println("Email : " + customer.email() + "\n");
            customer.bill(250000, 5, 10, 5000);
        }else
            return;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        customer.register("Caroline", "Jl. Bandung No. 26", "caroline@gmail.com", "5241786585673241", "022", "15/25");

        int choice = 0;
        System.out.println("Login as: ");
        System.out.println("1. Admin");
        System.out.println("2. Customer");
        do{
            System.out.print("\nChoice : ");
            try{
                choice = putri.nextInt();
                putri.nextLine();
            }catch(Exception e){
                putri.nextLine();
                continue;
            } 
        }while(choice < 1 || choice > 2);
        
        login(choice);
        // TODO code application logic here
    }
    
}
