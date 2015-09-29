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
    // Make North, South, East, West as an object instead of int.
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    //public ArrayList<String> items = new ArrayList<>();
    
    
    
    public Room(int number, String name
            /*, ArrayList<String> items*/){
        roomNumber = number;
        roomName = name;
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
    
    public void setSouth(Room room){
        this.south = room;
    }
    public Room getSouth(){
        return this.south;
    }
    
    public void setNorth(Room room){
        this.north = room;
    }
    public Room getNorth(){
        return this.north;
    }
    
    public void setEast(Room room){
        this.east = room;
    }
    public Room getEast(){
        return this.east;
    }
    
    public void setWest(Room room){
        this.west = room;
    }
    public Room getWest(){
        return this.west;
    }
    
    
    
    /*public void setItems(String item){
        this.items.add(item);
    }
    
    public ArrayList<String> getItems(){
        return this.items;
    }*/

}
