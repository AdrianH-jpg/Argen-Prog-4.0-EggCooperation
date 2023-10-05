/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Service.RevolverDeAgua;

/**
 *
 * @author Adrian H
 */
public class Jugador {
    private final int id;
    private String nombre;
    private boolean mojado = false;

    public Jugador(int id) {
        this.id = id;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    public void disparo(RevolverDeAgua r){                
        if (r.mojar()){
            mojado = true;
        }else{
            r.siguienteChorro();
        }
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre: " + nombre + " " + id +", mojado=" + mojado + '}';
    } 

    public boolean getMojado() {
        return mojado;
    }
}
