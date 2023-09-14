/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3Ejercicio1 {

    public static void main(String[] args) {
        // Crear un programa que dado un número determine si es par o impar.
        
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero");
        num = input.nextInt();
        
        if (num % 2 != 0)
            System.out.println("Numero Impar");
        else
            System.out.println("Numero Par");
    }
}
