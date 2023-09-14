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
public class Guia3EjerciciosExtras_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int n = input.nextInt();

        double sumAltura = 0; // variable para almacenar la suma de todas las alturas
        int cantPersonasBajo160 = 0; // variable para almacenar la cantidad de personas con altura menor a 1.60 mts
        double sumAlturaBajo160 = 0; // variable para almacenar la suma de las alturas de las personas con altura menor a 1.60 mts

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la altura de la persona " + i + " en metros: ");
            double altura = input.nextDouble();
            sumAltura += altura; // agregar la altura a la suma total

            if (altura < 1.6) {
                cantPersonasBajo160++; // aumentar la cantidad de personas con altura menor a 1.60 mts
                sumAlturaBajo160 += altura; // agregar la altura a la suma de alturas de personas con altura menor a 1.60 mts
            }
        }

        double promedioAltura = sumAltura / n; // calcular el promedio de alturas en general
        double promedioAlturaBajo160 = cantPersonasBajo160 > 0 ? sumAlturaBajo160 / cantPersonasBajo160 : 0; // calcular el promedio de alturas de personas con altura menor a 1.60 mts, si hay al menos una persona con altura menor a 1.60 mts

        System.out.println("El promedio de estaturas en general es: " + promedioAltura + " metros.");
        System.out.println("El promedio de estaturas por debajo de 1.60 mts es: " + promedioAlturaBajo160 + " metros.");
    }
}
