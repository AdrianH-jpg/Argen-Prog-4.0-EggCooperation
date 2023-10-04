/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServiceCuentaBancaria {
    // Scanner se utiliza para la entrada de datos desde la consola
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    // CB (CuentaBancaria) es una instancia de la clase CuentaBancaria que se utilizará para operaciones
    private CuentaBancaria CB = new CuentaBancaria();
    
    // Método para crear una nueva cuenta bancaria
    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el numero de cuenta:");
        CB.setNumeroCuenta(input.nextInt());
        
        System.out.println("Ingrese el DNI del cliente:");
        CB.setDniCliente(input.nextInt());
        
        System.out.println("Ingrese el saldo de la cuenta:");
        CB.setSaldoActual(input.nextDouble());
        
        return CB;
    }
    
    // Método para ingresar saldo en la cuenta
    public CuentaBancaria ingresar(double saldo) {
        CB.setSaldoActual(CB.getSaldoActual() + saldo);
        return CB;
    }
    
    // Método para retirar saldo de la cuenta
    public CuentaBancaria retirar(double retiro) {
        if (CB.getSaldoActual() < retiro) {
            System.out.println("El monto máximo a retirar es: " + CB.getSaldoActual());
            System.out.println("Se ha retirado con éxito: " + CB.getSaldoActual());
            CB.setSaldoActual(0);
        } else {
            System.out.println("Se ha retirado con éxito: " + retiro);
            CB.setSaldoActual(CB.getSaldoActual() - retiro);
            System.out.println("Su nuevo saldo es de: " + CB.getSaldoActual());
        }
        return CB;
    }
    
    // Método para realizar una extracción rápida de saldo
    public CuentaBancaria extraccionRapida(double retiro) {
        if ((CB.getSaldoActual() * 0.20) < retiro) {
            System.out.println("El monto máximo a retirar es: " + (CB.getSaldoActual() * 0.20));
        } else {
            System.out.println("Se ha retirado con éxito: " + retiro);
            CB.setSaldoActual(CB.getSaldoActual() - retiro);
            System.out.println("Su nuevo saldo es de: " + CB.getSaldoActual());
        }
        return CB;
    }
    
    // Método para consultar el saldo de la cuenta
    public CuentaBancaria consultarSaldo() {
        System.out.println("El saldo de la cuenta es: " + CB.getSaldoActual());
        return CB;
    }
    
    // Método para consultar los datos de la cuenta
    public CuentaBancaria consultarDatos() {
        System.out.println("El número de la cuenta es: " + CB.getNumeroCuenta());
        System.out.println("El DNI del cliente es: " + CB.getDniCliente());
        System.out.println("El saldo de la cuenta es: " + CB.getSaldoActual());
        return CB;
    }
}


