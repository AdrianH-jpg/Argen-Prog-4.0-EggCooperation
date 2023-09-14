/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia2Ejercicio3 {

    public static void main(String[] args) {
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        //inici el Scanner para ingresar datos por teclado
        Scanner input = new Scanner(System.in);
        //defino la variable
        String palabra;
        //pido que ingresen la frase por consola
        System.out.println("Ingrese su frase : ");
        //ingreso la frase por teclado y la asigno a la variable
        palabra = input.nextLine();
        //muestro la frase en mayusculas
        System.out.println(palabra.toUpperCase());
        //muestro la frase en minusculas
        System.out.println(palabra.toLowerCase());
    }
}
