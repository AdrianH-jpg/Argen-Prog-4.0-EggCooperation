/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg12.ejercicio1;

import Entidad.Animal;
import Entidad.Animales.Caballo;
import Entidad.Animales.Gato;
import Entidad.Animales.Perro;

/**
 *
 * @author Adrian H
 */
public class Guia12Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /**
         * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro,
         * Gato, Caballo. La clase Animal tendrá como atributos el nombre,
         * alimento, edad y raza del Animal. Crear un método en la clase Animal
         * a través del cual cada clase hija deberá mostrar luego un mensaje por
         * pantalla informando de que se alimenta. Generar una clase Main que
         * realice lo siguiente:
         */
         
        Animal perro1 = new Perro("firu", "carne",10,"cruza calle");
        perro1.Alimentarse();
        Animal perro2 = new Perro("teddy", "croquetas",10,"chihuahua");
        perro2.Alimentarse();
        Animal gato1 = new Gato("peluza", "galletas",15,"siames");
        gato1.Alimentarse();
        Animal caballo1 = new Caballo("Spark", "pasto",25,"fino");
        caballo1.Alimentarse();
    }
    
}
