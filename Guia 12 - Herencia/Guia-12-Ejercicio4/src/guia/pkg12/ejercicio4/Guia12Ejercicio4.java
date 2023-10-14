/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg12.ejercicio4;

import Forma.Circulo;
import Forma.Rectangulo;

/**
 *
 * @author Adrian H
 */
public class Guia12Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Se plantea desarrollar un programa que nos permita calcular el área y
         * el perímetro de formas geométricas, en este caso un círculo y un
         * rectángulo. Ya que este cálculo se va a repetir en las dos formas
         * geométricas, vamos a crear una Interfaz, llamada calculosFormas que
         * tendrá, los dos métodos para calcular el área, el perímetro y el
         * valor de PI como constante. Desarrollar el ejercicio para que las
         * formas implementen los métodos de la interfaz y se calcule el área y
         * el perímetro de los dos. En el main se crearán las formas y se
         * mostrará el resultado final. Área circulo: PI * radio ^ 2 / Perímetro
         * circulo: PI * diámetro. Área rectángulo: base * altura / Perímetro
         * rectángulo: (base + altura) * 2
         */
        
        Circulo circulo = new Circulo(5);
        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Perímetro del círculo: " + perimetroCirculo);

        Rectangulo rectangulo = new Rectangulo(4, 6);
        double areaRectangulo = rectangulo.calcularArea();
        double perimetroRectangulo = rectangulo.calcularPerimetro();
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
    }
    
}
