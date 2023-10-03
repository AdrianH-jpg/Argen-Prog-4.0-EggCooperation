/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
   /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/
public class Circunferencia {
    private double radio;
    Scanner leer = new Scanner(System.in);
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio ");
        this.radio = leer.nextDouble();

    }
    
    public double area(){
        return Math.pow((Math.PI * radio),2);
    }
    
    public double perimetro(){
       return 2 * Math.PI * radio;
    }
    
    
    
} 

