/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 *
 * @author Jonas
 */
public class ExternalSystemHandler {
    private ItemRegistry itemReg = new ItemRegistry();
    
    public ItemRegistry getItemRegistry(){
        return itemReg;
    }
    
    public ItemDTO getItem(int ItemId){
        ItemDTO item = itemReg.getItem(ItemId);
        return item;
    }
    
}