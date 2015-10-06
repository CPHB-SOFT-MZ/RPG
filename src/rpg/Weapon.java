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
public class Weapon extends Item {
    private int maxDmg, minDmg;
    
    public Weapon(String name, String des, int minDmg, int maxDmg){
        super(name, des);
        this.maxDmg = maxDmg;
        this.minDmg = minDmg;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    public int getMinDmg() {
        return minDmg;
    }

    public void setMaxDmg(int maxDmg) {
        this.maxDmg = maxDmg;
    }

    public void setMinDmg(int minDmg) {
        this.minDmg = minDmg;
    }
}
