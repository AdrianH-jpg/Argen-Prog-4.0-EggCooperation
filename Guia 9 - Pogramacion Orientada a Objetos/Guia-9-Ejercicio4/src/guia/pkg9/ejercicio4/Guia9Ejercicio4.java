/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg9.ejercicio4;

import Service.ServiceFecha;
import java.util.Date;

/**
 *
 * @author Adrian H
 */
public class Guia9Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
         * FechaService, en paquete Servicios, que tenga los siguientes métodos:
         * Método fechaNacimiento que pregunte al usuario día, mes y año de su
         * nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El
         * método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new
         * Date(anio, mes, dia); Método fechaActual que cree un objeto fecha con
         * el día actual. Para esto usaremos el constructor vacío de la clase
         * Date. Ejemplo: Date fechaActual = new Date(); El método debe retornar
         * el objeto Date. Método diferencia que reciba las dos fechas por
         * parámetro y retorna la diferencia de años entre una y otra (edad del
         * usuario). Si necesiten acá tienen más información en clase Date:
         * Documentacion Oracle
         */
        Date fechaNacimiento = ServiceFecha.fechaNacimiento();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.toString());
      
        Date fechaActual = ServiceFecha.fechaActual();
        System.out.println("Fecha actual: " + fechaActual.toString());
    
        int edad = ServiceFecha.diferencia(fechaNacimiento, fechaActual);
        System.out.println("Edad: " + edad + " años");
    }
    
}
