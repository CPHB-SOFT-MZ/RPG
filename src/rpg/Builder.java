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
        
        Room room0 = new Room(0, "Starting room", 1, 0, 0, 0);
        rooms.add(room0);
        Room room1 = new Room(1, "Second room", 2, 0, 3, 4);
        rooms.add(room1);
        Room room2 = new Room(2, "Third room", 2, 1, 2, 2);
        rooms.add(room2);
        
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
