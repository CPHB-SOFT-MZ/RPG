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
    private final int north;
    private final int south;
    private final int east;
    private final int west;
    //public ArrayList<String> items = new ArrayList<>();
    
    
    
    public Room(int number, String name, int north, int south, int east, int west
            /*, ArrayList<String> items*/){
        roomNumber = number;
        roomName = name;
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
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
    
    public boolean getNorth(){
        if(north != roomNumber){
            return true;
        }
        return false;
    }
    
    public boolean getSouth(){
        if(south != roomNumber){
            return true;
        }
        return false;
    }
    public boolean getEast(){
        if(east != roomNumber){
            return true;
        }
        return false;
    }
    public boolean checkWest(){
        if(west != roomNumber){
            return true;
        }
        return false;
    }
    
    /*public void setItems(String item){
        this.items.add(item);
    }
    
    public ArrayList<String> getItems(){
        return this.items;
    }*/

}
