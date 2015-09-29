/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.ArrayList;

/**
 *
 * @author mzhje_000
 */
public class Player {
    private ArrayList<Item> inventory;
    
    public Player(){
        inventory = new ArrayList<Item>();
    }
    
    public void addItem(Item item){
        inventory.add(item);
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
    
    
    
}
