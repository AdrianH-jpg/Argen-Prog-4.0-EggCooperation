/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3.teoria.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia3TeoriaEjercicio2 {

    public static void main(String[] args) {
        /**
     *  Ejercicio 7
        Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
        Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
     */    
        
    //inicio el Scanner para ingresar datos por el teclado
    Scanner input = new Scanner(System.in);
        //defino variables
    	int tipoMotor;
        //solicito por consola el ingreso de una opcion
    	System.out.println("Ingrese una opción");
        //asigno lo ingresado por teclado a una variable
    	tipoMotor = input.nextInt();
        // en base al contenido de la variable muestro un mensaje utilizando un switch
    	switch (tipoMotor) {
           case 1:
               System.out.println("La bomba es una bomba de agua");
            break;

           case 2:
               System.out.println("La bomba es una bomba de gasolina");
            break;
           case 3:
               System.out.println("La bomba es una bomba de hormigón");
            break;
           case 4:
               System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
        	default:
           System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
}
