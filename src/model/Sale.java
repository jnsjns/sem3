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
    private String itemName;
    private String saleInfo;
    private List<OrderLine> orderLines;
    
    
    /**
     * Creates a new instance, and records the time it was created. This will be the time recorded
     * on the receipt.
     */
    public Sale() {
        saleTime = LocalDateTime.now();  
        this.orderLines = new ArrayList<OrderLine>();
    }
    
    public String addItem(ItemDTO item){
        itemName = item.getName(item);
        itemPrice = item.getPrice(item);
        runningTotal = runningTotal + itemPrice;
        createOrderLine(itemName, itemPrice);
        saleInfo = buildString();
        return saleInfo;
    }
    
    public void createOrderLine(String name, int price){
        OrderLine orderLine = new OrderLine(name, price);
        orderLines.add(orderLine);
    }
    
    public String buildString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sale Information \n");
        for(OrderLine orderLine : orderLines){
            stringBuilder.append("Name: " + orderLine.getName() + "  Price: " + orderLine.getPrice() + "\n");
        }
        stringBuilder.append("\nRunning Total: " + runningTotal);
        return stringBuilder.toString();         
    }
    
    

}
