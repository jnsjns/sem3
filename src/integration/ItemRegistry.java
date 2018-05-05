/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonas
 */
public class ItemRegistry {
    private List<ItemDTO> items = new ArrayList<>();
    
    ItemRegistry(){
        addItems();
    }
    
    public ItemDTO getItem(int itemId){
        for(ItemDTO item : items){
            if (item.getId(item) == itemId){
                return item;
            }
        }
        return null;
    }
    
    private void addItems(){
        items.add(new ItemDTO(1, "banana", 20));
        items.add(new ItemDTO(2, "tomato", 59));
        items.add(new ItemDTO(3, "orange juice", 15));
        items.add(new ItemDTO(4, "ice cream", 28));
    }
    
    
}
