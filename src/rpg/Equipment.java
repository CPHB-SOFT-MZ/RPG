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
public class Equipment extends Item{
    private int dmgMin;
    private int dmgMax;
    
    public Equipment(String name, String des, int dmgMin, int dmgMax){
        super(name, des);
        this.dmgMin = dmgMin;
        this.dmgMax = dmgMax;
        
    }
}
