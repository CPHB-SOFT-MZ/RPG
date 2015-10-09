/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.Random;

/**
 *
 * @author Emil Laptop
 */
public class Enemy {
    Random rnd = new Random();
    private final String name;
    private final String description;
    private final int dmgMin;
    private final int dmgMax;
    private int HP;
    private int dmgActual;

    public Enemy(String name, String description, int dmgMin, int dmgMax, int HP) {
        this.name = name;
        this.description = description;
        this.dmgMin = dmgMin;
        this.dmgMax = dmgMax;
        this.HP = HP;
       
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDmgMin() {
        return dmgMin;
    }

    public int getDmgMax() {
        return dmgMax;
    }

    public int getHP() {
        return HP;
    }
    
    public void setHP(int hp){
        this.HP = this.HP - hp;
    }
    
    public int getDmgActual(){
        this.dmgActual = rnd.nextInt((dmgMax + 1) - dmgMin) + dmgMin;
        return dmgActual;
    }
    
    
    
}
