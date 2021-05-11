/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author putri aurelia
 */
public class Admin extends User{
    private String admin_name, email;
    
    Admin(int user_id, String admin_name,String email, String password){
        super(user_id, password);
        this.admin_name = admin_name;
        this.email = email;
    }
    
    public void update_catalog(){
        System.out.print("Empty catalog.");
    }
    
    public String email(){
        return email;
    }
}
