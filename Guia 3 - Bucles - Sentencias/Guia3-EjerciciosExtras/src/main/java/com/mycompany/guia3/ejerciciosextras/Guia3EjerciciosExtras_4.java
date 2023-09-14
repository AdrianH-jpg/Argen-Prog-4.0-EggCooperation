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
public class Guia3EjerciciosExtras_4 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
     * @param args
     */
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 10: ");
        int num = input.nextInt();

        String romano = ""; // cadena para almacenar el número romano

        switch (num) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
            default:
                System.out.println("El número ingresado no está en el rango de 1 a 10");
                return; // salir del programa si el número no está en el rango válido
        }

        System.out.println("El número " + num + " en romano es: " + romano);
    }
}
