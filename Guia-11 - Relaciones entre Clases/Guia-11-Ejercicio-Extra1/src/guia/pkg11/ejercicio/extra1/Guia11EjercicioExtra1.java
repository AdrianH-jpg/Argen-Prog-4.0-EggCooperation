/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg11.ejercicio.extra1;

import Service.ServiceAdopcion;

/**
 *
 * @author Adrian H
 */
public class Guia11EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona.
         * Nuestro programa va a tener que contar con muchas personas y muchos
         * perros. El programa deberá preguntarle a cada persona, que perro
         * según su nombre, quiere adoptar. Dos personas no pueden adoptar al
         * mismo perro, si la persona eligió un perro que ya estaba adoptado, se
         * le debe informar a la persona. Una vez que la Persona elige el Perro
         * se le asigna, al final deberemos mostrar todas las personas con sus
         * respectivos perros.
         */
        
//        Perro p1 = new Perro( "Jokina","Galgo", 4 ,"Mediano");
//        Perro p2 = new Perro( "Chiquito","Beagle", 1 ,"Chico");
//        
//        Persona per1 = new Persona("Carlos", "Pelado", 32777999, 43 , p2);
//        Persona per2 = new Persona("Diana", "Cortina", 17555666, 14 , p1);
//        
//        System.out.println(per1.toString());
//        System.out.println(per2.toString());
    
        ServiceAdopcion a = new ServiceAdopcion();
    
        System.out.println("---BIENVENIDO AL CENTRO DE ADOPCION ANIMAL---");
        a.listaPerros();
        a.listaPersonas();
        a.adoptarPerro();
    }
    
}
