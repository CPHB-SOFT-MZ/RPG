/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author mzhje_000
 */
public class Armor extends Item {
    private int armorVal;
    
    public Armor(String name, String des, int armorVal){
        super(name, des);
        this.armorVal = armorVal;
    }

    public int getArmorVal() {
        return armorVal;
    }

    public void setArmorVal(int armorVal) {
        this.armorVal = armorVal;
    }

    
    
    
    
}
