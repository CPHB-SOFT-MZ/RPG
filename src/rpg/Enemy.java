/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author Emil Laptop
 */
public class Enemy {
    
    private String name;
    private String description;
    private int dmgMin;
    private int dmgmax;
    private int HP;

    public Enemy(String name, String description, int dmgMin, int dmgmax, int HP) {
        this.name = name;
        this.description = description;
        this.dmgMin = dmgMin;
        this.dmgmax = dmgmax;
        this.HP = HP;
    }
    
}
