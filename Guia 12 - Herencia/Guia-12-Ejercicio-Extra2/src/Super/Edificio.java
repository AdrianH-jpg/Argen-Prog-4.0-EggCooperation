/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Super;

/**
 *
 * @author Adrian H
 */
public abstract class Edificio {

    /*
        Edificio con los siguientes atributos: ancho, alto y largo. La clase
        edificio tendrá como métodos: 
      • Método calcularSuperficie(): calcula la superficie del edificio. 
      • Método calcularVolumen(): calcula el volumen del edifico.
     */
    protected int ancho;
    protected int alto;
    protected int largo;

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();

    public Edificio() {
    }

    public Edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    
}
