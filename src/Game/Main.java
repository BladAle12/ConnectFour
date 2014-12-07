/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Librerias.Prints;
import Librerias.Usuarios;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author BladimirA
 */
public class Main {
    static Scanner lea = new Scanner(System.in);
    static ArrayList<Usuarios> users = new ArrayList<>();
    static RandomAccessFile usuarios;
    
    public static void main(String[] args) {
        int op = 0;
        boolean exit = false;
        
        do{
            try{
                Prints.printlnWithColor("CYAN","1- Login");
                Prints.printlnWithColor("CYAN","2- Crear Usuario");
                Prints.printlnWithColor("CYAN","3- Salir");
                System.out.print("Seleccione: ");
                op = lea.nextInt();
                switch (op){
                    case 1:
                        //Llamar Login
                        login();
                        break;
                    case 2:
                        //Llamar CrearUsuario
                        break;
                    case 3:
                        exit = true;
                        break;
                }
            }catch (InputMismatchException e){
                lea.next();
                Prints.printlnWithColor("RED","Ingrese un numero\n");
            }
        }while(!exit);
    }
    
    private static boolean login(){
        if (users.size() > 0){
            Prints.printWithColor("YELLOW","Usuario: ");
            String user = lea.next();
            Usuarios buscar = searchUser(user);
            if (buscar != null){
                Prints.printWithColor("YELLOW","Contraseña: ");
                String pass = lea.next();
                if (buscar.getPassword().equals(pass))
                    return true;
            }
            
            
        }else
            Prints.printlnWithColor("RED", "No hay Usuarios creados!");
        return false;
    }
    
    private static boolean createUser(){
        Prints.printWithColor("YELLOW","Usuario: ");
            String user = lea.next();
            if (searchUser(user) == null){
                Prints.printWithColor("YELLOW","Contraseña: ");
                String pass = lea.next();
                Prints.printWithColor("YELLOW","Nombre Completo (Sin Espacios): ");
                String nombre = lea.next();
                Prints.printWithColor("YELLOW","Fecha Nacimiento (dd/mm/yy/): ");
                String fecha = lea.next();
                
                //int dia = Integer.parseInt(fecha.split("/"));
                
                //users.add(new Usuarios());
            }else
                Prints.printlnWithColor("RED","Usuario ya Existe\n");
        return false;
    }
    
    private static Usuarios searchUser(String n){
        for (Usuarios x : users){
            if (x.getNombre().equalsIgnoreCase(n))
                return x;
        }
        return null;
    }
}
