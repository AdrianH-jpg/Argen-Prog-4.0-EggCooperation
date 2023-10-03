/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg7.ejercicio2;

import Calculo.Circunferencia;

/**
 *
 * @author Adrian H
 */
public class Guia7Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia c = new Circunferencia(0);
        
        c.crearCircunferencia();
        System.out.println("El area es: " + c.area());
        System.out.println("El perimetro es: " + c.perimetro());
    }
    
}
