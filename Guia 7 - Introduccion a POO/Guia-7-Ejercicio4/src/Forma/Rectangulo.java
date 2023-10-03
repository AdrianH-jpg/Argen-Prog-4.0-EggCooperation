/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forma;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Rectangulo {
    private int base;
    private int altura;

    // Constructor con todos los atributos pasados por parámetro
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Constructor sin los atributos pasados por parámetro
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    // Métodos get y set
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Método para crear el rectángulo con los datos dados por el usuario
    public void crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base del rectángulo: ");
        int base = scanner.nextInt();
        System.out.print("Introduce la altura del rectángulo: ");
        int altura = scanner.nextInt();
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular la superficie del rectángulo
    public int calcularSuperficie() {
        return base * altura;
    }

    // Método para calcular el perímetro del rectángulo
    public int calcularPerimetro() {
        return (base + altura) * 2;
    }

    // Método para dibujar el rectángulo mediante asteriscos
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
