/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg2.manosobra;

/**
 *
 * @author Adrian H
 */
public class Guia2ManosObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Hola ");
	System.out.println("Mundo");
        
        //Ejercicio 1
        // Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
        int num = 10 ;
        byte num2 ;
        short num3 ;
        float num4 ;
        String num5 ;
        boolean num6;
        
        
        
        //Ejercicio 2 
        // Asignarles valores a las variables.
        num2 = 127 ;
        num3 = 1;
        num4 = 3.5f;
        num5 = "Cadena " ;
        num6 = true;
        
        System.out.println("Primer Variable " + num);
        System.out.println("Segunda Variable " + num2);
        System.out.println("Tercera Variable " + num3);
        System.out.println("Cuarta Variable " + num4);
        System.out.println("Quinta Variable " + num5);
        System.out.println("Sexta Variable " + num6);  
        
        /// CORRECICION DE CODIGO 
        String nombre;
  	boolean bandera;
  	char chars;
        
        // Ejercicio 3
        // Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.

        int suma = num + num2;
    
	double multiplicacion = num * num2;
        
        System.out.println("Primer operador Suma : " + suma);
        System.out.println("Segundo operador Multiplicacion : " + multiplicacion);
                
        //Ejercicio 4
        //Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
        //Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra sout y apenas terminamos de escribirla tocar el botón tab o mejor dicho tabular.
        //Esto nos va a generar un System.out.println() para poder escribir lo que queramos.
        
        int edad = 29;
        String nombre1 = "Adrian";
        
        System.out.println("Nombre :" + nombre1);
        System.out.println("Edad :" + edad); 
    }
    
}
