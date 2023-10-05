/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServiceFecha {
    public static Date fechaNacimiento() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el año de su nacimiento: ");
        int anio = input.nextInt();
        System.out.print("Ingrese el mes de su nacimiento (1-12): ");
        int mes = input.nextInt(); // Los meses en la clase Date van de 0 a 11
        System.out.print("Ingrese el día de su nacimiento: ");
        int dia = input.nextInt();
        return new Date(anio - 1900, mes-1, dia);
    }
    
    public static Date fechaActual() {
        return new Date();
    }
    
    public static int diferencia(Date fecha1, Date fecha2) {
        /**
         * Método diferencia que reciba las dos fechas por parámetro y retorna
         * la diferencia de años entre una y otra (edad del usuario).
         */
        /**
         * getTime() Returns the number of milliseconds since January 1, 1970,
         * 00:00:00 GMT represented by this Date object.
         */
        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L; // milisegundos por año
        long diferenciaEnMilisegundos = fechaActual().getTime() - fechaNacimiento().getTime();
        int diferenciaEnAnos = (int) Math.round((double) diferenciaEnMilisegundos / milisegundosPorAno);
        //int diferenciaEnMs = fecha2.getYear() - fecha1.getYear();
        return (int) (diferenciaEnAnos ); 
    }
}
