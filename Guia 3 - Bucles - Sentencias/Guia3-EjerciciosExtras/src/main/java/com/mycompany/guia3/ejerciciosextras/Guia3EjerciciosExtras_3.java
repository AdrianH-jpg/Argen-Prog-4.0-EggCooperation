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
public class Guia3EjerciciosExtras_3 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
     * trata de una vocal.Caso contrario mostrar un mensaje. Nota: investigar la
     * función equals() de la clase String.
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String cadena;

        System.out.println("Ingrese las cadenas");
        cadena = input.nextLine();
        cadena = cadena.toLowerCase(); // Convertir cadena a minúsculas

        if (cadena.equals("a") || cadena.equals("e") || cadena.equals("i") || cadena.equals("o") || cadena.equals("u")) {
            System.out.println("La letra es una VOCAL");

        } else {
            System.out.println("La letra es una NO es VOCAL");
        }
    }
}
