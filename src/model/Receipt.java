/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
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
    
    public String createPrintableReceipt(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\nThanks for shopping at POS \n\n");
        stringBuilder.append(saleTime + "\n");        
        for(OrderLine orderLine : orderLines){
            stringBuilder.append(orderLine.getName() + "        " + orderLine.getPrice() + "\n");
        }
        stringBuilder.append("-----------------------" + "\n");
        stringBuilder.append("Total price: " + totalPrice + "\n");
        stringBuilder.append("Total price after tax: " + totalPriceAfterTax + "\n");
        stringBuilder.append("Total paid: " + payment + "\n");
        stringBuilder.append("Change: " + change + "\n");
        return stringBuilder.toString();
    }
}
