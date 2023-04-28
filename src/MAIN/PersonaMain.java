/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MAIN;

import ENTIDADES.Persona;
import SERVICIOS.ServiciosPersona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServiciosPersona sp = new ServiciosPersona();
        
        for (int i = 0; i < 4; i++) {
               Persona p = sp.crearPersona();
        }
     
       
      
        
        
    }
    
}
