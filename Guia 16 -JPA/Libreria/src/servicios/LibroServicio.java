/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Persistencia.LibroDAO;
import entidades.Editorial;
import entidades.Libro;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Adrian H
 */
public class LibroServicio {
    
    Scanner leer = new Scanner(System.in);

    private final LibroDAO ld;
        
    public LibroServicio() {
        ld = new LibroDAO();
    }

    
       public void CrearLibro() {

        Libro libro = new Libro();
        System.out.print("Ingrese el Titulo del libro: ");
        libro.setTitulo(leer.nextLine());
        
           System.out.print("Ingrese el año del libro: ");
           libro.setAnio(leer.nextInt());
           leer.nextLine();
           
           System.out.print("Ingrese el numero total de ejemplares: ");
           libro.setEjemplares(leer.nextInt());
           leer.nextLine();
           libro.setEjemplaresPrestados(0);
           libro.setEjemplaresRestantes(libro.getEjemplares());
           
           System.out.print("Ingrese el nombre del autor (el mismo debe estar previamente cargado): ");
           String autor = leer.nextLine();
           AutorServicio as = new AutorServicio();
           libro.setAutor(as.BuscarAutorXNombre(autor));
           
           System.out.print("Ingrese el nombre de la editorial (la misma debe estar previamente cargada): ");
           String nomEdit = leer.nextLine();
           EditorialServicio es = new EditorialServicio();
           //libro.setEditorial(es.BuscarEditorialXNombre(nomEdit));

        ld.guardar(libro);

    }
    
       
       /*public Autor BuscarAutorXNombre(String nombre) {
        
        String query = ("SELECT A FROM Autor A WHERE A.NOMBRE = '" + nombre + "'");

        Autor autor = (Autor) ad.consultar(query);

        return autor;*/
       
       
       public Libro BuscarLibroXISBN() {

        System.out.print("Ingrese el ISBN del Libro que desea buscar: ");
        String isbn = leer.nextLine();
        
        String query = ("SELECT L FROM Libro L WHERE L.ISBN = '" + isbn + "'");
        
        Libro libro = (Libro) ld.consultar(query);
        
        return libro;

    }
       
    public Libro BuscarLibroXTitulo(String nomlib) {
        
        String query = ("SELECT L FROM Libro L WHERE L.TITULO = '" + nomlib + "'");
        
        Libro libro = (Libro) ld.consultar(nomlib);
        
        return libro;

    }
         
    
        public Collection <Libro> BuscarLibrosXAutor() {
            
            System.out.print("Ingrese el nombre del Autor cuyos libros quiere listar: ");
            String nomAut = leer.nextLine();
            
            
            String query = ("SELECT L FROM Libro L JOIN L.AUTOR A WHERE A.NOMBRE = '" + nomAut + "'");
            
            List <Libro> libros = ld.consultar2(nomAut);
        
        return libros;

    }
        
     public Collection <Libro> BuscarLibrosXEditorial() {
            
             System.out.print("Ingrese el nombre de la editorial cuyos libros quiere listar: ");
            String nomEdit = leer.nextLine();
            
            
            String query = ("SELECT L FROM Libro L JOIN L.EDITORIAL E WHERE E.NOMBRE = '" + nomEdit + "'");
            
            List <Libro> libros = ld.consultar2(nomEdit);
        
        return libros;

    }
         
         
        public void EliminarLibro() {

        System.out.print("Ingrese el nombre del libro que desea eliminar: ");
        String nomLibr = leer.nextLine();

        Libro libro = BuscarLibroXTitulo(nomLibr);
        libro.setAlta(false);

        ld.eliminar(libro);

    }
    
        
        public void EditarLibro() {

        System.out.print("Ingrese el titulo del Libro que desea editar: ");
        String titulo = leer.nextLine();
        Libro libro = BuscarLibroXTitulo(titulo);
        
        System.out.print("Ingrese el nuevo Titulo del Libro: ");
        String nuevoNombre = leer.nextLine();
        libro.setTitulo(nuevoNombre);
        
        System.out.print("Ingrese el año del Libro: ");
        int anio = leer.nextInt();
        leer.nextLine();
        libro.setAnio(anio);
        
        System.out.print("Ingrese La cantidad total de ejemplares: ");
        int ejemplares = leer.nextInt();
        leer.nextLine();
        libro.setEjemplares(ejemplares);
        
        System.out.print("Ingrese el nombre del autor (el mismo debe estar previamente cargado): ");
           String autor = leer.nextLine();
           AutorServicio as = new AutorServicio();
           libro.setAutor(as.BuscarAutorXNombre(autor));
           
           System.out.print("Ingrese el nombre de la editorial (la misma debe estar previamente cargada): ");
           String nomEdit = leer.nextLine();
           EditorialServicio es = new EditorialServicio();
          // libro.setEditorial(es.BuscarEditorialXNombre(nomEdit));

        ld.editar(libro);

    }
        
        
}
