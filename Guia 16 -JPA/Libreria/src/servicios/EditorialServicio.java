/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Persistencia.EditorialDAO;
import entidades.Editorial;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Adrian H
 */
public class EditorialServicio {
 
    private final EditorialDAO ed;
    Scanner leer = new Scanner (System.in);
    
    public EditorialServicio() {
        ed = new EditorialDAO();
    }
    
       public void CrearEditorial() {
           
        Editorial editorial = new Editorial();
        System.out.print("Ingrese el nombre de la editorial: ");
        editorial.setNombre(leer.nextLine());

        ed.guardar(editorial);
        
       }
        
       //*****************************************
       
     public Editorial BuscarEditorialXNombre(String nomEdit) {

        String query = ("select e from Editorial e where e.nombre = '" + nomEdit + "'");

        Editorial editorial = (Editorial) ed.consultar(query);

        return editorial;

    }
        //*************************************
    
    public void EliminarEditorial() {

        System.out.print("Ingrese el nombre de la editorial que desea eliminar: ");
        String nonEdit = leer.nextLine();

        Editorial editorial = BuscarEditorialXNombre(nonEdit);
        editorial.setAlta(false);

        ed.eliminar(editorial);

    }

     public void EditarEditorial() {

        System.out.print("Ingrese el nombre de la Editorial que desea editar: ");
        String nombreEd = leer.nextLine();
        Editorial editorial = BuscarEditorialXNombre(nombreEd);
        
        System.out.print("Ingrese el nuevo nombre de la Editorial: ");
        String nuevoNombre = leer.nextLine();
        editorial.setNombre(nuevoNombre);
        
        ed.editar(editorial);
       

    }
    
}
