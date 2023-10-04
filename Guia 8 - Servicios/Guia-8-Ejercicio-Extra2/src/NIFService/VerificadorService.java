/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NIFService;

import NIF.Verificador;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class VerificadorService {
    // Definición de un vector que contiene las letras correspondientes a los números del DNI
char[] VectorLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

// Instancia de la clase Nif que representa un número de identificación fiscal (DNI)
Verificador dni = new Verificador();

// Constructor de la clase NifServicio
public VerificadorService() {
}

// Método para crear un nuevo DNI
public void crearNif() {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el DNI: ");
    long DNI = input.nextLong();
    dni.setDNI(DNI);
    int resto = (int) DNI % 23;
    char letra = VectorLetras[resto];
    dni.setLetra(letra);
}

// Método para mostrar el DNI con su letra correspondiente
public void mostrar() {
    System.out.println("DNI: " + dni.getDNI() + "-" + dni.getLetra());
}

}
