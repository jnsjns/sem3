/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jonas
 */
public class Printer {
    private final String stringToPrint;
    
    public Printer(String stringToPrint){
        this.stringToPrint = stringToPrint;
    }
    
    public void printReceipt(){
        System.out.println(stringToPrint);
    }
}
