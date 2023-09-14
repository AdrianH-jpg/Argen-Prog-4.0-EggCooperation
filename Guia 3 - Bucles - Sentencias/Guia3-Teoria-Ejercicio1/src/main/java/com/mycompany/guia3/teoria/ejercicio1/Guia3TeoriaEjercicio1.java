/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.teoria.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3TeoriaEjercicio1 {

    public static void main(String[] args) {
        // Ejercicio 6
        // Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.

        //inicio el Scanner para ingresar desde el teclado
        Scanner input = new Scanner(System.in);
        //defino variables
        int num1 , num2;
        //muestro mensaje por consola solicitando ingreso de datos
        System.out.println("Ingrese primer numero: ");
        // asigno valores a las variables desde el teclado
        num1 = input.nextInt();
        System.out.println("Ingrese segundo numero: ");
        num2 = input.nextInt();
        //controlo si el valor del numero uno es mayor o menor a 25
        if (num1 > 25) {
            System.out.println("El primer numero es mayor a 25");
        }else{
            System.out.println("El primer numero es menor a 25");
        }
        //controlo si el valor del numero dos es mayor o menor a 25
        if (num2 > 25) {
            System.out.println("El segundo numero es mayor a 25");   
        }else{
            System.out.println("El segundo numero es menor a 25");
        }
    }
}
