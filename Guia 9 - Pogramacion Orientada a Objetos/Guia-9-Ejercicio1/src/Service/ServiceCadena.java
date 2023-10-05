/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServiceCadena {
    // Declaración de la variable 'frase' de tipo Cadena que almacenará una frase.
private Cadena frase;

// Método para contar y mostrar la cantidad de vocales en la frase.
public void mostrarVocales(Cadena frase) {
    this.frase = frase;
    int cont = 0;
    for (int i = 0; i < frase.getLongitud(); i++) {
        switch (frase.getFrase().substring(i, i + 1).toUpperCase()) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                cont++;
                break;
            default:
                break;
        }
    }
    System.out.println("La cantidad de vocales es: " + cont);
}

// Método para invertir y mostrar la frase.
public void invertirFrase(Cadena frase) {
    for (int i = frase.getLongitud() - 1; i >= 0; i--) {
        System.out.print(frase.getFrase().charAt(i));
    }
    System.out.println("");
}

// Método para contar cuántas veces se repite una letra en la frase y mostrarlo.
public void vecesRepetido(String letra) {
    int cont = 0;
    for (int i = 0; i < frase.getLongitud(); i++) {
        if (frase.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
            cont++;
        }
    }

    if (cont > 1) {
        System.out.println("La letra " + letra + " está repetida " + cont + " veces.");
    } else if (cont == 1) {
        System.out.println("La letra " + letra + " no está repetida.");
    } else {
        System.out.println("La letra " + letra + " no está en la frase.");
    }
}

// Método para comparar la longitud de la frase actual con otra frase.
public void compararLongitud(String nFrase) {
    if (frase.getLongitud() > nFrase.length()) {
        System.out.println("La frase ingresada tiene una longitud menor.");
    } else if (frase.getLongitud() == nFrase.length()) {
        System.out.println("La frase ingresada tiene una longitud igual.");
    } else {
        System.out.println("La frase ingresada tiene una longitud mayor.");
    }
}

// Método para unir la frase actual con otra frase.
public void unirFrase(String nFrase) {
    System.out.println(frase.getFrase() + " " + nFrase);
}

// Método para reemplazar todas las apariciones de la letra 'A' por otra letra especificada.
public void reemplazar(String letra) {
    for (int i = 0; i < frase.getLongitud(); i++) {
        if (frase.getFrase().substring(i, i + 1).equalsIgnoreCase("A")) {
            System.out.print(letra);
        } else {
            System.out.print(frase.getFrase().substring(i, i + 1));
        }
    }
}

// Método para verificar si la frase contiene una letra especificada.
public boolean contiene(String letra) {
    return frase.getFrase().contains(letra);
}
public void menu(){
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("BIENVENIDO !");
        System.out.println("Ingrese su frase :");
        frase.setFrase(input.nextLine());
        mostrarVocales(frase);
        invertirFrase(frase);
        System.out.println("Ingrese una letra a comparar");
        String r = input.next();
        vecesRepetido(r);
        if (contiene(r)) {
            System.out.println("La frace contiene el Caracter");
        }else{
            System.out.println("La frace NO contiene el Caracter");
        }
        reemplazar(r);
        System.out.println("Ingrese una nueva frase");
        String frace2 = input.nextLine();
        compararLongitud(frace2);
        unirFrase(frace2);
    }  

}
