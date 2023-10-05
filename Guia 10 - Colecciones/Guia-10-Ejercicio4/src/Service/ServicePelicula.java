/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Pelicula;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServicePelicula {
     private List<Pelicula> peliculas;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ServicePelicula() {
        this.peliculas = new ArrayList<>();
    }
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }
  public void ingresarPelicula(){  
    boolean salir = false;
        while (!salir) {
            System.out.println("Ingrese el nombre de la pelicula: ");
            String nombre = leer.nextLine();
            System.out.println("Ingrese el nombre del director: ");
            String director = leer.nextLine();
            System.out.println("Ingrese la duracion de la pelicula");
            System.out.println("Horas: ");
            int horas = leer.nextInt();
            while (horas < 0 || horas > 24) {
                System.out.println("Dato ingresado incorrecto \n"
                        + "Intente nuevamente: ");
                horas = leer.nextInt();
            }
            System.out.println("Minutos: ");
            int minutos = leer.nextInt();
            while (minutos < 0 || minutos > 60) {
                System.out.println("Dato ingresado incorrecto \n"
                        + "Intente nuevamente: ");
                minutos = leer.nextInt();
            }
            System.out.println("Segundos: ");
            int segundos = leer.nextInt();
            while (segundos < 0 || segundos > 60) {
                System.out.println("Dato ingresado incorrecto \n"
                        + "Intente nuevamente: ");
                segundos = leer.nextInt();
            }
            Duration duracion = Duration.ofHours(horas).plusMinutes(minutos).plusSeconds(segundos);
            Pelicula pelicula = new Pelicula(nombre, director, duracion);
            agregarPelicula(pelicula);
            leer.nextLine();
            System.out.println("¿Desea ingresar otra pelicula? (s/n): ");
            String opcion = leer.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                salir = true;
            }
        }
        
  }
  public void mostrarPeliculas(){
        System.out.println("-----Catalogo de peliculas-----");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
    
    public void mostrarPelisMay1hs(){
        System.out.println("-----Catalogo de peliculas mayor a 1hs de duracion-----");
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getHoras() > 1 || (pelicula.getHoras() == 1 && pelicula.getMinutos() > 0) || (pelicula.getHoras() == 1 && pelicula.getSegundos() > 0)){
                System.out.println(pelicula.toString());
            }
        }
    }
    
    public void ordenarMayorDuracion(){
        System.out.println("-----Peliculas ordenadas de menor a mayor duracion-----");
        peliculas.sort(Pelicula.compararDuracionMayor);
        mostrarPeliculas();
    }
    
    public void ordenarMenorDuracion(){
        System.out.println("-----Peliculas ordenadas de mayor a menor duracion-----");
        peliculas.sort(Pelicula.compararDuracionMenor);
        mostrarPeliculas();
    }
    
    public void ordenarTitulo(){
        System.out.println("-----Peliculas ordenadas alfabeticamente segun titulo-----");
        peliculas.sort(Pelicula.compararTitulo);
        mostrarPeliculas();
    }
    
    public void ordenarDirector(){
        System.out.println("-----Peliculas ordenadas alfabeticamente segun director-----");
        peliculas.sort(Pelicula.compararDirector);
        mostrarPeliculas();
    }
}
