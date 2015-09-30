/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.Scanner;

/**
 *
 * @author mzhje_000
 */
public class RPG {

    /**
     * @param args the command line arguments
     */
    
    // HEJSA!
    //WEEEEEEEEEEEEEEEEEEEE
    public static void main(String[] args) {

        Builder build = new Builder();
        Scanner scan = new  Scanner(System.in);
        Player player = new Player();
        String command;
        String value = "";
        String error;
        boolean playing = true;
        Room currentRoom;
        currentRoom = build.getRoom(0);
        
        
        while(playing){
            String input = scan.nextLine();
            String[] data = input.split(" ");

            if(data.length == 2){
                command = data[0];
                value = data[1];
            }else{
                command = data[0];
            }
            
            switch(command){
                case "help":
                    break;
                case "go":
                    error = "I can't go that way";
                    switch (value) {
                        case "south":
                            if(currentRoom.getSouth() != null){
                                currentRoom = currentRoom.getSouth();
                                System.out.println("You pass though a door. " + currentRoom.getRoomDesc());
                            }else{
                                System.out.println(error);
                            }
                            break;
                        case "north":
                            if(currentRoom.getNorth() != null){
                                currentRoom = currentRoom.getNorth();
                                System.out.println("You pass though a door. " + currentRoom.getRoomDesc());
                            }else{
                                System.out.println(error);
                            }
                            break;
                        case "east":
                            if(currentRoom.getEast() != null){
                                currentRoom = currentRoom.getEast();
                                System.out.println("You pass though a door. " + currentRoom.getRoomDesc());
                            }else{
                                System.out.println(error);
                            }
                            break;
                        case "west":
                            if(currentRoom.getWest() != null){
                                currentRoom = currentRoom.getWest();
                                System.out.println("You pass though a door. " + currentRoom.getRoomDesc());
                            }else{
                                System.out.println(error);
                            }
                            break;
                        default:
                            System.out.println("You want to go where?");
                            break;
            }
            break;
                case "take":
                    if(currentRoom.getItems() != null){
                        for (Item item : currentRoom.getItems()) {
                            player.addItem(item);
                        }
                        currentRoom.removeItems();
                    }else{
                        System.out.println("There's nothing to pick up in this room");
                    }
                    
                    break;
                case "look":
                    break;
                case "use":
                    break;
                case "attack":                 
                    break;
                case "inventory":
                    break;
                case "quit":
                    break;
            }
        }
        
    }
    
}
