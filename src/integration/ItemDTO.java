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
public final class ItemDTO {
    private final int id;
    private final String name;
    private final int price;
    
    public ItemDTO(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public int GetId(ItemDTO item){
        return this.id;
    }
    
}
