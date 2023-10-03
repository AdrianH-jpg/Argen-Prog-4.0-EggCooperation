/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg7.ejercicio.extra5;

import Calculo.Empleado;

/**
 *
 * @author Adrian H
 */
public class Guia7EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here
        /**
         * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
         * "salario". Luego, crea un método "calcular_aumento" que calcule el
         * aumento salarial de un empleado en función de su edad y salario
         * actual. El aumento salarial debe ser del 10% si el empleado tiene más
         * de 30 años o del 5% si tiene menos de 30 años.
         *
         */
        
        Empleado empleado = new Empleado("Juan", 35, 2000.0);
        System.out.println("El empleado " + empleado.getNombre() + " de " + empleado.getEdad() + " años de edad");
        System.out.println("Salario actual: " + empleado.getSalario());

        empleado.calcular_aumento();

        System.out.println("Salario después del aumento: " + empleado.getSalario());
    }
    
}
