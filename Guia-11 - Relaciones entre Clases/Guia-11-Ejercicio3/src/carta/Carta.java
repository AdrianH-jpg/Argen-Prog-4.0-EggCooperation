/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carta;

/**
 *
 * @author Adrian H
 */
public class Carta {
    private String palo;
    private int numero;

    public Carta() {
    }

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{"+"Palo:" + palo + ",Numero:" + numero + '}';
    }
}
