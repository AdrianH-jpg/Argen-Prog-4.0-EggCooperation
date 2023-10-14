/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad.JARVIS;

/**
 *
 * @author Adrian H
 */
public class Objetos {
    /**
     * Las ubicaciones de los objetos están dadas por las coordenadas X, Y y Z.
     * Los objetos pueden ser marcados o no como hostiles. JARVIS también puede
     * detectar la resistencia del objeto, y puede detectar hasta 10 objetos de
     * manera simultánea.
     */
    
    public int x;
    public int y;
    public int z;
    public boolean hostil;
    public int resistencia;
    public int distancia;
    
    public Objetos() {
    }

    public Objetos(int x, int y, int z, boolean hostil, int resistencia, int distancia) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.hostil = hostil;
        this.resistencia = resistencia;
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        String estado;
        if (hostil){
          estado = " Hostil ";
        }else{
            estado = " NO Hostil";
        }
        return "\n Objeto {" + "\n Posicion X : " + x + "\n Posicion Y : " + y + "\n Posicion Z : " + z + "\n  Hostil : " + estado + "\n Resistencia : " + resistencia + "\n Distancia :" + distancia +'}';
    }
    
    
}
