/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.time.Duration;
import java.util.Comparator;

/**
 *
 * @author Adrian H
 */
public class Pelicula {
     private String titulo;
    private String director;
    private Duration duracion;

    public Pelicula(String titulo, String director, Duration  duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Duration  getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration  duracion) {
        this.duracion = duracion;
    }
    public int getHoras() {
        return (int) duracion.toHours();
    }

    public int getMinutos() {
        return (int) (duracion.toMinutes() % 60);
    }

    public int getSegundos() {
        return (int) (duracion.getSeconds() % 60);
    }
    
    public Pelicula(Duration duracion) {
        this.duracion = duracion;
        
    }

    @Override
    public String toString() {
        return "Pelicula: " + "Titulo= " + titulo + ", Director= " + director + ", Duracion= " + getHoras()+":"+getMinutos()+":"+getSegundos();
    }
    
    public static Comparator<Pelicula> compararDuracionMayor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> compararDuracionMenor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            
            return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            
            return p1.getDirector().compareToIgnoreCase(p2.getDirector());
        }
    };
}
