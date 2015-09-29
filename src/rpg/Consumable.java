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
public class Consumable extends Item {
    private int count;
    public Consumable(String name, String des, int count){
        super(name, des);
        this.count = count;
    }
}
