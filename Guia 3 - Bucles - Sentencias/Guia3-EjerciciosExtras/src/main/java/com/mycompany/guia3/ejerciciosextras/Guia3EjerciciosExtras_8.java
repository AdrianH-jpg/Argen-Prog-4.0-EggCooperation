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
public class Guia3EjerciciosExtras_8 {

    /**
     * Escriba un programa que lea números enteros.Si el número es múltiplo de
     * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
     * cantidad de números pares y la cantidad de números impares. Al igual que
     * en el ejercicio anterior los números negativos no deben sumarse. Nota:
     * recordar el uso de la sentencia break.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int contpar = 0;
        int contimpar = 0;

        while (true) {
            System.out.print(" Ingrese un numero : ");

            num = input.nextInt();
            if (num % 5 == 0) {
                break;
            }
            if (num < 0) {
                if (num % 2 != 0) {
                    contpar += 1;
                } else;
                contimpar += 1;
            }
        }
        System.out.println("Cantidad de pares : " + contpar);
        System.out.println("Cantidad de Impares : " + contimpar);
        System.out.println("Cantidad de Total : " + (contpar + contimpar));
    }
}
