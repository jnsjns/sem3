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
public class Payment {
    private final int paidAmount;
    
    public Payment(int paidAmount){
        this.paidAmount = paidAmount;
    }
    
    public int getPayment(){
        return this.paidAmount;
    }
    
    public double calculateChange(double totalPrice, int paidAmount){
        return (paidAmount - totalPrice);
    }
}
