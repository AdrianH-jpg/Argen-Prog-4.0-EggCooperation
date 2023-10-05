/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Adrian H
 */
public class Ahorcado {
    /**
     * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
     * contener como atributos, un vector con la palabra a buscar, la cantidad
     * de letras encontradas y la cantidad jugadas máximas que puede realizar el
     * usuario.
     */
    
    private String[] vectorPalabra;
    private int cantletras;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(int cantletras, int jugadasMax, String[] vectorPalabra) {
        this.cantletras = cantletras;
        this.jugadasMax = jugadasMax;
        this.vectorPalabra = vectorPalabra;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getCantletras() {
        return cantletras;
    }

    public void setCantletras(int cantletras) {
        this.cantletras = cantletras;
    }
}
