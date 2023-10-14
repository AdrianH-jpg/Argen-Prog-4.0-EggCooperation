/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Empleado;

/**
 *
 * @author Adrian H
 */

public class PersonalServicio extends Empleado {
    /**
Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, int anioIncorporacion, int numDespacho, String nombre, String apellidos, String estadoCivil, int numIdentificacion) {
        super(anioIncorporacion, numDespacho, nombre, apellidos, estadoCivil, numIdentificacion);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "seccion = " + seccion + ".";
    }
  
}
