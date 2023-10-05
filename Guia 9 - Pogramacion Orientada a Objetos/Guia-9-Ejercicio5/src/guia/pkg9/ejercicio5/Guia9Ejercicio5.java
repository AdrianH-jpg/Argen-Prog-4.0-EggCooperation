/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg9.ejercicio5;

import Entidad.Persona;
import Service.ServicePersona;

/**
 *
 * @author Adrian H
 */
public class Guia9Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Implemente la clase Persona en el paquete entidades. Una persona
         * tiene un nombre y una fecha de nacimiento (Tipo Date), constructor
         * vacío, constructor parametrizado, get y set. Crear una clase
         * PersonaService, en el paquete servicio, con los siguientes métodos:
         * Método crearPersona que pida al usuario Nombre y fecha de nacimiento
         * de la persona a crear. Retornar el objeto Persona creado. Método
         * calcularEdad que calcule la edad del usuario utilizando el atributo
         * de fecha de nacimiento y la fecha actual. Método menorQue recibe como
         * parámetro una Persona y una edad. Retorna true si la persona es menor
         * que la edad consultada o false en caso contrario. Método
         * mostrarPersona que muestra la información de la persona deseada.
         */
        ServicePersona personaService = new ServicePersona();
        Persona persona = personaService.crearPersona();
        personaService.mostrarPersona(persona);

        if (personaService.menorQue(persona, 18)) {
            System.out.println("La persona es menor de edad.");
        } else {
            System.out.println("La persona es mayor de edad.");
        }
    }
    
}
