/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

import poliza.Poliza;

/**
 *
 * @author Adrian H
 */
public class Vehiculo {
     /**
     * Se registra la información de cada vehículo asegurado. Marca, modelo,
     * año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
     */
    
    private String marca;
    private String modelo;
    private String color;
    private String tipo;
    private String chasis;
    private int anio;
    private int numMotor;
    private Poliza Poliza;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, String tipo, String chasis, int anio, int numMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.chasis = chasis;
        this.anio = anio;
        this.numMotor = numMotor;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo:" + "\n Marca=" + marca + "\n Modelo=" + modelo + "\n Color=" + color + "\n Tipo=" + tipo + "\n Chasis=" + chasis + "\n Año=" + anio + "\n Numero de Motor=" + numMotor + "\n Poliza:" + Poliza;
    }

    public Poliza getPoliza() {
        return Poliza;
    }

    public void setPoliza(Poliza Poliza) {
        this.Poliza = Poliza;
    }
}
