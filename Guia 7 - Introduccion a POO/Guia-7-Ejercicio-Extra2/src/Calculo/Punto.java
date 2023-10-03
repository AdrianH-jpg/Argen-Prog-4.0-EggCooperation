/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculo;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Punto {
    private double x1, y1, x2, y2;

    // Constructor vacío
    public Punto() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    // Constructor con parámetros
    public Punto(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Métodos getters y setters
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    // Método para crear los puntos
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x del primer punto:");
        this.x1 = leer.nextDouble();
        System.out.println("Ingrese la coordenada y del primer punto:");
        this.y1 = leer.nextDouble();
        System.out.println("Ingrese la coordenada x del segundo punto:");
        this.x2 = leer.nextDouble();
        System.out.println("Ingrese la coordenada y del segundo punto:");
        this.y2 = leer.nextDouble();
    }

    // Método para calcular la distancia entre los dos puntos
    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
        return distancia;
    }
}
