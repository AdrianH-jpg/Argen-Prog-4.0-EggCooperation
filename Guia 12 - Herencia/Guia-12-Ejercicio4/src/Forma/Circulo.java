/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forma;

import Forma.Interface.CalculoForma;

/**
 *
 * @author Adrian H
 */
public class Circulo implements CalculoForma{
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        double diametro = radio * 2;
        return PI * diametro;
    }  
    
}
