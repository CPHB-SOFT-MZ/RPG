/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mzhje_000
 */
public class RPG {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        Builder build = new Builder();
        Player player = new Player();
        String command;
        String value = "";
        String error;
        boolean playing = true;
        Room currentRoom;
        currentRoom = build.getRoom(0);
        player.setCurWeapon(new Weapon("Dagger", "Short dagger", 1, 3));
        Random rnd = new Random();
        int maxDmg = player.getCurWeapon().getMaxDmg();
        int minDmg = player.getCurWeapon().getMinDmg();
        IO controller = new IO();
        Enemy enemy;
        Room prevRoom = null;
        boolean bound = false;
        
        while(playing){
            String input = controller.read();
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
                    error = "I can't go that way!";
                    

                    switch (value) {
                        case "south":
                            if(currentRoom.getSouth() != null && !bound){
                                prevRoom = currentRoom;
                                currentRoom = currentRoom.getSouth();
                                controller.writeLine(currentRoom.getRoomDesc());
                            }else{
                                controller.writeLine(error);
                            }
                            break;
                        case "north":
                            if(currentRoom.getNorth() != null && !bound){
                                prevRoom = currentRoom;
                                currentRoom = currentRoom.getNorth();
                                controller.writeLine(currentRoom.getRoomDesc());
                            }else{
                                controller.writeLine(error);
                            }
                            break;
                        case "east":
                            if(currentRoom.getEast() != null && !bound){
                                prevRoom = currentRoom;
                                currentRoom = currentRoom.getEast();
                                controller.writeLine(currentRoom.getRoomDesc());
                            }else{
                                controller.writeLine(error);
                            }
                            break;
                        case "west":
                            if(currentRoom.getWest() != null && !bound){
                                prevRoom = currentRoom;
                                currentRoom = currentRoom.getWest();
                                controller.writeLine(currentRoom.getRoomDesc());
                            }else{
                                controller.writeLine(error);
                            }
                            break;
                    
                        case "back":
                            if(bound){
                                controller.writeLine("You flee from the enemy and end up in the previous room.");
                                currentRoom = prevRoom;
                                bound = false;
                            }
                            break;
                        default:
                            controller.writeLine("You want to go where?");
                            break;
                    }

                if(currentRoom.getEnemy() != null){
                    bound = true;
                    enemy = currentRoom.getEnemy();
                    controller.writeLine("A " + enemy.getName() + " appears");
                    int enemyDmg = enemy.getDmgActual();
                    player.setCurHP(player.getCurHP()-enemyDmg);
                    controller.write("The " + enemy.getName() + " hits you for: " + enemyDmg);
                    controller.write("Your current HP: " + player.getCurHP());
                }else{
                    enemy = null;
                }
                break;
            
                case "take":
                    if(currentRoom.getItems() != null){
                        for (Item item : currentRoom.getItems()) {
                            player.addItem(item);
                        }
                       
                        currentRoom.removeItems();
                    }else{
                        controller.writeLine("There's nothing to pick up in this room");
                    }
                        for(int i = 0; i < player.getInventory().size(); i++){
                            Item item = player.getInventory().get(i);
                            if(item instanceof Weapon){
                                Weapon weapon = (Weapon) item;
                                if(weapon.getMaxDmg() > player.getCurWeapon().getMaxDmg()){
                                    player.setCurWeapon(weapon);
                                    minDmg = player.getCurWeapon().getMinDmg();
                                    maxDmg = player.getCurWeapon().getMaxDmg();
                                    
                                }
                            }
                        }                    
                    break;
                case "look":
                    break;
                case "use":
                    switch(value){
                        case "potion":
                            
                            if(player.getInventory().toString().contains("Potion") 
                                    && player.getCurHP() != player.getMaxHP()){
                                for(Item item : player.getInventory()){
                                    controller.write(item.getName());
                                    if(item.getName().equals("Potion")){
                                    if(item instanceof Consumable){
                                        Consumable consumable = (Consumable) item;
                                        player.setCurHP(player.getMaxHP());
                                        player.getInventory().remove(consumable);
                                        controller.writeLine("Jeg brugte en potion yay!");
                                        break;
                                    }
                                    }
                                }
                            }else{
                                controller.writeLine("You already have full HP."
                                        + " No reason to use a potion!");
                            }
                            break;
                        case "key":
                            break;
                        case "poison":
                            break;
                    }
                    break;
                case "attack":   
                    if(currentRoom.getEnemy() != null){
                        enemy = currentRoom.getEnemy();
                        int enemyDmg = enemy.getDmgActual();
                        player.setCurHP(player.getCurHP()-enemyDmg);
                        int playerDmg = rnd.nextInt((maxDmg + 1) - minDmg) + minDmg;
                       currentRoom.getEnemy().setHP(playerDmg);    
                        controller.writeLine("The " + enemy.getName() + " hit you for: " + enemyDmg);
                        controller.write("You dealt " + playerDmg + " damage to the " + enemy.getName());
                        controller.write("Your HP: " + player.getCurHP());
                        controller.write("Monster HP: " + enemy.getHP());
                        if(enemy.getHP() <= 0){
                            currentRoom.removeEnemy();
                            controller.writeLine("You killed the " + enemy.getName());
                        }
                    }else{
                        controller.writeLine("There's nothing to attack here");
                    }
                    
                    break;
                case "inventory":
                    controller.writeLine("Your inventory:");
                    for(Item item : player.getInventory()){
                        controller.write(item);
                    }
                    break;
                case "quit":
                    controller.writeLine("Goodbye noob...");
                    playing = false;
                    break;
            }
            if(player.getCurHP() <= 0){
                controller.writeLine("You've died. Game over!");
                playing = false;
            }
        }
        
    }
    
}
