/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Botas;
import Entidad.Casco;
import Entidad.Esqueleto;
import Entidad.Generador;
import Entidad.Guantes;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServicioArmadura extends Esqueleto {

    public Esqueleto crearArmadura() {

        Esqueleto armadura;

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-- CREACION DE ARMADURA --");

        // Menú de opciones
        System.out.println("Seleccione una opción:");
        System.out.println("1. Creación manual");
        System.out.println("2. Creación automática");
        int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                armadura = crearArmaduraManual();
                break;
            case 2:
                armadura = crearArmaduraAutomatica2();
                break;
            default:
                System.out.println("Opción inválida. Se creará la armadura de forma automática.");
                armadura = crearArmaduraAutomatica2();
                break;
        }

        return armadura;

    }

    // Método para la creación automática de la armadura
    public Esqueleto crearArmaduraAutomatica2() {
        
        Esqueleto armaduraAU = new Esqueleto();

        System.out.println("-- CREACION AUTOMATICA DE ARMADURA --");

        // Creación de los objetos necesarios para las armaduras
        Botas botaIzquierda2 = new Botas(true);
        Botas botaDerecha2 = new Botas(true);
        Guantes guanteIzquierdo2 = new Guantes(50, true);
        Guantes guanteDerecho2 = new Guantes(60, true);
        Casco casco2 = new Casco(true);
        Generador bateria2 = new Generador(100, true);

        // Ingresar nombre de la armadura
        String nombreArmadura2 = "Armadura Default";
        armaduraAU.setNombreArmadura(nombreArmadura);
        armaduraAU.setColorPrimario(colorPrimario);

        // Ingresar color primario
        String colorPrimario2 = "Rojo";
        armaduraAU.setColorPrimario(colorPrimario2);

        // Ingresar color secundario
        String colorSecundario2 = "Negro";
        armaduraAU.setColorSecundario(colorSecundario2);

        // Ingresar resistencia
        int resistencia2 = 150;
        armaduraAU.setResistencia(resistencia2);

        // Asignar los objetos a la armadura
        armaduraAU.setBotaIzquierda(botaIzquierda2);
        armaduraAU.setBotaDerecha(botaDerecha2);
        armaduraAU.setGuanteIzquierdo(guanteIzquierdo2);
        armaduraAU.setGuanteDerecho(guanteDerecho2);
        armaduraAU.setCasco(casco2);
        armaduraAU.setBateria(bateria2);
        armaduraAU.nivelSalud = 100;
        return armaduraAU;
    }

    // Método para la creación manual de la armadura
    private Esqueleto crearArmaduraManual() {
        Esqueleto armadura = new Esqueleto();

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-- CREACION MANUAL DE ARMADURA --");

        // Ingresar nombre de la armadura
        System.out.print("Nombre de la armadura: ");
        String nombreArmadura = input.next();
        armadura.setNombreArmadura(nombreArmadura);

        // Ingresar color primario
        System.out.print("Color primario: ");
        String colorPrimario = input.next();
        armadura.setColorPrimario(colorPrimario);

        // Ingresar color secundario
        System.out.print("Color secundario: ");
        String colorSecundario = input.next();
        armadura.setColorSecundario(colorSecundario);

        // Ingresar resistencia
        System.out.print("Resistencia: ");
        int resistencia = input.nextInt();
        armadura.setResistencia(resistencia);

        // Creación de los objetos necesarios para las armaduras
        Botas botaIzquierda = new Botas(true);
        Botas botaDerecha = new Botas(true);

        // Ingresar daño de los guantes izquierdo y derecho
        System.out.print("Daño del guante izquierdo: ");
        int danioGuanteIzquierdo = input.nextInt();
        Guantes guanteIzquierdo = new Guantes(danioGuanteIzquierdo, true);

        System.out.print("Daño del guante derecho: ");
        int danioGuanteDerecho = input.nextInt();
        Guantes guanteDerecho = new Guantes(danioGuanteDerecho, true);

        Casco casco = new Casco(true);

        // Ingresar capacidad del generador
        System.out.print("Capacidad del generador: ");
        float capacidadGenerador = input.nextFloat();
        Generador bateria = new Generador(capacidadGenerador, true);

        // Asignar los objetos a la armadura
        armadura.setBotaIzquierda(botaIzquierda);
        armadura.setBotaDerecha(botaDerecha);
        armadura.setGuanteIzquierdo(guanteIzquierdo);
        armadura.setGuanteDerecho(guanteDerecho);
        armadura.setCasco(casco);
        armadura.setBateria(bateria);

        return armadura;
    }
}
