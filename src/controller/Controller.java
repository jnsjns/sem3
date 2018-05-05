package controller;

import integration.ExternalSystemHandler;
import integration.ItemDTO;
import integration.ItemRegistry;
import model.Payment;
import model.Sale;

/**
 * This is the application's only controller. All calls to the model pass through here.
 */
public class Controller {
    private Sale sale;
    private final ItemRegistry itemRegistry;
    private final ExternalSystemHandler exHandler;
    
    public Controller(ExternalSystemHandler exHandler){
        this.exHandler = new ExternalSystemHandler();
        this.itemRegistry = exHandler.getItemRegistry();
    }
    
    /**
     * Creates an empty instance of {@link Sale}, which will be used for all information regarding
     * the sale that is now started.
     */
    public void startSale() {
        sale = new Sale();
    }
    
    public String addItem(int itemId){
        ItemDTO item = itemRegistry.getItem(itemId);
        String saleInfo = sale.addItem(item);
        return saleInfo;
    }
    
    public double completeSale(){
        return sale.completeSale();
    }
    
    public void enterPaidAmount(int paidAmount){
        Payment payment = new Payment(paidAmount);
        sale.pay(payment);
        exHandler.logSale(sale);
    }
}
