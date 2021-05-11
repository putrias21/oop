/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;
    import java.util.HashMap;
/**
 *
 * @author putri aurelia
 */
public class Customer extends User{
    private String customer_name, address, email;
    private HashMap<String, String> credit_card_info = new HashMap<>();
    private HashMap<String, Integer> shipping_info = new HashMap<>();
    
    Customer(int user_id, String password){
        super(user_id, password);
    }
    
    public String customer_name(){
        return customer_name;
    }
    
    public String address(){
        return address;
    }
    
    public String email(){
        return email;
    }
    
    public void bill(int subtotal, int disc, int tax, int shipping_fee){
        shipping_info.put("Subtotal", subtotal);
        shipping_info.put("Discount", disc);
        shipping_info.put("Tax", tax);
        shipping_info.put("Shipping Fee", shipping_fee);
        shipping_info.put("Total", calculate_next_bill_amount(subtotal, disc, tax, shipping_fee));
        System.out.println("Shipping info:");
        System.out.println("Subtotal : " + subtotal);
        System.out.println("Discount : " + disc + "%");
        System.out.println("Tax : " + tax + "%");
        System.out.println("Shipping Fee : " + shipping_fee);
        System.out.println("Total : " + shipping_info.get("Total"));
    }
    
    public void register(String customer_name, String address, String email, String cardnumber, String CVV, String exp){
        this.customer_name = customer_name;
        this.address = address;
        this.email = email;
        credit_card_info.put("Card Number", cardnumber);
        credit_card_info.put("CVV", CVV);
        credit_card_info.put("Exp Date", exp);
    }
    
    public boolean login(String email, String password){
        if(this.email.equals(email))
            return super.verify_login(password);
        return false;
    }
    
    public void update_profile(String customer_name, String address, String email){
       this.customer_name = customer_name;
       this.address = address;
       this.email = email;
    }
    
    private int calculate_next_bill_amount(int subtotal, int disc, int tax, int shipping_fee){
        int totaldisc = subtotal - (subtotal * disc / 100);
        int total = totaldisc + (totaldisc * tax / 100) + shipping_fee;
        return total;
    }
    
    private void generate_invoice_pdf_version(){
        
    }
}
