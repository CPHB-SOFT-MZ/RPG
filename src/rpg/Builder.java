/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.*;

/**
 *
 * @author mzhje_000
 */
public class Builder {
        private List<Room> rooms = new ArrayList();
    
    public Builder() {
        
        /*List<String> descriptions = new ArrayList();
        List<String> titles = new ArrayList();*/
        // N S E W
        rooms.add(new Room(0, "Starting room", 1, 0, 0, 0));
        
        rooms.add(new Room(1, "Starting room", 1, 0, 2, 3));
        
        rooms.add(new Room(2, "Starting room", 2, 2, 4, 1));
        
        rooms.add(new Room(3, "Starting room", 10, 3, 1, 3));
        
        rooms.add(new Room(4, "Starting room", 5, 4, 4, 2));
        
        rooms.add(new Room(5, "Starting room", 5, 4, 6, 8));
        
        rooms.add(new Room(6, "Starting room", 6, 7, 6, 5));
        
        rooms.add(new Room(7, "Starting room", 6, 7, 7, 7));
        
        rooms.add(new Room(8, "Starting room", 9, 2, 5, 8));
        
        rooms.add(new Room(9, "Starting room", 9, 8, 9, 11));
        
        rooms.add(new Room(10, "Starting room", 13, 3, 11, 12));
        
        rooms.add(new Room(11, "Starting room", 11, 11, 11, 10));
        
        rooms.add(new Room(12, "Starting room", 12, 12, 10, 16));
        
        rooms.add(new Room(13, "Starting room", 13, 10, 14, 13));
        
        rooms.add(new Room(14, "Starting room", 14, 1, 14, 13));
        
        rooms.add(new Room(15, "Starting room", 15, 14, 15, 15));
        
        rooms.add(new Room(16, "Starting room", 16, 16, 12, 16));
        
        rooms.add(new Room(17, "Starting room", 18, 16, 17, 17));
        
        rooms.add(new Room(18, "Starting room", 18, 17, 18, 18));
        
        rooms.add(new Room(19, "Starting room", 19, 19, 19, 20));
        
        rooms.add(new Room(20, "Starting room", 20, 20, 20, 20));
    }
    
    public Room getRoom(int i){
        return rooms.get(i);
    }
    
    
    

}
