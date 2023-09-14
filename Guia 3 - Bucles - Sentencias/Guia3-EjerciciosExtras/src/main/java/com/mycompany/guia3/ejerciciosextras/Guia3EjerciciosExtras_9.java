/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia3.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3EjerciciosExtras_9 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = input.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = input.nextInt();

        int cociente = 0; // variable para almacenar el cociente
        int residuo = dividendo; // variable para almacenar el residuo

        // Restar el divisor del dividendo hasta que el resultado sea menor que el divisor
        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }
}
