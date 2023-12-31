/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia.pkg13.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class DivisionNumero {
    public int parseInt(String a, String b){
        
        int anew = Integer.parseInt(a);
        int bnew = Integer.parseInt(b);
       
        return anew / bnew;
    }
    
    public  int realizarOperacion() {
        int resultado = 0;
        try {
            System.out.print("Ingrese un número: ");
            int num1 = obtenerNumero();
            System.out.print("Ingrese otro número: ");
            int num2 = obtenerNumero();
            resultado = num1 / num2;
        } catch (InputMismatchException e) {
            throw e;
        } catch (NumberFormatException e) {
            throw e;
        } catch (ArithmeticException e) {
            throw e;
        }
        return resultado;
    }
    
    public static int obtenerNumero() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String numero;
        int num;
        try {
            numero = input.nextLine();
            num = Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            throw e;
        }
        return num;
    }
    
}
