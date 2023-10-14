/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class PersonaServicio {
    public PersonaServicio() {
        
    }
    
    public String getNombre(Persona n){
        return n.getNombre();
    }
    
    public boolean esMayorDeEdad(Persona n) {
        /*
          Método esMayorDeEdad(): indica si la persona es mayor de edad.
          La función devuelve un booleano.
         */
        return (n.getEdad() >= 18);
    }

    public Persona crearPersona() {
        /*
        Metodo crearPersona(): el método crear persona, le pide los valores de
        los atributos al usuario y después se le asignan a sus respectivos
        atributos para llenar el objeto Persona. Además, comprueba que el
        sexo introducido sea correcto, es decir, H, M o O. Si no es correcto 
        se deberá mostrar un mensaje
         */
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el Nombre :");
        String nombre = input.nextLine();

        System.out.println("Ingrese el Edad :");
        int edad = input.nextInt();

        System.out.println("Ingrese el Sexo H/M/O : ");
        
        String sexo = input.next();
        
        if (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println(" Usted Ingreso mal el Sexo, vuelva a ingresarlo :");
            sexo = input.nextLine();
        } 
     
        
        System.out.println("Ingrese el Peso :");
        int peso = input.nextInt();

        System.out.println("Ingrese el Altura en Centimetros :");
        int altura = input.nextInt();

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public int calcularIMC(Persona n) {
        /**
         * Método calcularIMC(): calculara si la persona está en su peso ideal
         * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
         * valor menor que 20, significa que la persona está por debajo de su
         * peso ideal y la función devuelve un -1. Si la fórmula da por
         * resultado un número entre 20 y 25 (incluidos), significa que la
         * persona está en su peso ideal y la función devuelve un 0. Finalmente,
         * si el resultado de la fórmula es un valor mayor que 25 significa que
         * la persona tiene sobrepeso, y la función devuelve un 1.
         */
        int Peso = n.getPeso();
        int Altura =  n.getAltura();
        int IMC = 2;
        
        if ( Peso/(Altura*Altura) < 20 ){
            IMC = -1;  
        }
        if (Peso/(Altura*Altura) >= 20 && Peso/(Altura*Altura) <= 25){
            IMC = 0;  
        }
        if ( Peso/(Altura*Altura) > 25 ){
            IMC = 1;  
        }
        return IMC;        
    }
}
