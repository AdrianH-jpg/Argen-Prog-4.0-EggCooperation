/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3EjerciciosExtras {

    public static void main(String[] args) {
        /**
         * Dado un tiempo en minutos, calcular su equivalente en días y horas.
         * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe
         * calcular su equivalente: 1 día, 2 horas.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("");

        System.out.println("Ingrese los minutos : ");
        int minutos = input.nextInt();

        // Calculo 
        int dias = minutos / 1440;
        int horas = (minutos % 1440) / 60;

        System.out.println(minutos + " minutos son equivalentes a " + dias + " día(s) y " + horas + " hora(s).");

    }
}
