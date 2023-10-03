/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg7.ejercicio.extra4;

import Banca.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia7EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
         * Luego, crea un método "retirar_dinero" que permita retirar una
         * cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo
         * nunca sea negativo después de realizar una transacción de retiro.
         */
        
        Cuenta cuenta = new Cuenta("Juan Perez", 1000.0);
        Scanner leer = new Scanner(System.in);
//        cuenta.retirar_dinero(500.0);
//        cuenta.retirar_dinero(700.0);
          do{
              System.out.println("Bienvenido " + cuenta.getTitular() + "\n" + "cuanto desea retirar?");
              cuenta.retirar_dinero(leer.nextDouble());
              
          }while(cuenta.getSaldo() != 0);
    }
    
}
