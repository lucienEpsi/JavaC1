/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcul;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 33676
 */
public class CalculatriceTest {
    
    public CalculatriceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addition method, of class Calculatrice.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        int a = 15;
        int b = 5;
        Calculatrice instance = new Calculatrice();
        int expResult = 20;
        int result = instance.addition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of soustraction method, of class Calculatrice.
     */
    @Test
    public void testSoustraction() {
        System.out.println("soustraction");
        int a = 15;
        int b = 5;
        Calculatrice instance = new Calculatrice();
        //oracle 
        int expResult = 10;
        int result = instance.soustraction(a, b);
        assertEquals("soustraction",expResult, result);
        
    }

    /**
     * Test of multiplication method, of class Calculatrice.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        int a = 15;
        int b = 5;
        Calculatrice instance = new Calculatrice();
        int expResult = 75;
        int result = instance.multiplication(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculatrice.
     */
    @Test
    public void testDivision() {
        try {
            System.out.println("division");
            int a = 10;
            int b = 5;
            Calculatrice instance = new Calculatrice();
            int expResult = 2;
            int result = instance.division(a, b);
            assertEquals(expResult, result);
        } catch (Exception ex) {
            Logger.getLogger(CalculatriceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Test(expected = calcul.MonException.class)
    public void testDivisionParZero() throws MonException {
        
            System.out.println("division");
            int a = 10;
            int b = 0;
            Calculatrice instance = new Calculatrice();
            int expResult = 2;
            int result = instance.division(a, b);
            //assertEquals(expResult, result);
        
        
    }

    /**
     * Test of division method, of class Calculatrice.
     */
    @Test
    public void testDivisionEntiere() {
        try {
            System.out.println("division entiere");
            int a = 10;
            int b = 3;
            Calculatrice instance = new Calculatrice();
            double expResult = 3;
            int result = instance.division(a, b);
            assertEquals(expResult, result, 0.0);
        } catch (Exception ex) {
            Logger.getLogger(CalculatriceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @Test
    public void testDivisionDouble() {
        System.out.println("division entiere");
        double a = 10.0;
        double b = 3;
        Calculatrice instance = new Calculatrice();
        double expResult = 3.333;
        double result = instance.division(a, b);
        assertEquals(expResult, result,0.333);
        
    }

    /**
     * Test of addition method, of class Calculatrice.
     */
    @Test
    public void testAddition_double_double() {
        System.out.println("addition avec double");
        double a = 5.0;
        double b = 5.0;
        Calculatrice instance = new Calculatrice();
        double expResult = 10.0;
        double result = instance.addition(a, b);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of addition method, of class Calculatrice.
     */
    @Test
    public void testAddition_int_int() {
        System.out.println("addition");
        int a = 0;
        int b = 0;
        Calculatrice instance = new Calculatrice();
        int expResult = 0;
        int result = instance.addition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculatrice.
     */
    @Test
    public void testDivision_int_int() throws Exception {
        System.out.println("division");
        int a = 0;
        int b = 0;
        Calculatrice instance = new Calculatrice();
        int expResult = 0;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculatrice.
     */
    @Test
    public void testDivision_double_double() {
        System.out.println("division");
        double a = 0.0;
        double b = 0.0;
        Calculatrice instance = new Calculatrice();
        double expResult = 0.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
