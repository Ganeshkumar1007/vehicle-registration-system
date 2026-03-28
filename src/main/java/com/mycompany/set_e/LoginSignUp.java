/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_e;

/**
 *
 * @author ganesh-kumar-r
 */
public class LoginSignUp {
    private String name;
    public String emailId;
    private String password;

    public void login(String email, String password) {
        System.out.println("User " + email + " logged in...");
    }

    public void signUp(String name, String email, String password) {
        this.name = name;
        this.emailId = email;
        this.password = password;
        System.out.println("Account created for: " + name);
    } 
    
}
