/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Adrian H
 */
public class Espectador {
    /**
     * del espectador, nos interesa saber su nombre, edad y el dinero que tiene
     * disponible
     */
    
    private String nombreE;
    private int edadE;
    private int dineroE;

    public Espectador() {
    }

    public Espectador(String nombreE, int edadE, int dineroE) {
        this.nombreE = nombreE;
        this.edadE = edadE;
        this.dineroE = dineroE;
    }

    public int getDineroE() {
        return dineroE;
    }

    public void setDineroE(int dineroE) {
        this.dineroE = dineroE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public int getEdadE() {
        return edadE;
    }

    public void setEdadE(int edadE) {
        this.edadE = edadE;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombreE=" + nombreE + ", edadE=" + edadE + ", dineroE=" + dineroE + '}';
    }
}
