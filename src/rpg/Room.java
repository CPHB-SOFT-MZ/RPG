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
    private int north;
    private int south;
    private int east;
    private int west;
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
    
    public void setSouth(int i){
        this.south = i;
    }
    public int getSouth(){
        return this.south;
    }
    
    public void setNorth(int i){
        this.north = i;
    }
    public int getNorth(){
        return this.north;
    }
    
    public void setEast(int i){
        this.east = i;
    }
    public int getEast(){
        return this.east;
    }
    
    public void setWest(int i){
        this.west = i;
    }
    public int getWest(){
        return this.west;
    }
    
    
    
    /*public void setItems(String item){
        this.items.add(item);
    }
    
    public ArrayList<String> getItems(){
        return this.items;
    }*/

}
