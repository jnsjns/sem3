/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.hogk.sem3.integration;

/**
 * Prints the receipt.
 * @author Jonas
 */
public class Printer {
    
    public Printer(){
        
    }
    
    /**
     * Prints a string that is created by the (@link Receipt).
     */
    public void printReceipt(String stringToPrint){
        System.out.println(stringToPrint);
    }
}
