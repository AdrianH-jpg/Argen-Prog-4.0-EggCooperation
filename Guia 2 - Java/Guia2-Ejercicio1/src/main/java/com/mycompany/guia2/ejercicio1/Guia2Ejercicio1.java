/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia2Ejercicio1 {

    public static void main(String[] args) {
        // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
        // El programa deberá después mostrar el resultado de la suma
        
        // Variable Scanner que se usa para leer datos
        Scanner input = new Scanner(System.in);
        // Creacion de variables a calcular
        System.out.println("Ingrese dos numeros enteros: ");
        int num1;
        int num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}
