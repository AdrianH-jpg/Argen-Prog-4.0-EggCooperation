/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    public Libro() {
        // constructor vacío
    }
    
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de ISBN del libro: ");
        this.ISBN = leer.nextLine();
        System.out.print("Ingrese el título del libro: ");
        this.titulo = leer.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        this.autor = leer.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        this.numPaginas = leer.nextInt();
    }
    
    public void mostrarInformacion() {
        System.out.println("Número de ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}
