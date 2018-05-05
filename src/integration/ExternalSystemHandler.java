/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import model.Sale;


/**
 *
 * @author Jonas
 */
public class ExternalSystemHandler {
    private final ItemRegistry itemReg = new ItemRegistry();
    
    public ItemRegistry getItemRegistry(){
        return itemReg;
    }
    
    public ItemDTO getItem(int ItemId){
        ItemDTO item = itemReg.getItem(ItemId);
        return item;
    }
    
    public void logSale(Sale sale){
        
    }
    
}
