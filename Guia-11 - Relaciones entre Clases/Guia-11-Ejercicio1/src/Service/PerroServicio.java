/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Mascota.Perro;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class PerroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Perro agregarPerro(){
        //pasa a variables los datos del teclado
        System.out.println("Ingrese el nombre del perro");
        String nombre = leer.next();
        System.out.println("Ingrese la raza del perro");
        String raza = leer.next();
        System.out.println("Ingrese la edad del perro");
        int edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el tamaño del perro (chico/mediano/grande)");
        String tamano = leer.next();
        //retorna un objeto perro al constructor con todos sus atributos
        return new Perro(nombre,raza,edad,tamano);
    }
    

}
