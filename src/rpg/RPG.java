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
        Scanner scan = new  Scanner(System.in);
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
        IO out = new IO();
        Enemy enemy;

        
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
                    error = "I can't go that way!";
                    switch (value) {
                        case "south":
                            if(currentRoom.getSouth() != null){
                                currentRoom = currentRoom.getSouth();
                                System.out.println(currentRoom.getRoomDesc());
                            }else{
                                System.out.println(error);
                            }
                            break;
                        case "north":
                            if(currentRoom.getNorth() != null){
                                currentRoom = currentRoom.getNorth();
                                System.out.println(currentRoom.getRoomDesc());
                            }else{
                                System.out.println(error);
                            }
                            break;
                        case "east":
                            if(currentRoom.getEast() != null){
                                currentRoom = currentRoom.getEast();
                                System.out.println(currentRoom.getRoomDesc());
                            }else{
                                System.out.println(error);
                            }
                            break;
                        case "west":
                            if(currentRoom.getWest() != null){
                                currentRoom = currentRoom.getWest();
                                System.out.println(currentRoom.getRoomDesc());
                            }else{
                                System.out.println(error);
                            }
                            break;
                        default:
                            System.out.println("You want to go where?");
                            break;
                    }
            if(currentRoom.getEnemy() != null){
                enemy = currentRoom.getEnemy();
                System.out.println("A " + enemy.getName() + " appears");
                int enemyDmg = (int) Math.floor((Math.random() * enemy.getDmgMax()) + enemy.getDmgMin());
                player.setCurHP(player.getCurHP()-enemyDmg);
                System.out.println("The " + enemy.getName() + " hits you for: " + enemyDmg);
                System.out.println("Your current HP: " + player.getCurHP());
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
                        System.out.println("There's nothing to pick up in this room");
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
                                    System.out.println(item.getName());
                                    if(item.getName().equals("Potion")){
                                    if(item instanceof Consumable){
                                        Consumable consumable = (Consumable) item;
                                        player.setCurHP(player.getMaxHP());
                                        player.getInventory().remove(consumable);
                                        System.out.println("Jeg brugte en potion yay!");
                                        break;
                                    }
                                    }
                                }
                            }else{
                                System.out.println("You already have full HP."
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
                        System.out.println("The " + enemy.getName() + " hit you for: " + enemyDmg);
                        System.out.println("You dealt " + playerDmg + " damage to the " + enemy.getName());
                        System.out.println("Your HP: " + player.getCurHP());
                        System.out.println("Monster HP: " + enemy.getHP());
                        if(enemy.getHP() <= 0){
                            currentRoom.removeEnemy();
                            out.write("You killed the " + enemy.getName());
                        }
                    }else{
                        System.out.println("There's nothing to attack here");
                    }
                    
                    break;
                case "inventory":
                    System.out.println("Your inventory:");
                    for(Item item : player.getInventory()){
                        System.out.println(item);
                    }
                    break;
                case "quit":
                    System.out.println("Goodbye noob...");
                    playing = false;
                    break;
            }
        }
        
    }
    
}
