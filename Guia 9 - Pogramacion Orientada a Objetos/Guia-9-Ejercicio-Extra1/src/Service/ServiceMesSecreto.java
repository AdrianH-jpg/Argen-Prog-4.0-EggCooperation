/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.MesSecreto;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServiceMesSecreto {
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void iniciarJuego(MesSecreto m) {
        String mes;
        do {
            System.out.println("Adivine el mes secreto. Ingrese el mes en minusculas");
            mes = input.next();
            if (mes.equals(m.getMesSecreto())) {
                System.out.println("Ha acertado el mes secreto");
            } else {
                System.out.println("No ha acertado, intente nuevamente");
            }
        } while (!mes.equals(m.getMesSecreto()));
    }
}
