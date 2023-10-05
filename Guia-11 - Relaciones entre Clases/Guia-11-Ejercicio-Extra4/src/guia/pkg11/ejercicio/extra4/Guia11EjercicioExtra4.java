/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg11.ejercicio.extra4;

import Entity.Alumnos;
import Service.Simulador;
import java.util.ArrayList;

/**
 *
 * @author Adrian H
 */
public class Guia11EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Simulador servicioSimulador = new Simulador();
         
        System.out.println("Bienvenidos! EGG Rotos");
        
        
        
        ArrayList<String> alumnos = servicioSimulador.generarListaAlumnos();
        System.out.println(alumnos);
        ArrayList<Integer> dnis = servicioSimulador.generarListaDNI(alumnos);
        System.out.println(dnis);
        ArrayList<Alumnos> ListaAlumnosCompleta = servicioSimulador.crearAlumno(dnis, alumnos);
        
        servicioSimulador.mostrarAlumnos(ListaAlumnosCompleta);
 
        servicioSimulador.mostrarVotos(servicioSimulador.votacion(ListaAlumnosCompleta));
        servicioSimulador.recuentoVotos(ListaAlumnosCompleta);
        servicioSimulador.facilitadores(ListaAlumnosCompleta);
    }
    
}
