/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.casas;
import Persistencia.CasaDAO;
import java.util.ArrayList;

/**
 *
 * @author Adrian H
 */
public class casasServicio {
    public void listarCasas(String opc) throws Exception {

        CasaDAO fdao = new CasaDAO();
        ArrayList<casas> casas;
      
        casas = fdao.listarCasas(opc);
        
        for (casas aux : casas) {
            System.out.println(aux.toString());
        }
    }
}
