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
public class User {
    private int user_id;
    private String password;
    private boolean login_status = false;
    
    User(int user_id, String password){
        this.user_id = user_id;
        this.password = password;
    }
    public boolean verify_login(String pass){
        if(pass.equals(password)){
            login_status = true;
        }
        return login_status;
    }
    
    public int user_id(){
        return user_id;
    }
}
