/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.hogk.sem3.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Creates the receipt that is to be printed be the (@link Printer)
 * @author Jonas
 */
public class Receipt {
    private final LocalDateTime saleTime;
    private final List<OrderLine> orderLines;
    private final int payment;
    private final int totalPrice;
    private final double totalPriceAfterTax;
    private final double change;
    
    public Receipt(Sale sale, Payment payment, double change){
        this.saleTime = sale.getSaleTime();
        this.orderLines = sale.getOrderLines();
        this.totalPrice = sale.getTotalPrice();
        this.totalPriceAfterTax = sale.getTotalPriceAfterTax();
        this.payment = payment.getPayment();
        this.change = change;
    }
    
    /**
     * Creates the format of the receipt and stores it in a string.
     * @return the string created.
     */
    public String createPrintableReceipt(){
        StringBuilder stringBuilder = new StringBuilder()
                .append("\n\nThanks for shopping at POS \n\n")
                .append(saleTime + "\n");

        for (OrderLine orderLine : orderLines) {
            stringBuilder.append(orderLine.getName())
                    .append("        ")
                    .append(orderLine.getPrice())
                    .append("\n");      
        }

        stringBuilder.append("-----------------------\n")
                .append("Total price: " + totalPrice + "\n")
                .append("Total price after tax: " + totalPriceAfterTax + "\n")
                .append("Total paid: " + payment + "\n")
                .append("Change: " + change + "\n");
        return stringBuilder.toString();
    }
}
