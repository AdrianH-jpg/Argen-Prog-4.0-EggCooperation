/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.ejercicio8;

/**
 *
 * @author Adrian H
 */
public class Guia3Ejercicio8 {

    public static void main(String[] args) {
        
//        * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
//     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//        * * * *
//        *     *
//        *     *
//        * * * *
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println("");
        }System.out.println("");
    }
}
