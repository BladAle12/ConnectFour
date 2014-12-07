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
public enum Colores {
    
     RED(31), GREEN(32), YELLOW(33), BLUE(34), MAGENTA(35), CYAN(36), BLACK(37),WHITE(30);
    int cod;
    Colores(int c){
        cod = c;
    }
}
