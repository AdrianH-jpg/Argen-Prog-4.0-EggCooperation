/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio2.funciones;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3Ejercicio2Funciones {

    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Diseñe una función que pida el nombre y la edad de N personas e
         * imprima los datos de las personas ingresadas por teclado e indique si
         * son mayores o menores de edad. Después de cada persona, el programa
         * debe preguntarle al usuario si quiere seguir mostrando personas y
         * frenar cuando el usuario ingrese la palabra “No”.
         */

        // Importamos la clase Scanner para obtener entrada del usuario desde la consola.
        Scanner input = new Scanner(System.in);

        // Declaramos las variables necesarias para almacenar el nombre, edad y controlar el bucle.
        String nombre;
        int edad;
        boolean seguir = true;

        // Iniciamos un bucle while que se ejecutará mientras "seguir" sea verdadero.
        while (seguir) {
            // Solicitamos al usuario que ingrese el nombre de la persona.
            System.out.println("Ingrese el nombre de la persona:");
            nombre = input.nextLine();

            // Solicitamos al usuario que ingrese la edad de la persona.
            System.out.println("Ingrese la edad de " + nombre + ":");
            edad = input.nextInt();

            // Limpiamos el buffer del teclado después de leer un entero.
            input.nextLine();

            // Llamamos a la función "mayorEdad" para determinar si la persona es mayor o menor de edad.
            mayorEdad(nombre, edad);

            // Preguntamos al usuario si desea seguir ingresando personas.
            System.out.println("¿Quiere seguir ingresando personas? (Si/No)");
            String respuesta = input.nextLine();

            // Actualizamos la variable "seguir" basada en la respuesta del usuario.
            seguir = respuesta.equalsIgnoreCase("si");
        }

    }

    public static void mayorEdad(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }
    }

}

