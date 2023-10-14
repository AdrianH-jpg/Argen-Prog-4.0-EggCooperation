/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg13.ejercicio1;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Adrian H
 */
public class Guia13Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8
         * Servicios, a null y tratar de invocar el método esMayorDeEdad() a
         * través de ese objeto. Luego, englobe el código con una cláusula
         * try-catch para probar la nueva excepción que debe ser controlada.
         */

        // GUIA13 - EJERCICIO 1
        PersonaServicio n1 = new PersonaServicio();

        Persona p1 = new Persona("Juan", 25, "Masculino", 70, 175);
        Persona p3 = null;
        Persona p2 = new Persona("María", 30, "Femenino", 65, 160);

        Persona[] Vector = new Persona[4];

        Vector[0] = p1;
        Vector[1] = p2;
        Vector[2] = p3;

        try {
            for (int i = 0; i < 4; i++) {
                Persona p = Vector[i];
                if (n1.esMayorDeEdad(p)) {
                    System.out.println(n1.getNombre(p) + " : Es Mayor de Edad");
                } else {
                    System.out.println(n1.getNombre(p) + " Es Menor de Edad");
                }
                switch (n1.calcularIMC(p)) {
                    case 1:
                        System.out.println(n1.getNombre(p) + " : Debajo del Peso ideal");
                    case 0:
                        System.out.println(n1.getNombre(p) + " : Peso Ideal");
                    case -1:
                        System.out.println(n1.getNombre(p) + " : Arriva del Peso ideal");
                }
            }
        } catch (Exception e) {
            System.out.println(" Obejeto Vacio");
        }
    }
    
}
