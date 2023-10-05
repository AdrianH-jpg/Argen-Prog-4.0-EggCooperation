/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.ParDeNumeros;

/**
 *
 * @author Adrian H
 */
public class ServiceParDeNumeros {
    private ParDeNumeros parDeNumeros;
    
    public ServiceParDeNumeros() {
        this.parDeNumeros = new ParDeNumeros();
    }
    
    public void mostrarValores() {
        System.out.println("Número 1: " + parDeNumeros.getNumero1());
        System.out.println("Número 2: " + parDeNumeros.getNumero2());
    }
    
    public double devolverMayor() {
        if (parDeNumeros.getNumero1() > parDeNumeros.getNumero2()) {
            return parDeNumeros.getNumero1();
        } else {
            return parDeNumeros.getNumero2();
        }
    }
    
    public double calcularPotencia() {
        double mayor = devolverMayor();
        double menor = (mayor == parDeNumeros.getNumero1()) ? parDeNumeros.getNumero2() : parDeNumeros.getNumero1();
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }
    
    public double calcularRaiz() {
        //Math.min() se utiliza para obtener el valor absoluto y calcular el menor de los dos valores.
        //Math.abs() para obtener el valor absoluto de ambos números
        //Math.sqrt() Calcular la raíz cuadrada
        double menor = Math.min(Math.abs(parDeNumeros.getNumero1()), Math.abs(parDeNumeros.getNumero2())); 
        //menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
}
