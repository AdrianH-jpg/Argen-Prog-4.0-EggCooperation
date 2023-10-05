/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg9.ejercicio3;

import Service.ServiceArreglo;

/**
 *
 * @author Adrian H
 */
public class Guia9Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
         * arreglo B de 20 números reales. Crear la clase ArregloService, en el
         * paquete servicio, con los siguientes métodos: Método inicializarA
         * recibe un arreglo por parámetro y lo inicializa con números
         * aleatorios. Método mostrar recibe un arreglo por parámetro y lo
         * muestra por pantalla. Método ordenar recibe un arreglo por parámetro
         * y lo ordena de mayor a menor. Método inicializarB copia los primeros
         * 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10
         * posiciones del arreglo B con 0.5. En el Main nuevamente: inicializar
         * A, mostrar A, ordenar A, inicializar B, mostrar A y B.
         */
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        ServiceArreglo arregloService = new ServiceArreglo();
        
        arregloService.inicializarA(arregloA);
        System.out.println("Arreglo A:");
        arregloService.mostrar(arregloA);
        
        arregloService.ordenar(arregloA);
        System.out.println("Arreglo A ordenado de mayor a menor:");
        arregloService.mostrar(arregloA);
        
        arregloService.inicializarB(arregloA, arregloB);
        System.out.println("Arreglo B:");
        arregloService.mostrar(arregloB);
    }
    
}
