/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;


/**
 * Handles all the calls to external systems and databases.
 * @author Jonas
 */
public class ExternalSystemHandler {
    private final ItemRegistry itemReg = new ItemRegistry();

    public ItemRegistry getItemRegistry(){
        return itemReg;
    }
    /**
     * Fetches a wanted item from the (@link ItemRegistry)
     * @param ItemId the Id of the item searcged for.
     * @return the item found.
     */
    public ItemDTO getItem(int ItemId){
        ItemDTO item = itemReg.getItem(ItemId);
        return item;
    }
    
    /**
     * Will contain calls to external systems when they are implemented. Does
     * nothing for now.
     * @param saleInfo a string containing the current sale information.
     */
    public void logSale(String saleInfo){
        
    }
    
}
