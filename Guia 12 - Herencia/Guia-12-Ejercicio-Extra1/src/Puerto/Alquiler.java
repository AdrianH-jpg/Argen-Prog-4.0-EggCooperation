/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puerto;

import Entidad.Barcos;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Alquiler {
    private String nombre;

    private int clienteDni;

    private LocalDate fechaAlquiler = LocalDate.now();

    private LocalDate fechaDevolucion = LocalDate.now();

    private int posAmarre;

    private Barcos Barco;
    
    
    public void crearAlguiler(Barcos BarcoAlquilado){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
 
        
        System.out.println(" INGRESE DATOS DEL CLIENTE ");
        System.out.println("Ingrese su nombre : ");
        nombre = input.next();
        System.out.println("Ingrese el DNI : ");
        clienteDni = input.nextInt();
        System.out.println("Ingrese fecha de Alguiler Año : ");
        int anio = input.nextInt();
        System.out.println("Ingrese fecha de Alguiler Mes : ");
        int mes = input.nextInt();
        System.out.println("Ingrese fecha de Alguiler Dia : ");
        int dia = input.nextInt();
        fechaAlquiler = LocalDate.of(anio,mes,dia);
        System.out.println("Ingrese fecha de Devolucion Año : ");
        int anio1 = input.nextInt();
        System.out.println("Ingrese fecha de Devolucion Mes : ");
        int mes1 = input.nextInt();
        System.out.println("Ingrese fecha de Devolucion Dia : ");
        int dia1 = input.nextInt();
        fechaDevolucion = LocalDate.of(anio1,mes1,dia1);
        System.out.println("Ingrese la Posicion del Amarre : ");
        posAmarre = input.nextInt();
        System.out.println("-- INGRESANDO EL BARCO --");
        Barco = BarcoAlquilado;
        
    }
    

    public int precioAlguiler() {

        /**
         * Un alquiler se calcula multiplicando el número de días de ocupación
         * (calculado con la fecha de alquiler y devolución)
         */
        int precio;
        int dias = diasAlquiler();
        int eslora = Barco.modulo();
        precio = eslora * dias;
        
        return precio;
    }
    
    public int diasAlquiler(){
        int dias;
        
        dias = fechaDevolucion.getDayOfYear() - fechaAlquiler.getDayOfYear(); 
        
        return dias;
    }

    public Alquiler() {
    }

    public Alquiler(String nombre, int clienteDni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posAmarre, Barcos Barco) {
        this.nombre = nombre;
        this.clienteDni = clienteDni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.Barco = Barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClienteDni() {
        return clienteDni;
    }

    public void setClienteDni(int clienteDni) {
        this.clienteDni = clienteDni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barcos getBarco() {
        return Barco;
    }

    public void setBarco(Barcos Barco) {
        this.Barco = Barco;
    }
}
