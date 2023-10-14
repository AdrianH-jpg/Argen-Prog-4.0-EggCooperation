/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidades.Libro;
import java.util.List;

/**
 *
 * @author Adrian H
 */
public class LibroDAO extends DAO <Libro> {
    
       
    @Override
    public void guardar(Libro objeto) {
        super.guardar(objeto); 
    }

    @Override
    public void eliminar(Libro objeto) {
        super.eliminar(objeto); 
    }

    @Override
    public void editar(Libro objeto) {
        super.editar(objeto); 
    }
    
    public List listar() {
        Libro objeto = new Libro();
        return super.listar(objeto, "Libro");
    }
    
    
      public Libro consultar (String consulta) {

        conectar();
        Libro libro = (Libro) em.createQuery(consulta).getSingleResult();
        desconectar();

        return libro;
    }
    
      public List consultar2 (String consulta) {

        conectar();
        List <Libro> libros = (List <Libro>) em.createQuery(consulta).getResultList();
        desconectar();

        return libros;
    }
    
      
}
