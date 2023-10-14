/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Adrian H
 */

public class Persona {
    
    /**
     * CLASE PADRE
     */
    /**
     * Por cada persona, se debe conocer, al menos, su nombre y apellidos, su
     * número de identificación y su estado civil.
     */
    
   protected String nombre, apellidos, estadoCivil;
   protected int numIdentificacion;

    public Persona() {
    }
    
    public Persona(String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.estadoCivil = estadoCivil;
        this.numIdentificacion = numIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(int numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    @Override
    public String toString() {
        return "---- Ficha personal ----" + "\nNombre = " + nombre + ", apellido = " + apellidos + ", estado civil = " + estadoCivil + ", numero de identificacion = " + numIdentificacion + ", ";
    }
   
   
}
