/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia3.ejerciciosextras;
/**
 *
 * @author Adrian H
 */
public class Guia3EjerciciosExtras_2 {

    /**
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una.A continuación, realizar las instrucciones
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome
     * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
     * valores finales de cada variable. Utilizar sólo una variable auxiliar.
     *
     * @param args
     */
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int Bandera;

        System.out.println("Las Variables son A : " + A + "| B : " + B + "| C : " + C + "| D : " + D);

        Bandera = A;
        A = D;
        D = B;
        B = C;
        C = Bandera;

        System.out.println("Nuevas Variables son A : " + A + "| B : " + B + "| C : " + C + "| D : " + D);
    }
}
