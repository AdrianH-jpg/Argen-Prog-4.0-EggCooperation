/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class PersonaService {
    private Persona Pr = new Persona();
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    
    
    public Persona crearPersona(){
        
        /*
        Metodo crearPersona(): el método crear persona, le pide los valores de
        los atributos al usuario y después se le asignan a sus respectivos
        atributos para llenar el objeto Persona. Además, comprueba que el
        sexo introducido sea correcto, es decir, H, M o O. Si no es correcto 
        se deberá mostrar un mensaje
         */
        System.out.println("Ingrese el nombre de la persona");
        Pr.setNombre(input.next());
        System.out.println("Ingrese la edad");
        Pr.setEdad(input.nextInt());
        
        String n;
        boolean sexoValido = false;
        while(!sexoValido) {
            System.out.println("Ingrese el sexo de la persona, sea H para hombre, M para mujer, O para otro");
            n = input.nextLine();
            if(n.equalsIgnoreCase("H") || n.equalsIgnoreCase("M") || n.equalsIgnoreCase("O")) {
                sexoValido = true;
                Pr.setSexo(n.charAt(0));
            }
            else{
                System.out.println("Error: El sexo ingresado no es válido.");
            }
            
        }
        System.out.println("Ingrese el peso de la persona");
        Pr.setPeso(input.nextDouble());
        
        System.out.println("Ingrese la altura de la persona");
        Pr.setAltura(input.nextDouble());
        
        return Pr;
    }
    
    public boolean esMayorDeEdad(Persona P){
        /*
          Método esMayorDeEdad(): indica si la persona es mayor de edad.
          La función devuelve un booleano.
         */
        return 18 < P.getEdad();
    }
    
    public int calcularIMC(Persona P){
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
        double imc = P.getPeso() / (P.getAltura() * P.getAltura()); 

        if (imc < 20) {
            return -1; // La persona está por debajo de su peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // La persona está en su peso ideal
        } else {
            return 1; // La persona tiene sobrepeso
        }
    }
}
