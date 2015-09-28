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
    //WEEEEEEEEEEE
    public static void main(String[] args) {

        Builder build = new Builder();
        Scanner scan = new  Scanner(System.in);
        Player player = new Player();
        String command = "";
        String value = "";
        boolean playing = true;
        Room currentRoom;
        
        
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
                    if(value.equals("south")){
                        currentRoom = build.getRoom(player.getCurrentRoom());
                        System.out.println(currentRoom.getRoomName());
                        
                    }else{
                        System.out.println("You want to go where?");
                    }
                    break;
                case "take":
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
