/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Mascota.Perro;

/**
 *
 * @author Adrian H
 */
public class Persona {
    private String nombrePersona;
    private String apellidoPersona;
    private int edadPersona;
    private int documentoPersona;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombrePersona, String apellidoPersona, int edadPersona, int documentoPersona, Perro perro) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
        this.documentoPersona = documentoPersona;
        this.perro = perro;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public Persona(String nombrePersona, String apellidoPersona, int edadPersona, int documentoPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
        this.documentoPersona = documentoPersona;
    }
    

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public int getDocumentoPersona() {
        return documentoPersona;
    }

    public void setDocumentoPersona(int documentoPersona) {
        this.documentoPersona = documentoPersona;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
    

    @Override
    public String toString() {
        return "Persona: \n Nombre: " + nombrePersona + "\n Apellido: " + apellidoPersona + "\n Edad: " + edadPersona + "\n DNI: " + documentoPersona + "\n Perro"+ "\n nombre: " + perro.getNombre() +  "\n raza: " + perro.getRaza() + "\n edad: " + perro.getEdad() +  "\n tamaño: " + perro.getTamaño();
    }

//    @Override
//    public String toString() {
//        return "Persona{" + "nombrePersona=" + nombrePersona + ", apellidoPersona=" + apellidoPersona + ", edadPersona=" + edadPersona + ", documentoPersona=" + documentoPersona + '}';
//    }
//    
    
}
