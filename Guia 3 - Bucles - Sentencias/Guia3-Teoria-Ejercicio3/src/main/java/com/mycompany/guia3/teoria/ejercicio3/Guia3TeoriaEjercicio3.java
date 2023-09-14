/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.teoria.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3TeoriaEjercicio3 {

    public static void main(String[] args) {
        /**
         * Ejercicio 8 Escriba un programa que valide si una nota está entre 0
         * y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la
         * nota sea correcta.
         */
        // inicio el Scanner para ingresar datos por teclado
        Scanner input = new Scanner(System.in);
        //inicio variavle y asigno un valor
        int respuesta = 11;
        //utilizo un while para pedir notas hasta que esta este entre 0 y 10
        while (respuesta < 0 || respuesta > 10) {
            //muestro mensaje por consola
            System.out.println("Ingrese la Nota entre 0 y 10");
            //asigno valor ingresado por teclado a la variable
            respuesta = input.nextInt();
        }
        //muestro un mensaje concatenado a la nota que se ingreso por el teclado
        System.out.println("La nota ingresada es: " + respuesta);

    }
}
