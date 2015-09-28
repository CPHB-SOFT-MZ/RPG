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
public class Player {
    private int currentRoom;
    
    public Player(){
        currentRoom = 0;
    }
    
    public int getCurrentRoom(){
        return currentRoom;
    }
    
}
