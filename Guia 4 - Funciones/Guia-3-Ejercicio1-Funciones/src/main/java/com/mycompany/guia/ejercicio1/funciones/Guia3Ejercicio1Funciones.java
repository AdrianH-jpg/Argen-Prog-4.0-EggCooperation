/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio1.funciones;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3Ejercicio1Funciones {

    public static void main(String[] args) {
         /**
         * Crea una aplicación que le pida dos números al usuario y este pueda
         * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe
         * tener una función para cada operación matemática y deben devolver sus
         * resultados para imprimirlos en el main.
         */
        Scanner input = new Scanner(System.in);

        int num1, num2, opcion;
        int resultado;

        System.out.println("Ingrese primer numero entero: ");
        num1 = input.nextInt();
        System.out.println("Ingrese segundo numero entero: ");
        num2 = input.nextInt();

        System.out.println("Ingrese la operacion que desea realizar: \n 1: Sumar \n 2: Restar \n 3: Multiplicar \n 4: Dividir");

        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = restar(num1, num2);
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case 4:
                resultado = dividir(num1, num2);
                System.out.println("El resultado de la division es: " + resultado);
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
    
}
