/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_e;

/**
 *
 * @author ganesh-kumar-r
 */
public class VehicleLicensing {
    public int age;
    public String name;
    public String address;

    public void provideLicense() {
        if (age >= 18) {
            System.out.println("Licence eligible for: " + name);
        } else {
            System.out.println("Candidate " + name + " is not eligible.");
        }
    }
    
}
