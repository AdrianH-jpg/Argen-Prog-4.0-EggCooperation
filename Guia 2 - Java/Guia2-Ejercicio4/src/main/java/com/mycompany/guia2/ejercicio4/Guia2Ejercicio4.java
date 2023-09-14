/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia2.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia2Ejercicio4 {

    public static void main(String[] args) {
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
        //La fórmula correspondiente es: F = 32 + (9 * C / 5)
        //inicio el Scanner para poder ingresar datos por teclado
        Scanner leer = new Scanner(System.in);
        //declaro variables de tipo int
        int C,F;
        //muestro un mensaje por consola pidiendo que ingrese los datos
        System.out.println("Ingrese los centigrados : ");
        //asigno los datos ingresados por teclado a la variable
        C = leer.nextInt();
        //realizo los calculos y los asigno a una variable
        F = 32 + (9 * C / 5);
        //muestro los resultados por consola
        System.out.println("Su equivalente a Fahrenheit es: " + F);
    }
}
