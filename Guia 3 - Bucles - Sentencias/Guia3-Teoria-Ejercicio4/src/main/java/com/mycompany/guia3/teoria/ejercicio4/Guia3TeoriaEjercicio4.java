/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.teoria.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3TeoriaEjercicio4 {

    public static void main(String[] args) {
        /**
         * Ejercicio 9 Escriba un programa que lea 20 números. Si el número
         * leído es igual a cero se debe salir del bucle y mostrar el mensaje
         * "Se capturó el numero cero". El programa deberá calcular y mostrar el
         * resultado de la suma de los números leídos, pero si el número es
         * negativo no debe sumarse. Nota: recordar el uso de la sentencia break
         */
        //inicio el Scanner para ingresar datos por teclado
        Scanner input = new Scanner(System.in);
        //defino variables
        int num, sum;
        //asigno valor a la variable sum
        sum = 0;
        //inicio un for
        for (int i = 0; i < 20; i++) {
            //pido datos por consola
            System.out.print("Ingrese un número: ");
            //asigno valores ingresados por teclado a variable
            num = input.nextInt();
            if (num == 0) {
                //si se ingresa un cero muestro un mensaje y termino el bucle
                System.out.println("Se capturó el número cero");
                break;
            }
            if (num > 0) {
                //si no es cero lo sumo
                sum += num;
            }
        }
        //al finalizar el for muestro un mensaje por consola
        System.out.println("La suma de los números positivos es: " + sum);
    }

}
