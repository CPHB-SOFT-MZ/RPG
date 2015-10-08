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
        rooms.get(0).setRoomDesc("The room is narrow, one exit is blocked by fallen rocks, some light shines thorugh.");
        rooms.get(0).addItem(new Weapon("Short Sword", "A short one", 4, 6));
        rooms.get(0).addItem(new Consumable("Potion", "Heals up to full HP"));
        
        // First
        rooms.get(1).setEast(rooms.get(2));
        rooms.get(1).setWest(rooms.get(3));
        rooms.get(1).setSouth(rooms.get(0));
        rooms.get(1).setRoomDesc("A big hall opens in front of you, it's run down and dark but serveral doors lead to other rooms.");
        
        
        // Second 
        rooms.get(2).setEast(rooms.get(4));
        rooms.get(2).setWest(rooms.get(1));
        rooms.get(2).setRoomDesc("The room is full of rusty old equipment and was problably used for storage, there is a door at the other end.");
        rooms.get(2).addEnemy(new Enemy("Skeleton", "A tiny one", 1, 3, 12));
        rooms.get(2).addItem(new Consumable("Potion", "Heals up to full HP"));
        
        //Third
        rooms.get(3).setNorth(rooms.get(10));
        rooms.get(3).setEast(rooms.get(1));
        rooms.get(3).setRoomDesc("Most of the celing has caved in, but it is still possible to reach another door.");
        
        //Room 4
        rooms.get(4).setNorth(rooms.get(5));
        rooms.get(4).setWest(rooms.get(2));
        rooms.get(4).setRoomDesc("The floor resembles a small lake, here the air stinks of mould.");
        
        //Room 5
        rooms.get(5).setSouth(rooms.get(4));
        rooms.get(5).setEast(rooms.get(6));
        rooms.get(5).setWest(rooms.get(8));
        rooms.get(5).addEnemy(new Enemy("Dwarf", "A red-eyed dwarf. Looks pretty scary.", 3, 6, 16));
        rooms.get(5).setRoomDesc("There is nothing of interest here. Two doors lead deeper into the mine.");
        
        //Room 6
        rooms.get(6).setSouth(rooms.get(7));
        rooms.get(6).setWest(rooms.get(5));
        rooms.get(6).setRoomDesc("This room is in remarkable condition, and is full of comfortable chairs.");
        
        //Room 7
        rooms.get(7).setNorth(rooms.get(6));
        rooms.get(7).setRoomDesc("This room has no other exits, it is however full of things.");
        rooms.get(7).addItem(new Consumable("DoomKey","A Key ingraved with a skull"));
        rooms.get(7).addEnemy(new Enemy("Skeleton", "A tiny one", 3, 5, 20));
        rooms.get(7).addItem(new Valuables("Ruby", "Shining bright lika a.... Or... Almost like a diamond", 200));
        rooms.get(7).addItem(new Weapon("Long Sword", "A loooooooooooooooooooooooooooooooong sword", 8, 12));
        //Room 8
        rooms.get(8).setNorth(rooms.get(9));
        rooms.get(8).setSouth(rooms.get(2));
        rooms.get(8).setEast(rooms.get(5));
        rooms.get(8).setRoomDesc("Here the floor is completely red, there is a door on one side and a hole leading down into antoher room.");
        
        //Room 9
        rooms.get(9).setSouth(rooms.get(8));
        rooms.get(9).setWest(rooms.get(11));
        rooms.get(9).setRoomDesc("This room is a dead end, but a shaft leads somewhere");
        rooms.get(9).addEnemy(new Enemy("Skeleton", "A tiny one", 3, 5, 20));
        rooms.get(9).addItem(new Valuables("Ruby", "Shining bright lika a.... Or... Almost like a diamond", 200));
        
        //Room 10
        rooms.get(10).setNorth(rooms.get(13));
        rooms.get(10).setSouth(rooms.get(3));
        rooms.get(10).setEast(rooms.get(11));
        rooms.get(10).setWest(rooms.get(12));
        rooms.get(10).setRoomDesc("There is doors on all sides, some old signs read exit and kitchen, but you can't tell where they used to point.");
        rooms.get(10).addEnemy(new Enemy("Skeleton", "A tiny one", 4, 6, 24));
        
        //Room 11
        rooms.get(11).setWest(rooms.get(10));
        rooms.get(11).setRoomDesc("This room is empty, a big hole in the celing connects it to another room.");
        
        //Room 12
        rooms.get(12).setEast(rooms.get(10));
        rooms.get(12).setWest(rooms.get(16));
        rooms.get(12).setRoomDesc("This long room is empty and appears to work as a connection to another part of the mine.");
        
        //Room 13
        rooms.get(13).setSouth(rooms.get(10));
        rooms.get(13).setEast(rooms.get(14));
        rooms.get(13).setRoomDesc("The room is full of old minecarts, they are all rusty and broken.");
        
        //Room 14
        rooms.get(14).setWest(rooms.get(13));
        rooms.get(14).setSouth(rooms.get(1));
        rooms.get(14).setRoomDesc("The room is dominated by a big door, a tunnel leads down somewhere unknown.");
        
        //Room 15
        rooms.get(15).setSouth(rooms.get(14));
        rooms.get(15).setRoomDesc("The room is full of torture devices and miscellaneous items.");
        rooms.get(15).addItem(new Consumable("GoldKey","A key made of pure gold."));
        rooms.get(15).addEnemy(new Enemy("Skeleton", "A tiny one", 6, 10, 38));
        rooms.get(15).addItem(new Valuables("Ruby", "Shining bright lika a.... Or... Almost like a diamond", 200));
        rooms.get(15).addItem(new Consumable("Potion", "Heals up to full HP"));
        rooms.get(15).addItem(new Weapon("Skull Cleaver", "Cleaves skulls wide open", 13, 17));
        
        
        //Room 16
        rooms.get(16).setEast(rooms.get(12));
        rooms.get(16).setRoomDesc("The walls here are full of hangers but nothing is left behind. The northern door requires a key.");
        rooms.get(16).addItem(new Consumable("GoldKey","A Key ingraved with a skull"));
        
        //Room 17
        rooms.get(17).setNorth(rooms.get(18));
        rooms.get(17).setSouth(rooms.get(16));
        rooms.get(17).setRoomDesc("Most of the celing is caved in, the northern door is open.");
        
        //Room 18
        rooms.get(18).setSouth(rooms.get(17));
        rooms.get(18).setRoomDesc("18 riddle");
        rooms.get(18).addItem(new Valuables("Pearl", "A shiny small pearl", 50));
        
        // Room 19
        rooms.get(19).setEast(rooms.get(17));
        rooms.get(19).setWest(rooms.get(20));
        rooms.get(19).setRoomDesc("Last boss room 19");
        rooms.get(19).addEnemy(new Enemy("Tobias", "", 15, 20, 120));
        rooms.get(19).addItem(new Valuables("Pearl", "A shiny small pearl", 50));
        
        //Room 20
        rooms.get(20).setRoomDesc("You have reached the final room, a golden treasure chest sits on the floor.");
        rooms.get(20).addItem(new Valuables("Silver Necklace", "Shining bright", 800));
        rooms.get(20).addItem(new Valuables("Huge Treasure Chest", "Filled with poo and gold coins", 2000));
        
    }
    
    public Room getRoom(int i){
        return rooms.get(i);
    }

    public void useKey(int curRoom, int unlockRoom, String direction) {
        switch(direction){
            case "north":
               rooms.get(curRoom).setNorth(rooms.get(unlockRoom)); 
                break;
            case "south":
               rooms.get(curRoom).setSouth(rooms.get(unlockRoom)); 
                break;
            case "east":
               rooms.get(curRoom).setEast(rooms.get(unlockRoom)); 
                break;
            case "west":
               rooms.get(curRoom).setWest(rooms.get(unlockRoom));
                break;
            default:
                System.out.println("Error");
                break;
        }

    }
    
    
    

}
