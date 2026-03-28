/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_e;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ganesh-kumar-r
 */
public class Finance {
    private double balance;
    private List<String> database = new ArrayList<>();

    public void poolingOfFunds(double amount) {
        this.balance += amount;
        database.add("Transaction: +" + amount);
        System.out.println("Funds Pooled. Current Balance: " + balance);
    }

    public void economicDevelopment() {
        System.out.println("Allocating funds for infrastructure development.");
    }

    public void betterDecisionMaking() {
        System.out.println("Analyzing " + database.size() + " records for decision making.");
    }
    
}
