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
public class Examination {
    public String name;
    protected String signature;

    public void figureOutEligibleCandidates(List<VehicleLicensing> applicants) {
    
        for (VehicleLicensing applicant : applicants) {
            if (applicant.age >= 18) {
                System.out.println("Eligible: " + applicant.name);
            }
        }
    }
    
    public String getSignature(){
        return this.signature;
    }
}
