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
public class EdificioOficina extends Edificio {

    protected int numOficinas;
    protected int numPersonas;
    protected int numPisos;

    public EdificioOficina() {
    }

    public EdificioOficina(int numOficinas, int numPersonas, int numPisos,
            int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.numPersonas = numPersonas;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public void cantPersonas() {
        int personasPorPiso = numPersonas * numOficinas;
        int totalPersonas = personasPorPiso * numPisos;

        System.out.println("Personas por piso: " + personasPorPiso);
        System.out.println("Personas en todo el edificio: " + totalPersonas);
        
    }
    
}
