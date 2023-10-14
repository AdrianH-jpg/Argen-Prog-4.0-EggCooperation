/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia.pkg13.ejercicio6;

/**
 *
 * @author Adrian H
 */
public class Sentencia {
    public void metodoA(int a, int b) {
        System.out.println("sentencia_a1 : " + (a+b));
        System.out.println("sentencia_a2 : " + (a-b));

        try {
            System.out.println("sentencia_a3 : " + (a*b));
            System.out.println("sentencia_a4 : " + (a/b));
            throw new MioException("Se produjo una excepción MioException");
        } catch (MioException e) {
            System.out.println(e.toString());
        }

        System.out.println("sentencia_a5 : " + "A : " + a + " B : " + b);
    } 
}
