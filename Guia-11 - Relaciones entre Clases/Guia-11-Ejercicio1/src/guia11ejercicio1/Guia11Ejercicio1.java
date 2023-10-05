/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia11ejercicio1;

import Entidad.Persona;
import Service.PersonaServicio;

/**
 *
 * @author Adrian H
 */
public class Guia11Ejercicio1 {
    /**
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
        clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
        atributos: nombre, apellido, edad, documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
        pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
        la clase Persona, la información del Perro y de la Persona.
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciamos un nuevo PersonaServicio
        PersonaServicio ps1 = new PersonaServicio();
        //asignamos a una variable del tipo objeto Persona el valor retornado por el ServicioPersona en el metodo agregarPersona()
        Persona p1 = ps1.agregarPersona();
        
        ps1.mostrarPersona(p1);
    }
    
}
