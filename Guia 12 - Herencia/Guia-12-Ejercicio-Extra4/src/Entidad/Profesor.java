/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Adrian H
 */

public class Profesor extends Empleado {
    /**
    Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
    pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioIncorporacion, int numDespacho, String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        super(anioIncorporacion, numDespacho, nombre, apellidos, estadoCivil, numIdentificacion);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "departamento = " + departamento + ".";
    }    
}
