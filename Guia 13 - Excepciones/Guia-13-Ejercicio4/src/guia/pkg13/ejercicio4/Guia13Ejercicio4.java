/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg13.ejercicio4;

import java.util.InputMismatchException;

/**
 *
 * @author Adrian H
 */
public class Guia13Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Todas estas operaciones puede tirar excepciones a manejar, el ingreso
         * por teclado puede causar una excepción de tipo
         * InputMismatchException, el método Integer.parseInt() si la cadena no
         * puede convertirse a entero, arroja una NumberFormatException y
         * además, al dividir un número por cero surge una ArithmeticException.
         * Manipule todas las posibles excepciones utilizando bloques try/catch
         * para las distintas excepciones
         */
        
        DivisionNumero n = new DivisionNumero();
        
        /*
        Ejemplo para InputMismatchException:

        Ingresa un valor no numérico cuando se te solicite ingresar un número.
        Por ejemplo, si se te solicita ingresar un número y en su lugar ingresas "Hola".
        Ejemplo para NumberFormatException:

        Ingresa una cadena que no se pueda convertir a un número entero válido.
        Por ejemplo, si se te solicita ingresar un número y en su lugar ingresas "10.5".
        Ejemplo para ArithmeticException:

        Ingresa el número cero como el segundo número en la operación de división.
        Por ejemplo, si se te solicita ingresar el segundo número y en su lugar ingresas "0".
        */
        
        try {
            int resultado = n.realizarOperacion();
            System.out.println("El resultado de la operación es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: El valor ingresado no es un número válido.");
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no puede convertirse a un entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
    }
    
}
