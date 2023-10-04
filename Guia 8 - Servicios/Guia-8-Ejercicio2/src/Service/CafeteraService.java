/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author Adrian H
 */
// Importa la clase Scanner para la entrada de datos
import Entidad.Cafetera;
import java.util.Scanner;

// La clase que gestiona las operaciones de la cafetera
public class CafeteraService {
    // Crea una instancia de Scanner para recibir la entrada del usuario
    private Scanner input = new Scanner(System.in);
    
    // Crea una instancia de Cafetera para realizar operaciones en ella
    private Cafetera C = new Cafetera();
    
    // Método para llenar la cafetera y establecer su capacidad máxima y cantidad actual
    public Cafetera llenarCafetera() {
        System.out.println("Ingrese la capacidad de la cafetera");
        C.setCapacidadMaxima(input.nextInt());
        C.setCantidadActual(C.getCapacidadMaxima());
        return C;
    }
    
    // Método para servir una taza de café de la cafetera
    public Cafetera servirTaza(int T) {
         /**
         * Método servirTaza(int): se pide el tamaño de una taza vacía, el
         * método recibe el tamaño de la taza y simula la acción de servir la
         * taza con la capacidad indicada. Si la cantidad actual de café “no
         * alcanza” para llenar la taza, se sirve lo que quede. El método le
         * informará al usuario si se llenó o no la taza, y de no haberse
         * llenado en cuanto quedó la taza.
         */
        if (C.getCantidadActual() == 0) {
            System.out.println("La cafetera está vacía, por favor llénela.");
        } else if (T < C.getCantidadActual()) {
            System.out.println("Sirviendo...");
            C.setCantidadActual(C.getCantidadActual() - T);
        } else {
            System.out.println("La cantidad actual de la cafetera es inferior a la taza.");
            System.out.println("Sirviendo...");
            System.out.println("Se cargó " + C.getCantidadActual() + " de café a la taza.");
            C.setCantidadActual(0);
        }
        return C;
    }
    
    // Método para vaciar completamente la cafetera
    public Cafetera vaciarCafetera() {
        C.setCantidadActual(0);
        return C;
    }
    
    // Método para agregar café a la cafetera
    public Cafetera agregarCafe(int cafe) {
        if (C.getCapacidadMaxima() < C.getCantidadActual() + cafe) {
            System.out.println("No se puede agregar más café del que puede contener la cafetera.");
            System.out.println("El máximo a ingresar es " + (C.getCapacidadMaxima() - C.getCantidadActual()));
        } else {
            System.out.println("Se agregó correctamente el café.");
            C.setCantidadActual(C.getCantidadActual() + cafe);
        }
        return C;
    }
}
