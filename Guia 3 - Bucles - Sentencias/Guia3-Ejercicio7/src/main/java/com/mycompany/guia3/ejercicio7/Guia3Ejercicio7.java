/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3Ejercicio7 {

    public static void main(String[] args) {
        /**
         * Realizar un programa que simule el funcionamiento de un dispositivo
         * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
         * Las cadenas deben llegar con un formato fijo: tienen que ser de un
         * máximo de 5 caracteres de largo, el primer carácter tiene que ser X y
         * el último tiene que ser una O. Las secuencias leídas que respeten el
         * formato se consideran correctas, la secuencia especial “&&&&&” marca
         * el final de los envíos (llamémosla FDE), y toda secuencia distinta de
         * FDE, que no respete el formato se considera incorrecta. Al finalizar
         * el proceso, se imprime un informe indicando la cantidad de lecturas
         * correctas e incorrectas recibidas. Para resolver el ejercicio deberá
         * investigar cómo se utilizan las siguientes funciones de Java
         * Substring(), Length(), equals().
         */

        Scanner input = new Scanner(System.in);

        String cadena;
        int cont = 0;
        int cont2 = 0;
        int maxcarac;

        do {
            System.out.println("Ingrese las cadenas");
            cadena = input.nextLine();
            maxcarac = cadena.length();
            // System.out.println("a" + cadena.substring(1, 0));
            if (maxcarac == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                cont2 += 1;
                System.out.println("Entrada Correcta: " + cadena);

            } else if (maxcarac == 5 && cadena.charAt(0) != 'X' && cadena.charAt(4) != 'O') {
                cont += 1;
                System.out.println("Entrada Incorrecta: " + cadena);
                System.out.println("Ingreso Incorrecto Vuelva a intentar");

            } else {
                System.out.println("Max 5 Caracteres");

            }
        } while (!cadena.equalsIgnoreCase("&&&&&&"));
        System.out.println("Ingresos Correctos : " + cont2);
        System.out.println("Ingresos Incorrectos : " + cont);
    }
}
