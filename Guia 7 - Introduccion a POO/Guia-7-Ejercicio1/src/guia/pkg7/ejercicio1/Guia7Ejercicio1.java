/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg7.ejercicio1;

import Biblioteca.Libro;

/**
 *
 * @author Adrian H
 */
public class Guia7Ejercicio1 {

    /**
     * @param args the command line argumentsCrear una clase llamada Libro que
     * contenga los siguientes atributos: ISBN, Título, Autor, Número de
     * páginas, y un constructor con todos los atributos pasados por parámetro y
     * un constructor vacío. Crear un método para cargar un libro pidiendo los
     * datos al usuario y luego informar mediante otro método el número de ISBN,
     * el título, el autor del libro y el número de páginas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro = new Libro();
      
        libro.cargarLibro();
        libro.mostrarInformacion();
    }
    
}
