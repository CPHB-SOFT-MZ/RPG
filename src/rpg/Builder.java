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

    
    public Builder(int numberOfRooms) {
        List<Room> rooms = new ArrayList();
        List<String> descriptions = new ArrayList();
        List<String> titles = new ArrayList();
        
        titles.add(0,"Room no. 1");
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
        }
        
        
      
        
    }
    
    
    

}
