/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg8.ejercicio2;

import Entidad.Cafetera;
import Service.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia8Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Programa Nespresso. Desarrolle una clase Cafetera en el paquete
         * Entidades con los atributos capacidadMáxima (la cantidad máxima de
         * café que puede contener la cafetera) y cantidadActual (la cantidad
         * actual de café que hay en la cafetera). Agregar constructor vacío y
         * con parámetros así como setters y getters.
         * Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
         * Método llenarCafetera(): hace que la cantidad actual sea igual a la
         * capacidad máxima.
         * Método servirTaza(int): se pide el tamaño de una
         * taza vacía, el método recibe el tamaño de la taza y simula la acción
         * de servir la taza con la capacidad indicada. Si la cantidad actual de
         * café “no alcanza” para llenar la taza, se sirve lo que quede.
         * El método le informará al usuario si se llenó o no la taza, y de no
         * haberse llenado en cuanto quedó la taza.
         * Método vaciarCafetera(): pone la cantidad de café actual en cero.
         * Método agregarCafe(int): se le pide al usuario una cantidad de café,
         * el método lo recibe y se añade a la cafetera la cantidad de
         * café indicada.
         */
        
        CafeteraService CS = new CafeteraService();
        Scanner leer = new Scanner(System.in);
        Cafetera C = CS.llenarCafetera();
        int opc;
        do{
        System.out.println("MENU: \n Ingrese una opcion: \n 1 - llenar taza \n 2 - Vaciar cafetera \n 3 -  Servir taza \n 4 - Agregar cafe \n 5 - Salir");
         opc = leer.nextInt();
         switch(opc){
             case 1: 
                 System.out.println("Ingrese el tamaño de la taza vacia");
                 CS.servirTaza(leer.nextInt());
                 break;
             case 2:
                 System.out.println("Vaciando cafetera...");
                 CS.vaciarCafetera();
                 break;
             case 3:
                 System.out.println("Ingrese la cantidad de cafe que desea agregar");
                 CS.agregarCafe(leer.nextInt());
                 break;
             case 4:
                 System.out.println("Ingrese la cantidad de cafe que desea servir a la taza");
                CS.servirTaza(leer.nextInt());
                continue;
             case 5:
                 System.out.println("Adios....");
                 break;
         }
        }while(opc != 5);
    }
    
}
