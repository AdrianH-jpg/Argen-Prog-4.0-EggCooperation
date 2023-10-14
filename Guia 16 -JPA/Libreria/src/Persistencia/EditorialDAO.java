/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidades.Editorial;
import java.util.List;

/**
 *
 * @author Adrian H
 */
public class EditorialDAO extends DAO <Editorial> {
    
    @Override
    public void guardar(Editorial objeto) {
        super.guardar(objeto); 
    }

    @Override
    public void eliminar(Editorial objeto) {
        super.eliminar(objeto); 
    }

    @Override
    public void editar(Editorial objeto) {
        super.editar(objeto); 
    }
    
    public List listar() {
        Editorial objeto = new Editorial();
        return super.listar(objeto, "Editorial");
    }
    
    
    /*public Editorial consultar (String consulta){
        
        Editorial objeto = new Editorial();
         return super.consultar(consulta, objeto.class);
        
    }*/
    
    
    public Editorial consultar (String consulta) {

        conectar();
        Editorial edit = (Editorial) em.createQuery(consulta).getSingleResult();
        desconectar();

        return edit;
    }
 
    
    
}
