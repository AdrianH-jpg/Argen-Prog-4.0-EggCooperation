/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Persistencia.AutorDAO;
import entidades.Autor;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Adrian H
 */
public class AutorServicio {

 private final AutorDAO ad;
    Scanner leer = new Scanner (System.in);
    
    public AutorServicio() {
        ad = new AutorDAO();
    }

    public void CrearAutor() {

        Autor autor = new Autor();
        System.out.print("Ingrese el nombre del autor: ");
        autor.setNombre(leer.nextLine());

        ad.guardar(autor);

    }

    public void EliminarAutor() {

        System.out.print("Ingrese el nombre del Autor que desea eliminar: ");
        String nombre = leer.nextLine();
        Autor autor = BuscarAutorXNombre(nombre);

        autor.setAlta(false);

        ad.eliminar(autor);

    }
    
       public void EditarAutor() {

        System.out.print("Ingrese el nombre del Autor que desea editar: ");
        String nombre = leer.nextLine();
        Autor autor = BuscarAutorXNombre(nombre);
        
        System.out.print("Ingrese el nuevo nombre del autor: ");
        String nuevoNombre = leer.nextLine();
        autor.setNombre(nuevoNombre);

       ad.editar(autor);

    }
    
    
     public Autor BuscarAutorXNombre(String nombre) {
        
        String query = ("SELECT A FROM Autor A WHERE A.NOMBRE = '" + nombre + "'");

        Autor autor = (Autor) ad.consultar(query);

        return autor;

    }
     
     

}
