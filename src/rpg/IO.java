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
public class IO {
    private Scanner scan;
    private String input;
    public IO(){
        scan = new  Scanner(System.in);
    }
    
    public void writeLine(String message){
        System.out.println("\n" + message);
    }
    public void write(Object object){
        System.out.println(object);
    }
    public void write(String message){
        System.out.println(message);
    }
    
    public String read(){
        this.input = scan.nextLine();
        return input;
    }
    
    
    

}
