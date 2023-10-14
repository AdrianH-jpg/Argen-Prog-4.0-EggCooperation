/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Adrian H
 */

public class Estudiante extends Persona {
    /**
    En cuanto a los estudiantes, se requiere almacenar el curso en el que están
    matriculados.
     */
    private int matricula;

    public Estudiante() {
    }

    public Estudiante(int matricula, String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        super(nombre, apellidos, estadoCivil, numIdentificacion);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {

        return super.toString() + "Estudiantes{" + "matricula=" + matricula + '}';

    }
     
}
