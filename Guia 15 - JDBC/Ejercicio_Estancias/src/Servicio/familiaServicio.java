/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.familias;
import Persistencia.FamiliasDAO;
import java.util.ArrayList;

/**
 *
 * @author Adrian H
 */
public class familiaServicio {
    public void listarFamilias(String opc) throws Exception {

        FamiliasDAO fdao = new FamiliasDAO();
        ArrayList<familias> familias = new ArrayList();
        if (opc.equals("a")) {
            familias = fdao.listarfamilia(opc);
        }
        if (opc.equals("d")) {
            familias = fdao.listarfamilia(opc);
        }
        for (familias aux : familias) {
            System.out.println(aux.toString());
        }
    }
}
