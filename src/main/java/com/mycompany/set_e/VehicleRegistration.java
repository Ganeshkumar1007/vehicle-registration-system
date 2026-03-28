/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_e;

/**
 *
 * @author ganesh-kumar-r
 */
public class VehicleRegistration {
    protected String details;
    public String owner;
    
    

   
    
    public void registerVehicle(String details, String ownerName){
        this.details = details;
        this.owner = ownerName;
        System.out.println("Vehicle registered to: " + owner);
    }
    public void getDetailsAndVerifyDetails(){
        System.out.println("Verifying: " + details);
    }
    
}
