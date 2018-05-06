package model;

import integration.ItemDTO;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Collects all information regarding a particular sale.
 */
public class Sale {
    private LocalDateTime saleTime;
    private int runningTotal;
    private int itemPrice;
    private double totalPrice;
    private String itemName;
    private String saleInfo;
    private List<OrderLine> orderLines;
    private static final double TAX_PERCENTAGE = 15;
    
    
    /**
     * Creates a new instance, and records the time it was created. This will be the time recorded
     * on the receipt. A list of order lines is also created.
     */
    public Sale() {
        saleTime = LocalDateTime.now();  
        this.orderLines = new ArrayList<OrderLine>();
    }
    /**
     * Saves an item to the sale and updates the <code>runningTotal</code>.
     * @param item The item that is to be added to the sale.
     * @return A string of the current sale information to be displayed by the view
     */
    public String addItem(ItemDTO item){
        itemName = item.getName(item);
        itemPrice = item.getPrice(item);
        runningTotal = runningTotal + itemPrice;
        createOrderLine(itemName, itemPrice);
        saleInfo = buildString();
        return saleInfo;
    }
    
    /**
     * Creates a new order line in the order lines list.
     * @param name The name of the item to be added to the list.
     * @param price The price of the item to be added to the list.
     */
    public void createOrderLine(String name, int price){
        OrderLine orderLine = new OrderLine(name, price);
        orderLines.add(orderLine);
    }
    
    /**
     * Build the string that is sent to view to be displayed. Goes through the
     * list of orders and adds them all to a string.
     * @return a string containing current sale information.
     */  
    public String buildString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sale Information \n");
        for(OrderLine orderLine : orderLines){
            stringBuilder.append("Name: " + orderLine.getName() + "  Price: " + orderLine.getPrice() + "\n");
        }
        stringBuilder.append("\nRunning Total: " + runningTotal + "\n");
        return stringBuilder.toString();         
    }
    
    /**
     * Finalizes the sale. Calculates the tax of the sale.
     * @return A double containing the new price after tax.
     */
    public double completeSale(){
        return calculateTax();
    }
    
    /**
     * Multiplies the <code>runningTotal</code> with <code>TAX_PERCENTAGE</code>
     * and returns a new price after tax.
     * @return The result of the multiplication.
     */
    public double calculateTax(){
        return totalPrice = ((double)runningTotal * (1+TAX_PERCENTAGE/100));    
    }
    
    /**
     * Uses a (@link Payment) to calculate change to be given to customer. A (@link Receipt)
     * is created and printed by the (@link Printer)
     * @param payment the amount paid by the customer.
     */
    public void pay(Payment payment){
       double change = payment.calculateChange(totalPrice, payment.getPayment());
       Receipt receipt = new Receipt(this, payment, change);
       Printer printer = new Printer(receipt.createPrintableReceipt());
       printer.printReceipt();
    }
    
    public LocalDateTime getSaleTime(){
        return this.saleTime;
    }
    public List getOrderLines(){
        return this.orderLines;
    }
    
    public int getTotalPrice(){
        return this.runningTotal;
    }
    
    public double getTotalPriceAfterTax(){
        return this.totalPrice;
    }
    
    public String getSaleInfo(){
        return this.saleInfo;
    }

}
