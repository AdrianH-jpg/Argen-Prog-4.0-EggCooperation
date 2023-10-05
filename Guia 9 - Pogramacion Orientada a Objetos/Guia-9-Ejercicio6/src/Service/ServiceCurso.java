/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServiceCurso {
    private Scanner input = new Scanner(System.in);

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        input.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i+1) + ": ");
            alumnos[i] = input.nextLine();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        System.out.print("Ingrese nombre del curso: ");
        String nombre = input.next();
        System.out.print("\n Ingrese turno del curso T(tarde) - M(mañana): ");
        String turno = input.next();
        System.out.print("\n Ingrese horas al día que se dicta el curso: ");
        int horas = input.nextInt();
        System.out.print("\n Ingrese días a la semana que se dicta el curso: ");
        int dias = input.nextInt();
        System.out.print("\n Ingrese precio por hora del curso: ");
        double precio = input.nextDouble();

        return new Curso(nombre, turno, horas, dias, precio, cargarAlumnos());
    }

    public void gananciaSemanal(Curso c) {
        System.out.println("La ganancia semanal del curso " + c.getNombreCurso() + " es:");
        System.out.print(c.getHorasDia()*c.getDiasSemana()*c.getPrecioHora()*5);
    }
}
