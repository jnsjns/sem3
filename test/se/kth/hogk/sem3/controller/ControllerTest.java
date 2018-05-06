/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.hogk.sem3.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonas
 */
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of startSale method, of class Controller.
     */
    @Test
    public void testStartSale() {
        System.out.println("startSale");
        Controller instance = null;
        instance.startSale();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItem method, of class Controller.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        int itemId = 0;
        Controller instance = null;
        String expResult = "";
        String result = instance.addItem(itemId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completeSale method, of class Controller.
     */
    @Test
    public void testCompleteSale() {
        System.out.println("completeSale");
        Controller instance = null;
        double expResult = 0.0;
        double result = instance.completeSale();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enterPaidAmount method, of class Controller.
     */
    @Test
    public void testEnterPaidAmount() {
        System.out.println("enterPaidAmount");
        int paidAmount = 0;
        Controller instance = null;
        instance.enterPaidAmount(paidAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
