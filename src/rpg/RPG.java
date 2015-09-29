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
                            }else{
                                System.out.println(error);
                            }
                            break;
                        case "north":
                            if(currentRoom.getNorth() != null){
                                currentRoom = currentRoom.getNorth();
                            }else{
                                System.out.println(error);
                            }
                            break;
                        case "east":
                            if(currentRoom.getEast() != null){
                                currentRoom = currentRoom.getEast();
                            }else{
                                System.out.println(error);
                            }
                            break;
                        case "west":
                            if(currentRoom.getWest() != null){
                                currentRoom = currentRoom.getWest();
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
                    for (Item item : currentRoom.getItems()) {
                        player.addItem(item);
                    }
                    break;
                case "look":
                    break;
                case "use":
                    break;
                case "attack":                 
                    break;
                case "quit":
                    break;
            }
        }
        
    }
    
}
