/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServiceEstudiante {
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void cargaAlumnos(Estudiante[] Alumnos) {
        int nota;
        String nombre;
        for (int i = 0; i < Alumnos.length; i++) {
            System.out.println("Ingrese nombre del Estudiante N°: " + i + " = ");
            nombre = input.next();
            System.out.println("Ingrese la Nota (N° entero) entre 1/10 del Estudiante N°: " + i + " = ");
            nota = input.nextInt();
            do {
                if (nota < 1 || nota > 10) {
                    System.out.println("Ingreso mal la nota vuelva a ingresarla : ");
                    nota = input.nextInt();
                }
            } while (nota < 1 || nota > 10);
            Alumnos[i] = new Estudiante();
            Alumnos[i].setNombre(nombre);
            Alumnos[i].setNota(nota);
        }
    }
    public void mostrarPromedio(Estudiante[] Alumnos) {
        /**
         * Calcular y mostrar el promedio de notas de todo el curso
         */
        double notas = 0;
        for (Estudiante Alumno : Alumnos) {
            notas = notas + Alumno.getNota();
        }
        System.out.println("El Promedio de las notas del curso es de : " + (notas / Alumnos.length));
    }
    public Object[] mayorPromedio(Estudiante[] Alumnos) {
        /**
         * Retornar otro arreglo con los nombre de los alumnos que recibieron
         * una nota mayor al promedio del curso
         */
        double notas = 0;
        int cont = 0;
        for (Estudiante Alumno : Alumnos) {
            notas = notas + Alumno.getNota();
        }
        double promedio = notas / Alumnos.length;
        for (Estudiante Alumno : Alumnos) {
            if (Alumno.getNota() >= promedio) {
                cont++;
            }
        }
        String[] nombresMayorPromedio = new String[cont];
        for (int i = 0; i < cont; i++) {
            if (Alumnos[i].getNota() >= promedio) {
                nombresMayorPromedio[i] = Alumnos[i].getNombre();
            }
        }
        return nombresMayorPromedio;
    }
    public void mejoresAlumnos(Object[] nombresAlumnos) {
        /**
         * Por último, deberemos mostrar todos los estudiantes con una nota
         * mayor al promedio.
         */
        System.out.println("Nombres de los Mejores Alumnos : ");
        for (Object nombresAlumno : nombresAlumnos) {
            System.out.println("Alumno : " + nombresAlumno);
        }
    }
}
