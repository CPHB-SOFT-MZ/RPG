/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mzhje_000
 */
public abstract class Item {
    
    private final String name;
    private final String description;

    
    public Item(String name, String des){
        this.name = name;
        this.description = des;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
    
}