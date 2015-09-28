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
public class Room {
    private int roomNumber;
    private String roomName;
    private String roomDescription;
    public ArrayList<String> items = new ArrayList<>();
    
    
    
    public Room(int number, String description, String name
            /*, ArrayList<String> items*/){
        roomNumber = number;
        roomName = name;
        roomDescription = description;
    }
    
    public void setRoomNumber(int number){
        this.roomNumber = number;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    
    public void setRoomDesc(String description){
        this.roomDescription = description;
    }
    public String getRoomDesc(){
        return roomDescription;
    }
    
    public void setRoomName(String name){
        this.roomName = name;
    }
    public String getRoomName(){
        return roomName;
    }
    
    /*public void setItems(String item){
        this.items.add(item);
    }
    
    public ArrayList<String> getItems(){
        return this.items;
    }*/

}
