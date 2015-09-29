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
    //Make currentRoom an object
    private Room currentRoom;
    
    public Player(){
        
    }
    
    public Room getCurrentRoom(){
        return currentRoom;
    }
    
    public void setCurrentRoom(Room room){
        currentRoom = room;
    }
    
}
