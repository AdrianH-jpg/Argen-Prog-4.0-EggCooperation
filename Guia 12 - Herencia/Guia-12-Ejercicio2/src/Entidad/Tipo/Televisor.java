/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad.Tipo;

import Entidad.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Televisor extends Electrodomestico{
     protected int resolucion;
    protected boolean sintoTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintoTDT, double precio, String color, char consumoEnergia, int peso) {
        super(precio, color, consumoEnergia, peso);
        this.resolucion = resolucion;
        this.sintoTDT = sintoTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintoTDT() {
        return sintoTDT;
    }

    public void setSintoTDT(boolean sintoTDT) {
        this.sintoTDT = sintoTDT;
    }

    public void crearTelevisor() {

        /**
         * Método crearTelevisor(): este método llama a crearElectrodomestico()
         * de la clase padre, lo utilizamos para llenar los atributos heredados
         * del padre y después llenamos los atributos del televisor
         */
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("--- TELEVISOR ---");
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del Televisor : ");
        this.resolucion = input.nextInt();
        System.out.println("Ingrese, tiene sintonisador TDT ? S/N : ");
        String resp = input.next();
        if (resp.equals("S")) {
            this.sintoTDT = true;
        }
    }

    // El OVERRIDE lo usamos para sobre escribir el metodo de la Clase PADRE/MADRE
    @Override
    public void precioFinal() {
        /**
         * Método precioFinal(): este método será heredado y se le sumará la
         * siguiente funcionalidad. Si el televisor tiene una resolución mayor
         * de 40 pulgadas, se incrementará el precio un 30% y si tiene un
         * sintonizador TDT incorporado, aumentará $500. Recuerda que las
         * condiciones que hemos visto en la clase Electrodomestico también
         * deben afectar al precio.
         */
        
        // hay que llamar el super de precio final para no borrar todo el meotod del padre
        super.precioFinal();
        if (resolucion > 40) {
            setPrecio(getPrecio() * 1.3 );  // Incrementa el precio en un 30%
        }

        if (sintoTDT) {
            setPrecio(getPrecio()+ 500); 
        }
    }

    @Override
    public String toString() {
        String aux;
        if (sintoTDT){
            aux = "Tiene";
        }else{
            aux = "No tiene";
        } 
        return super.toString() + " Televisor{" + "resolucion=" + resolucion + ", sintoTDT=" + aux + '}';
    }
}
