/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

/**
 *
 * @author Adrian H
 */
/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a 
pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario.
Si no, se hace la división y se devuelve el resultado al main.
*/
import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    // Constructor con todos los atributos pasados por parámetro
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Constructor sin los atributos pasados por parámetro
    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    // Métodos get y set
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    // Método para crearOperacion()
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        double numero2 = scanner.nextInt();
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método sumar()
    public double sumar() {
        return numero1 + numero2;
    }

    // Método restar()
    public double restar() {
        return numero1 - numero2;
    }

    // Método multiplicar()
    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: no se puede multiplicar por cero");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    // Método dividir()
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: no se puede dividir por cero");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
}