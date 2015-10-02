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
    private String Name;
    private int Level;
    private int MaxHP = 30;
    private int CurHP = 30;
    private Weapon curWeapon;
    
    public Player(){
        inventory = new ArrayList<Item>();
    }
    
    public void addItem(Item item){
        inventory.add(item);
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public int getMaxHP() {
        return MaxHP;
    }

    public void setMaxHP(int MaxHP) {
        this.MaxHP = MaxHP;
    }

    public int getCurHP() {
        return CurHP;
    }

    public void setCurHP(int CurHP) {
        this.CurHP = CurHP;
    }
    
    public void setCurWeapon(Weapon weapon){
        this.curWeapon = weapon;
    }
    
    public Weapon getCurWeapon(){
        return curWeapon;
    }
    
    
    
}
