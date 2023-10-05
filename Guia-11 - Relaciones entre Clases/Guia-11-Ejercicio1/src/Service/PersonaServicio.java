/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Persona;
import Mascota.Perro;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //  una nueva instancia del servicio de perro, que se encarga de la carga del objeto perro
    PerroServicio Sperro = new PerroServicio();
    public Persona agregarPersona(){
        // pasa a variables todos los parametros ingresados por teclado
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese el apellido de la persona");
        String apellido = leer.next();
        System.out.println("Ingrese la edad de la persona");
        int edad = leer.nextInt();
        System.out.println("Ingrese el DNI de la persona");
        int documento = leer.nextInt();
        
        System.out.println("Carga de los datos del perro");
        // Creo una variable local de tipo perro y le asigno el objeto retornado de el servicioPerro en el metodo agregarPerro()
        Perro perro = Sperro.agregarPerro();
        // retorna el objeto Persona al constructor lleno con sus atributos y el objeto Perro generado anteriormente
        return new Persona(nombre,apellido,edad,documento,perro);
    }
    
    public void mostrarPersona(Persona p){
        //muestra
        System.out.println(p.toString());
    }
}
