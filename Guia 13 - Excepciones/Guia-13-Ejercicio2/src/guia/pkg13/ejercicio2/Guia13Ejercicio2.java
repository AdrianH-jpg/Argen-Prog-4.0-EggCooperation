/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg13.ejercicio2;


/**
 *
 * @author Adrian H
 */
public class Guia13Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**
         * Definir una Clase que contenga algún tipo de dato de tipo array y
         * agregue el código para generar y capturar una excepción
         * ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango).
         */

        try {

            Hangar h1 = new Hangar(032, "Hangar 01X2");

            System.out.println("Hangar nombre : " + h1.getNombreHangar());
            System.out.println("Hangar numero de Serie : " + h1.getNumHangar());
            for (int i = 0; i < 10; i++) {
                System.out.println("La Posicion es : " + i);
                String nombre = h1.getNombresAviones()[i];
                System.out.println("El Nombre del Avion es : " + nombre);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Indice Fuera de Rango " + e);
        } 
        System.out.println("-- FIN DE PROGRAMA --");
    }
    
}
