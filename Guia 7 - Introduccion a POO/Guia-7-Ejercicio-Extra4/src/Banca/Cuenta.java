/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banca;

/**
 *
 * @author Adrian H
 */
public class Cuenta {
    // Definición de la clase Cuenta que representa una cuenta bancaria

    private double saldo;      // Saldo disponible en la cuenta
    private String titular;    // Titular de la cuenta

// Constructor de la clase que recibe el titular y el saldo inicial
    public Cuenta(String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }

// Método para obtener el saldo actual de la cuenta
    public double getSaldo() {
        return saldo;
    }

// Método para establecer el saldo de la cuenta
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

// Método para obtener el titular de la cuenta
    public String getTitular() {
        return titular;
    }

// Método para establecer el titular de la cuenta
    public void setTitular(String titular) {
        this.titular = titular;
    }

// Método para retirar una cantidad de dinero de la cuenta
    public void retirar_dinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No hay suficiente saldo para realizar la operación.");
        } else {
            saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " euros. Saldo actual: " + saldo + " euros.");
        }
    }

}
