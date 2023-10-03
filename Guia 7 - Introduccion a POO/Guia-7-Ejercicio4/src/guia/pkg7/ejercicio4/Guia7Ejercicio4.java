/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg7.ejercicio4;

import Forma.Rectangulo;

/**
 *
 * @author Adrian H
 */
public class Guia7Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crear una clase Rectángulo que modele rectángulos por medio de un
         * atributo privado base y un atributo privado altura. La clase incluirá
         * un método para crear el rectángulo con los datos del Rectángulo dados
         * por el usuario. También incluirá un método para calcular la
         * superficie del rectángulo y un método para calcular el perímetro del
         * rectángulo. Por último, tendremos un método que dibujará el
         * rectángulo mediante asteriscos usando la base y la altura. Se deberán
         * además definir los métodos getters, setters y constructores
         * correspondientes. Superficie = base * altura / Perímetro = (base +
         * altura) * 2.
         */
        
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();
        System.out.println("La superficie del rectángulo es: " + rectangulo.calcularSuperficie());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
        rectangulo.dibujarRectangulo();
    }
    
}
