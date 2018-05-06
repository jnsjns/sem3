/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Handles customer part of the sale, what is paid and what is to be returned to
 *  the customer in form of change.
 * @author Jonas
 */
public class Payment {
    private final int paidAmount;
    
    public Payment(int paidAmount){
        this.paidAmount = paidAmount;
    }
    
    public int getPayment(){
        return this.paidAmount;
    }
    /**
     * Calculates the change by subtracting the total price from the paid amount.
     * @param totalPrice The total price to pay for the sale. 
     * @param paidAmount The amount paid by the customer.
     * @return the result of the subtraction.
     */
    public double calculateChange(double totalPrice, int paidAmount){
        return (paidAmount - totalPrice);
    }
}
