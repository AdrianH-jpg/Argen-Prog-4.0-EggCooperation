/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.Arrays;

/**
 *
 * @author Adrian H
 */
public class ServiceArreglo {
    public void inicializarA(double[] arreglo) {
        /**
         * Método inicializarA recibe un arreglo por parámetro y lo inicializa
         * con números aleatorios.
         */
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 100;
        }
    }
    
    public void mostrar(double[] arreglo) {
        /**
         * Método mostrar recibe un arreglo por parámetro y lo muestra por
         * pantalla.
         */
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
    
    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        /**
         * Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a
         * menor.
         */
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }
    
    public void inicializarB(double[] arregloA, double[] arregloB) {
        /**
         * Método inicializarB copia los primeros 10 números del arreglo A en el
         * arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con
         * 0.5.
         */
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        for (int i = 10; i < arregloB.length; i++) {
            arregloB[i] = 0.5;
        }
    }
}
