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
public class YatedeLujo extends Barcos{

    private int numCamarotes;

    private int PontCV;
   
    
    @Override
    public int modulo() {
        /**
         * por un valor módulo de cada barco (obtenido simplemente multiplicando
         * por 10 los metros de eslora)
         */
        super.eslora = super.eslora * 10 + numCamarotes + PontCV;
        return super.eslora;
    }

    public YatedeLujo() {
    }

    public YatedeLujo(int numCamarotes, int PontCV, int eslora, int matricula, LocalDate anioFabricacion) {
        super(eslora, matricula, anioFabricacion);
        this.numCamarotes = numCamarotes;
        this.PontCV = PontCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public int getPontCV() {
        return PontCV;
    }

    public void setPontCV(int PontCV) {
        this.PontCV = PontCV;
    }

    @Override
    public String toString() {
        return "YatedeLujo{" + "numCamarotes=" + numCamarotes + ", PontCV=" + PontCV + '}' + super.toString();
    }
    
}
