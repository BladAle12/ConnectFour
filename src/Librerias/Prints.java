/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librerias;

/**
 *
 * @author BladimirA
 */
public class Prints {
    
    public static void printWithColor(String color, String message){
        try{
            Colores col = Colores.valueOf(color.toUpperCase());
            System.out.print("\034[" + col.cod + "m" + message + "\033[30m");
        }catch (IllegalArgumentException e){
            System.out.println("\033\tError: " + e.getMessage());
        }
    } 
    
       public static void printlnWithColor(String color, String message){
        try{
            Colores col = Colores.valueOf(color.toUpperCase());
            System.out.println("\033[" + col.cod + "m" + message + "\033[30m");
        }catch (IllegalArgumentException e){
            System.out.println("\033\tError: " + e.getMessage());
        }
    }
}
