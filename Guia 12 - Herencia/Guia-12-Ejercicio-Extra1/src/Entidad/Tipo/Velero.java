/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad.Tipo;

import Entidad.Barcos;
import java.time.LocalDate;

/**
 *
 * @author Adrian H
 */
public class Velero extends Barcos{
        
    private int veleros;
    
    public int modulo(){
        /**
         * por un valor módulo de cada barco 
         * (obtenido simplemente multiplicando por 10 los metros de eslora)
         */
        super.eslora = super.eslora * 10 + veleros;
        return super.eslora;
    }

    public Velero(int veleros, int eslora, int matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.veleros = veleros;
    }

    public Velero() {
    }

    public int getVeleros() {
        return veleros;
    }

    public void setVeleros(int veleros) {
        this.veleros = veleros;
    }

    @Override
    public String toString() {
        return "Veleros{" + "veleros=" + veleros + '}' + super.toString();
    }
    
}
