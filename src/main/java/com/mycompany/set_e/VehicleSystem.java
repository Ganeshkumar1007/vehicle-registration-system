/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.set_e;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ganesh-kumar-r
 */
public class VehicleSystem {

    public static void main(String[] args) {
        Finance govtFinance = new Finance();
        
        LoginSignUp user = new LoginSignUp();
        user.signUp("Ganesh", "abc@gmail.com", "12345");
        
        VehicleLicensing applicant = new VehicleLicensing();
        applicant.name = "Ganesh";
        applicant.age = 21;
        applicant.provideLicense();
        
        Examination exam = new Examination();
        exam.figureOutEligibleCandidates(List.of(applicant));
        
        VehiclePermit permit = new VehiclePermit();
        permit.registerVehicle("SUV", "Ganesh");
        permit.issuePermit();
        
        govtFinance.poolingOfFunds(5000.00);
        govtFinance.betterDecisionMaking();
        
    }
}
