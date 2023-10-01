/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia.ejercicio.extra4;

import java.text.DecimalFormat;


/**
 *
 * @author Adrian H
 */
public class Guia5EjercicioExtra4 {

    /**
     * @param args the command line arguments Los profesores del curso de
     * programación de Egg necesitan llevar un registro de las notas adquiridas
     * por sus 10 alumnos para luego obtener una cantidad de aprobados y
     * desaprobados. Durante el período de cursado cada alumno obtiene 4 notas,
     * 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
     * de cada nota son:
     *
     * Primer trabajo práctico evaluativo 10% Segundo trabajo práctico
     * evaluativo 15% Primer Integrador 25% Segundo integrador 50%
     *
     * Una vez cargadas las notas, se calcula el promedio y se guarda en el
     * arreglo. Al final del programa los profesores necesitan obtener por
     * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que
     * solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas
     * del curso.
     *
     */
    public static void main(String[] args) {

// Importamos la clase DecimalFormat para formatear la salida de números decimales.
        DecimalFormat df = new DecimalFormat("0.00");
// Creamos una matriz de tamaño 10x5 para almacenar números decimales.
        double[][] matriz = new double[10][5];
// Inicializamos una variable "cont" para contar la cantidad de estudiantes con calificación menor a 7.
        int cont = 0;
// Llenamos la matriz con valores aleatorios entre 0 y 9.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (Math.random() * 10); // Generamos números aleatorios entre 0 y 9.
            }
            // Calculamos la calificación promedio para cada estudiante y la almacenamos en la última columna (índice 4).
            matriz[i][4] = (matriz[i][0] * 0.1 + matriz[i][1] * 0.15 + matriz[i][2] * 0.25 + matriz[i][3] * 0.5);

            // Verificamos si la calificación promedio es menor a 7 y actualizamos "cont" si es así.
            if (matriz[i][4] < 7) {
                cont++;
            }
        }
// Imprimimos la matriz formateando cada número con dos decimales.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(df.format(matriz[i][j]) + " ");
            }
            System.out.println(""); // Agregamos un salto de línea para separar filas.
        }
// Mostramos la cantidad de aprobados (calificación promedio mayor o igual a 7) y desaprobados.
        System.out.println("Cantidad de aprobados: " + (10 - cont));
        System.out.println("Cantidad de desaprobados: " + cont);

    }
}
