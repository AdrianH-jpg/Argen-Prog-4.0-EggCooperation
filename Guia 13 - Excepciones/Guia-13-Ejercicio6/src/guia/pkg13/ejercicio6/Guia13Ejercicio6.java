/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg13.ejercicio6;

/**
 *
 * @author Adrian H
 */
public class Guia13Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Dado el método metodoA de la clase A, indique:
        a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
        b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
            class A {
            public void metodoA() {
                sentencia_a1
                sentencia_a2
            try {
                sentencia_a3
                sentencia_a4
            } catch (MioException e){ 
                sentencia_a6 
             }
                sentencia_a5
             }
            }
         */

        Sentencia instanciaA = new Sentencia();
        try {
            System.out.println("Ejecución sin excepción MioException:");
            instanciaA.metodoA(10, 5);

            System.out.println("Ejecución con excepción MioException:");

            instanciaA.metodoA(10, 0);
        } catch (Exception e) {
            // Captura de la excepción MioException si se produce
            System.out.println("Excepción capturada: " + e.getMessage());
        }

    } 
}
