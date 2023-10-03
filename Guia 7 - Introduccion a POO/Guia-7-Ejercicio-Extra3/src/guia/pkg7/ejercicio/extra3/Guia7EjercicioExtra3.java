/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia.pkg7.ejercicio.extra3;

import Game.Juego;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class Guia7EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Crea una clase "Juego" que tenga un método "iniciar_juego" que
         * permita a dos jugadores jugar un juego de adivinanza de números. El
         * primer jugador elige un número y el segundo jugador intenta
         * adivinarlo. El segundo jugador tiene un número limitado de intentos y
         * recibe una pista de "más alto" o "más bajo" después de cada intento.
         * El juego termina cuando el segundo jugador adivina el número o se
         * queda sin intentos. Registra el número de intentos necesarios para
         * adivinar el número y el número de veces que cada jugador ha ganado.
         */
        
        Juego juego = new Juego();
        Scanner leer = new Scanner(System.in);
        boolean seguirJugando = true;

        while (seguirJugando) {
            juego.iniciar_juego();
            juego.mostrar_ganadores();

            System.out.println("¿Quieres seguir jugando? (Si/No)");
            
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("No")) {
                seguirJugando = false;
                juego.mostrarFinal();
            }
        }
    }
    
}
