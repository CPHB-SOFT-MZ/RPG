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
public class Builder {
        private List<Room> rooms = new ArrayList();
        private List<Item> items = new ArrayList();
    
    public Builder() {
        
        /*List<String> descriptions = new ArrayList();
        List<String> titles = new ArrayList();*/
        // N S E W
        
        rooms.add(new Room(0, "Starting room"));
        
        rooms.add(new Room(1, "Starting room"));
        
        rooms.add(new Room(2, "Starting room"));
        
        rooms.add(new Room(3, "Starting room"));
        
        rooms.add(new Room(4, "Starting room"));
        
        rooms.add(new Room(5, "Starting room"));
        
        rooms.add(new Room(6, "Starting room"));
        
        rooms.add(new Room(7, "Starting room"));
        
        rooms.add(new Room(8, "Starting room"));
        
        rooms.add(new Room(9, "Starting room"));
        
        rooms.add(new Room(10, "Starting room"));
        
        rooms.add(new Room(11, "Starting room"));
        
        rooms.add(new Room(12, "Starting room"));
        
        rooms.add(new Room(13, "Starting room"));
        
        rooms.add(new Room(14, "Starting room"));
        
        rooms.add(new Room(15, "Starting room"));
        
        rooms.add(new Room(16, "Starting room"));
        
        rooms.add(new Room(17, "Starting room"));
        
        rooms.add(new Room(18, "Starting room"));
        
        rooms.add(new Room(19, "Starting room"));
        
        rooms.add(new Room(20, "Starting room"));
        
        // Starting room
        rooms.get(0).setNorth(rooms.get(1));
        rooms.get(0).setRoomDesc("The room is narrow, one exit is blocked by fallen rocks, some light shines thorugh");
        rooms.get(0).addItem(new Equipment("Sword", "A long one", 3, 5));
        rooms.get(0).addItem(new Equipment("Dagger", "A short one", 1, 3));
        
        // First
        rooms.get(1).setEast(rooms.get(2));
        rooms.get(1).setWest(rooms.get(3));
        rooms.get(1).setSouth(rooms.get(0));
        
        // Second 
        rooms.get(2).setEast(rooms.get(4));
        rooms.get(2).setWest(rooms.get(1));
        
        //Third
        rooms.get(3).setNorth(rooms.get(10));
        rooms.get(3).setEast(rooms.get(1));
        
        //Room 4
        rooms.get(4).setNorth(rooms.get(5));
        rooms.get(4).setWest(rooms.get(2));
        
        //Room 5
        rooms.get(5).setSouth(rooms.get(4));
        rooms.get(5).setEast(rooms.get(6));
        rooms.get(5).setWest(rooms.get(8));
        
        //Room 6
        rooms.get(6).setSouth(rooms.get(7));
        rooms.get(6).setWest(rooms.get(5));
        
        //Room 7
        rooms.get(7).setNorth(rooms.get(6));
        rooms.get(7).addItem(new Consumable("DoomKey","A Key ingraved with a skull" , 1));
        
        //Room 8
        rooms.get(8).setNorth(rooms.get(9));
        rooms.get(8).setSouth(rooms.get(2));
        rooms.get(8).setEast(rooms.get(5));
        
        //Room 9
        rooms.get(9).setSouth(rooms.get(8));
        rooms.get(9).setWest(rooms.get(11));
        
        //Room 10
        rooms.get(10).setNorth(rooms.get(13));
        rooms.get(10).setSouth(rooms.get(3));
        rooms.get(10).setEast(rooms.get(11));
        rooms.get(10).setWest(rooms.get(12));
        
        //Room 11
        rooms.get(11).setWest(rooms.get(10));
        
        //Room 12
        rooms.get(12).setEast(rooms.get(10));
        rooms.get(12).setWest(rooms.get(16));
        
        //Room 13
        rooms.get(13).setSouth(rooms.get(10));
        rooms.get(13).setEast(rooms.get(14));
        
        //Room 14
        rooms.get(14).setWest(rooms.get(13));
        
        //Room 15
        rooms.get(15).setSouth(rooms.get(14));
        rooms.get(15).addItem(new Consumable("Old Bicycle Key", "Some ugly key", 1));
        
        //Room 16
        rooms.get(16).setEast(rooms.get(12));
        
        //Room 17
        rooms.get(17).setNorth(rooms.get(18));
        rooms.get(17).setSouth(rooms.get(16));
        
        //Room 18
        rooms.get(18).setSouth(rooms.get(17));
        
        // Room 19
        rooms.get(19).setEast(rooms.get(17));
        rooms.get(19).setWest(rooms.get(20));
    }
    
    public Room getRoom(int i){
        return rooms.get(i);
    }
    
    
    

}
