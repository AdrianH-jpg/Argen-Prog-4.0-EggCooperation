/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Juego {
    // Definición de variables de clase para el juego
private int numJugador1;  // Número elegido por el Jugador 1
private int numJugador2;  // Número adivinado por el Jugador 2
private int intentos;     // Cantidad de intentos realizados por el Jugador 2
private int ganador1;     // Cantidad de victorias del Jugador 1
private int ganador2;     // Cantidad de victorias del Jugador 2

// Constructor de la clase Juego, inicializa las victorias en cero para ambos jugadores
public Juego() {
    ganador1 = 0;
    ganador2 = 0;
}

// Método para iniciar el juego
public void iniciar_juego() {
    Scanner input = new Scanner(System.in);

    // Mensaje de bienvenida
    System.out.println("¡Juego de adivinanza de números!");

    // Jugador 1 elige un número
    System.out.println("Jugador 1, elija un número: ");
    numJugador1 = input.nextInt();
    input.nextLine();

    // Jugador 2 intenta adivinar el número
    System.out.println("Jugador 2, adivina el número: ");
    intentos = 0;
    while (true) {
        numJugador2 = input.nextInt();
        input.nextLine();
        intentos++;

        if (numJugador2 == numJugador1) {
            System.out.println("¡Adivinaste el número!");
            if (intentos == 1) {
                System.out.println("¡Ganaste en 1 intento!");
            } else {
                System.out.println("¡Ganaste en " + intentos + " intentos!");
            }
            break;
        } else if (numJugador2 < numJugador1) {
            System.out.println("Más alto. Intenta de nuevo: ");
        } else {
            System.out.println("Más bajo. Intenta de nuevo: ");
        }

        if (intentos == 3) {
            System.out.println("¡Te has quedado sin intentos!");
            System.out.println("El número correcto era: " + numJugador1);
            break;
        }
    }

    // Registrar ganador
    if (numJugador2 == numJugador1) {
        ganador2++; // Jugador 2 gana
    } else {
        ganador1++; // Jugador 1 gana
    }
}

// Método para mostrar el resultado final del juego
public void mostrarFinal() {
    if (ganador1 == ganador2) {
        System.out.println("Empate");
    } else if (ganador1 > ganador2) {
        System.out.println("Jugador 1 es el ganador");
    } else {
        System.out.println("Jugador 2 es el ganador");
    }
}

// Método para mostrar la cantidad de victorias de cada jugador
public void mostrar_ganadores() {
    System.out.println("Jugador 1: " + ganador1 + " ganador(es)");
    System.out.println("Jugador 2: " + ganador2 + " ganador(es)");
}

}
