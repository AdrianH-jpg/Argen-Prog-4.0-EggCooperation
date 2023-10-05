/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServicePersona {
    public Persona crearPersona() {
          /**
         * Método crearPersona que pida al usuario Nombre y fecha de nacimiento
         * de la persona a crear. Retornar el objeto Persona creado.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese la fecha de nacimiento de la persona (dd/mm/aaaa): ");
        String fechaNacimientoStr = input.nextLine();
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1;
        int anio = Integer.parseInt(partesFecha[2]);
        Date fechaNacimiento = new Date(anio-1900, mes, dia);
        return new Persona(nombre, fechaNacimiento);
    }
    
    public int calcularEdad(Persona persona) {
        /**
         * Método calcularEdad que calcule la edad del usuario utilizando el
         * atributo de fecha de nacimiento y la fecha actual.
         */
        Date fechaActual = new Date();
        fechaActual.getTime();
        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L;
        long diferenciaEnMilisegundos = fechaActual.getTime() - persona.getFechaNacimiento().getTime();
        int diferenciaEnAnos = (int) Math.round((double) diferenciaEnMilisegundos / milisegundosPorAno);
        return diferenciaEnAnos;
    }
    
    public boolean menorQue(Persona persona, int edad) {
        /**
         * Método menorQue recibe como parámetro una Persona y una edad. Retorna
         * true si la persona es menor que la edad consultada o false en caso
         * contrario.
         */
        return calcularEdad(persona) < edad;
    }
    
    public void mostrarPersona(Persona persona) {
        /**
         * Método mostrarPersona que muestra la información de la persona
         * deseada.
         */
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento().toString());
        System.out.println("Edad: " + calcularEdad(persona));
    }
}
