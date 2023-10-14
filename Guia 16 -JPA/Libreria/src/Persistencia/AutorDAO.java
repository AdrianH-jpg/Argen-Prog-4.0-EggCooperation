/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidades.Autor;
import java.util.List;

/**
 *
 * @author Adrian H
 */
public class AutorDAO extends DAO <Autor> {
    
  
    @Override
    public void guardar(Autor objeto) {
        super.guardar(objeto); 
    }

    @Override
    public void eliminar(Autor objeto) {
        super.eliminar(objeto); 
    }

    @Override
    public void editar(Autor objeto) {
        super.editar(objeto); 
    }
    
    public List listar() {
        Autor objeto = new Autor();
        return super.listar(objeto, "Autor");
    }
    
        public Autor consultar (String consulta) {

        conectar();
        Autor autor = (Autor) em.createQuery(consulta).getSingleResult();
        desconectar();

        return autor;
    }
    
}
