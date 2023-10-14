/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author Adrian H
 */
public class Barcos {
    protected int eslora;

    protected int matricula;

    protected LocalDate anioFabricacion;
    
    
    public int modulo(){
        /**
         * por un valor módulo de cada barco 
         * (obtenido simplemente multiplicando por 10 los metros de eslora)
         */
        this.eslora = this.eslora * 10;
        return this.eslora;
    }
    
    public Barcos() {
    }

    public Barcos(int eslora, int matricula, LocalDate anioFabricacion) {
        this.eslora = eslora;
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barcos{" + "eslora=" + eslora + ", matricula=" + matricula + ", anioFabricacion=" + anioFabricacion + '}';
    }
}
