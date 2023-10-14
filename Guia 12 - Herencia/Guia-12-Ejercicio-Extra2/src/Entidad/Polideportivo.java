/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Super.Edificio;

/**
 *
 * @author Adrian H
 */
public class Polideportivo extends Edificio{
    
    protected String nombre;
    protected boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    
    public boolean getTipoInstalacion() {
        return this.techado;
    }
    
    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);
    }

    @Override
    public double calcularVolumen() { 
        return ancho * largo * alto;
    }
    
}
