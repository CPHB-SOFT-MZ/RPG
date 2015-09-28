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
        Room room0 = new Room(0, "Starting room", 1, 0, 0, 0);
        rooms.add(room0);
        
        Room room1 = new Room(1, "Starting room", 1, 0, 2, 3);
        rooms.add(room1);
        
        Room room2 = new Room(2, "Starting room", 2, 2, 4, 1);
        rooms.add(room2);
        
        Room room3 = new Room(3, "Starting room", 10, 3, 1, 3);
        rooms.add(room3);
        
        Room room4 = new Room(4, "Starting room", 5, 4, 4, 2);
        rooms.add(room4);
        
        Room room5 = new Room(5, "Starting room", 5, 4, 6, 8);
        rooms.add(room5);
        
        Room room6 = new Room(6, "Starting room", 6, 7, 6, 5);
        rooms.add(room6);
        
        Room room7 = new Room(7, "Starting room", 6, 7, 7, 7);
        rooms.add(room7);
        
        Room room8 = new Room(8, "Starting room", 9, 2, 5, 8);
        rooms.add(room8);
        
        Room room9 = new Room(9, "Starting room", 9, 8, 9, 11);
        rooms.add(room9);
        
        Room room10 = new Room(10, "Starting room", 13, 3, 11, 12);
        rooms.add(room10);
        
        Room room11 = new Room(11, "Starting room", 11, 11, 11, 10);
        rooms.add(room11);
        
        Room room12 = new Room(12, "Starting room", 12, 12, 10, 16);
        rooms.add(room12);
        
        Room room13 = new Room(13, "Starting room", 13, 10, 14, 13);
        rooms.add(room13);
        
        Room room14 = new Room(14, "Starting room", 14, 1, 14, 13);
        rooms.add(room14);
        
        Room room15 = new Room(15, "Starting room", 15, 14, 15, 15);
        rooms.add(room15);
        
        Room room16 = new Room(16, "Starting room", 16, 16, 12, 16);
        rooms.add(room16);
        
        Room room17 = new Room(17, "Starting room", 18, 16, 17, 17);
        rooms.add(room17);
        
        Room room18 = new Room(18, "Starting room", 18, 17, 18, 18);
        rooms.add(room18);
        
        Room room19 = new Room(19, "Starting room", 19, 19, 19, 20);
        rooms.add(room19);
        
        Room room20 = new Room(20, "Starting room", 20, 20, 20, 20);
        rooms.add(room20);
        
        
        //System.out.println(rooms.get(0));
        
        
        /*titles.add(0,"Room no. 1");
        descriptions.add(0, "Room no 1 feels cold");
        
        titles.add(1, "Room no. 2");
        descriptions.add(1, "Room no 2 feels warm");
        
        titles.add(2, "Room no. 3");
        descriptions.add(2, "Room no 3 feels slippery");
        
        titles.add(3, "Room no. 4");
        descriptions.add(3, "Room no 4 feels slippery");
        
        titles.add(4, "Room no. 5");
        descriptions.add(4, "Room no 5 feels slippery");
        

        for(int i = 0; i < titles.size(); i++){
            rooms.add(new Room(i, descriptions.get(i), titles.get(i)));  
            System.out.println(rooms.get(i).getRoomDesc());
        }*/
        
        
      
        
    }
    
    public Room getRoom(int i){
        return rooms.get(i);
    }
    
    
    

}
