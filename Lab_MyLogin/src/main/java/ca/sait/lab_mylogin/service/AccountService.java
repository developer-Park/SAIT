/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package ca.sait.lab_mylogin.service;

import ca.sait.lab_mylogin.model.User;


/**
 *
 * @author JeongHun Park
 */
public class AccountService {
    
   public User login(String username, String password){
        if (username.equals("abe") && password.equals("password")){
            return new User(username, null);
        } else if (username.equals("barb") && password.equals("password")){
            return new User(username, null);
        } else {
            return null;
        }
    }   
}
