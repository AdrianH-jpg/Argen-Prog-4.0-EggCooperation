/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio3.funciones;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3Ejercicio3Funciones {

    public static void main(String[] args) {

        // Importamos la clase Scanner para obtener entrada del usuario desde la consola.
        Scanner input = new Scanner(System.in);
        double cantidadEuros;
        int monedaDestino;

        // Solicitamos al usuario que introduzca la cantidad de euros que desea convertir.
        System.out.println("Introduce la cantidad de euros que quieres convertir:");
        cantidadEuros = input.nextDouble();

        // Limpiamos el buffer del teclado después de leer un valor double.
        input.nextLine();

        // Solicitamos al usuario que introduzca la moneda a la que desea convertir.
        System.out.println("Introduce la moneda a la que quieres convertir \n Opcion 1 - Libras \n Opcion 2 - Dólares \n Opcion 3 - Yenes");
        monedaDestino = input.nextInt();

        // Llamamos a la función "convertirMoneda" con la cantidad de euros y la moneda de destino.
        convertirMoneda(cantidadEuros, monedaDestino);
    }

// Función para convertir la cantidad de euros a la moneda de destino especificada.
    public static void convertirMoneda(double cantidadEuros, int monedaDestino) {
        double cantidadDestino = 0;

        // Utilizamos un switch para determinar la moneda de destino y realizar la conversión.
        switch (monedaDestino) {
            case 1:
                cantidadDestino = cantidadEuros * 0.86;
                System.out.println(cantidadEuros + " euros son " + cantidadDestino + " libras.");
                break;
            case 2:
                cantidadDestino = cantidadEuros * 1.28611;
                System.out.println(cantidadEuros + " euros son " + cantidadDestino + " dólares.");
                break;
            case 3:
                cantidadDestino = cantidadEuros * 129.852;
                System.out.println(cantidadEuros + " euros son " + cantidadDestino + " yenes.");
                break;
            default:
                // En caso de que la moneda de destino no sea válida.
                System.out.println("Moneda no válida.");
        }
    }

}
