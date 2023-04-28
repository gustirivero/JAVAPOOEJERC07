/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICIOS;

import ENTIDADES.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p = new Persona();

    /*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje*/
 /*   private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;*/
    public Persona crearPersona() {
        
        
        System.out.println("Ingrese su nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese el sexo: 'H','M','O'(Otro).");
        p.setSexo(leer.next());

        if (p.getSexo().toUpperCase().equals("H") || p.getSexo().toUpperCase().equals("M") || p.getSexo().toUpperCase().equals("O")) {

            System.out.println("Haz elegido el sexo: " + p.getSexo().toUpperCase());

        } else {
            System.out.println("El sexo no corresponde a una de las opciones");
        }

        System.out.println("Ingrese la edad:");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese el peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura");
        p.setAltura(leer.nextDouble());
        
        calcularIMC();
        esMayorDeEdad();
        mostrarPersona();
        
        

        return p;
    }

    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
 /*peso en kg/(altura^2 en mt2*/
 /*IMC = peso (kg) / altura² (m²)

Por ejemplo, si una persona mide 1,70 metros y pesa 70 kilogramos, su IMC sería:

IMC = 70 / (1.70 x 1.70) = 24.2*/
       public void calcularIMC() {
        double peso = p.getPeso();
        double altura = p.getAltura();
        double imc = peso / (altura * altura);
        
        
        if ( imc < 20) {
            System.out.println("Su IMC es "+ imc + " Usted esta por debajo del peso ideal");
        } else if (imc >= 20 && peso / (altura * altura) <= 25) {
            System.out.println("Su IMC es "+ imc + " Usted está en su peso ideal");

        } else if(imc > 25){
            System.out.println("Su IMC es "+ imc + " Usted esta por encima del peso ideal");
        }
    }
    
    
    /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
     public void esMayorDeEdad() {
        System.out.println("¿La persona es mayor de edad?");

        if (p.getEdad() > 18) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public void mostrarPersona() {
        System.out.println(p.toString());

    }

    
    
    
    
    
}
