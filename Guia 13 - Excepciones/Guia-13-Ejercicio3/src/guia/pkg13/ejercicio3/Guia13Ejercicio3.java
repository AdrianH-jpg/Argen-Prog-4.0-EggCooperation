/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg13.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia13Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Defina una clase llamada DivisionNumero. En el método main utilice un
         * Scanner para leer dos números en forma de cadena. A continuación,
         * utilice el método parseInt() de la clase Integer, para convertir las
         * cadenas al tipo int y guardarlas en dos variables de tipo int. Por
         * ultimo realizar una división con los dos numeros y mostrar el
         * resultado.
         */

        try {

            Scanner input = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese el primer numero : ");
            String num1 = input.nextLine();
            System.out.println("Ingrese el segundo numero : ");
            String num2 = input.nextLine();

            DivisionNumero n = new DivisionNumero();

            System.out.println("Division : " + n.parseInt(num2, num1));

        } catch (ArithmeticException e) {
            System.out.println("Error Aritmetico : " + e);
        } catch (Exception e) {
            System.out.println("Error General : " + e);
        }
    }
    
}
