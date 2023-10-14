/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import Persistencia.AutorDAO;
import entidades.Autor;
import entidades.Libro;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import servicios.AutorServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;

/**
 *
 * @author Adrian H
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        AutorServicio as = new AutorServicio();
        LibroServicio ls = new LibroServicio();
        EditorialServicio es = new EditorialServicio();
        
        int op = 0;
        String enter;
        
        /*AutorDAO x = new AutorDAO();
        List<Autor> l = x.listar();
        for(Autor a : l){
            System.out.println(a.getId());
            System.out.println(a.getNombre());
        }*/
        
        
        do {
        
            System.out.println("*******************");
            System.out.println("MENU BIBLIOTECA");
            System.out.println("_______________");
            System.out.println("1- Agregar autor");
            System.out.println("2- Agregar editorial");
            System.out.println("3- Agregar libro");
            
            System.out.println("4- eliminar autor");
            System.out.println("5- eliminar editorial");
            System.out.println("6- eliminar libro");
            
            System.out.println("7- editar autor");
            System.out.println("8- editar editorial");
            System.out.println("9- editar libro");
                        
            System.out.println("10- Buscar autor por nombre");
            System.out.println("11- Buscar libro por ISBN");
            System.out.println("12- Buscar libro por Titulo");
            System.out.println("13- Buscar un libro/s por nombre de Autor");
            System.out.println("14- Buscar un libro/s por nombre de Editorial");
            
            System.out.println("15- Salir");
            System.out.println("");
            System.out.print("Ingrese su opción: ");
            op = leer.nextInt();
            leer.nextLine();
            
            switch (op){
                
                case 1:
                    as.CrearAutor();
                    System.out.println("El autor ha sido creado correctamente.");
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 2:
                    es.CrearEditorial();
                    System.out.println("La editorial ha sido creada correctamente.");
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 3:
                    ls.CrearLibro();
                    System.out.println("El libro ha sido creado correctamente.");
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 4:
                    as.EliminarAutor();
                    System.out.println("El Autor ha sido eliminado correctamente.");
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 5: 
                    es.EliminarEditorial();
                    System.out.println("La editorial ha sido eliminada correctamente.");
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 6:
                    ls.EliminarLibro();
                    System.out.println("El libro ha sido eliminado correctamente.");
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 7:
                    as.EditarAutor();
                    System.out.println("El autor ha sido editado correctamente.");
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 8:
                    es.EditarEditorial();
                    System.out.println("La editorial ha sido editada correctamente.");
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 9:
                    ls.EditarLibro();
                    System.out.println("El libro ha sido editado correctamente.");
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 10:
                    System.out.print("Ingrese el nombre del autor que desea buscar: ");
                    System.out.println(as.BuscarAutorXNombre(leer.nextLine()));
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 11:
                    System.out.println(ls.BuscarLibroXISBN());
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 12:
                    System.out.print("Ingrese el Titulo del Libro que desea buscar: ");
                    System.out.println(ls.BuscarLibroXTitulo(leer.nextLine()));
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 13:
                    Collection <Libro> libros = ls.BuscarLibrosXAutor();
                    System.out.println(libros);
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 14: 
                    System.out.println(ls.BuscarLibrosXEditorial());
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    break;
                case 15:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida. Intente nuevamente.");
                    System.out.println("Presione Enter para continuar");
                    enter = leer.nextLine();
                    System.out.println("");
                    
            }

        
            
        } while (op != 15);
            
        
        
    }
    
}
