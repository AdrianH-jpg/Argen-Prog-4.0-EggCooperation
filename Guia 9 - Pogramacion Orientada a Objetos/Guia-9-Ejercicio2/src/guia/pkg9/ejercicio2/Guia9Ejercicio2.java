/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg9.ejercicio2;

import Service.ServiceParDeNumeros;

/**
 *
 * @author Adrian H
 */
public class Guia9Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar una clase llamada ParDeNumeros que tenga como atributos dos
         * números reales con los cuales se realizarán diferentes operaciones
         * matemáticas. La clase debe tener un constructor vacío, getters y
         * setters. En el constructor vacío se usará el Math.random para generar
         * los dos números. Crear una clase ParDeNumerosService, en el paquete
         * Servicios, que deberá además implementar los siguientes métodos:
         * Método mostrarValores que muestra cuáles son los dos números
         * guardados. Método devolverMayor para retornar cuál de los dos
         * atributos tiene el mayor valor Método calcularPotencia para calcular
         * la potencia del mayor valor de la clase elevado al menor número.
         * Previamente se deben redondear ambos valores. Método calculaRaiz,
         * para calcular la raíz cuadrada del menor de los dos valores. Antes de
         * calcular la raíz cuadrada se debe obtener el valor absoluto del
         * número.
         */
        ServiceParDeNumeros servicio = new ServiceParDeNumeros();
        
        servicio.mostrarValores();
        System.out.println("El número mayor es: " + servicio.devolverMayor());
        System.out.println("La potencia del mayor elevado al menor es: " + servicio.calcularPotencia());
        System.out.println("La raíz cuadrada del menor es: " + servicio.calcularRaiz());
    }
    
}
