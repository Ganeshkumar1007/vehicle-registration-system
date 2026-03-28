/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.set_e.Examination;
import com.mycompany.set_e.Finance;
import com.mycompany.set_e.LoginSignUp;
//import com.mycompany.set_e.LoginSignUp;
import com.mycompany.set_e.VehicleLicensing;
import com.mycompany.set_e.VehicleRegistration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ganesh-kumar-r
 */
public class VehicleSystemTest {
    
    public VehicleSystemTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    void testUserLogin(){
        LoginSignUp login = new LoginSignUp();
        login.signUp("Ganesh", "abc@gmail.com", "12345");
        assertEquals("abc@gmail.com",login.emailId);
    }
    
    @Test
    void testVechicleRegistrationOwner(){
        VehicleRegistration vehRegister = new VehicleRegistration();
        vehRegister.registerVehicle("SUV", "Ganesh");
        assertNotNull(vehRegister.owner);
        assertEquals("Ganesh", vehRegister.owner);
    }
    
    @Test
    void techLicenseEligibility(){
        VehicleLicensing license = new VehicleLicensing();
        license.age = 21;
        assertTrue(license.age >= 18);
        
        
    }
    
    @Test
    void testFinancePooling(){
        Finance finance = new Finance();
        finance.poolingOfFunds(1000);
        assertDoesNotThrow(()->finance.poolingOfFunds(500));
        
    }
    
    @Test
    void testExamination(){
        Examination exam = new Examination();
        exam.name = "A";
        assertNull(exam.getSignature());
    }
}
