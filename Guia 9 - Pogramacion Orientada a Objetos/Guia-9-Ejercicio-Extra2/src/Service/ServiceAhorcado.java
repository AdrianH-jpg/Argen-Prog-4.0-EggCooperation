/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServiceAhorcado {
    Ahorcado palabraJuego = new Ahorcado();
    Scanner input = new Scanner(System.in);
    
    int encontradas = 0;
    
    public Ahorcado crearJuego() {
        /**
         * Metodo crearJuego(): le pide la palabra al usuario y cantidad de
         * jugadas máxima. Con la palabra del usuario, pone la longitud de la
         * palabra, como la longitud del vector. Después ingresa la palabra en
         * el vector, letra por letra, quedando cada letra de la palabra en un
         * índice del vector. Y también, guarda la cantidad de jugadas máximas y
         * el valor que ingresó el usuario.
         */
        System.out.println("Ingrese una palabra : ");
        String palabra = input.nextLine();
        String[] palabraVector = new String[palabra.length()];
        palabraJuego.setVectorPalabra(palabraVector);
        System.out.println("Ingrese la Cantidad de jugadas maximas : ");
        palabraJuego.setJugadasMax(input.nextInt());

        for (int i = 0; i < palabra.length(); i++) {
            /**
             * esta línea de código convierte cada letra de la palabra en un
             * objeto String y lo agrega al vector vectorPalabra. Es necesario
             * convertir el carácter en un objeto String para poder almacenarlo
             * en un vector de strings.
             */
            palabraVector[i] = String.valueOf(palabra.charAt(i));
        }
        return palabraJuego;
    }

    public void longitud() {
        /**
         * Método longitud(): muestra la longitud de la palabra que se debe
         * encontrar. Nota: buscar como se usa el vector.length.
         */
        System.out.println("La longitud de la palabra es : " + palabraJuego.getVectorPalabra().length);
    }

    public boolean buscar(String letra) {
        /**
         * Método buscar(letra): este método recibe una letra dada por el
         * usuario y busca si la letra ingresada es parte de la palabra o no.
         * También informará si la letra estaba o no.
         */
        boolean acierto = false;
        for (int i = 0; i < (palabraJuego.getVectorPalabra().length); i++) {
            if (palabraJuego.getVectorPalabra()[i].equals(letra)) {
                acierto = true;
            }
        }
        if (acierto) {
            System.out.println("La letra se encuentra en la palabra");
        } else {
            System.out.println("La letra NO se encuentra en la palabra");
        }
        return acierto;
    }

    public boolean encontradas(String letra) {
        /**
         * Método encontradas(letra): que reciba una letra ingresada por el
         * usuario y muestre cuantas letras han sido encontradas y cuántas le
         * faltan. Este método además deberá devolver true si la letra estaba y
         * false si la letra no estaba, ya que, cada vez que se busque una letra
         * que no esté, se le restará uno a sus oportunidades.
         */
        boolean acierto = false;
        if (buscar(letra)) {
            encontradas++;
        } else {
            palabraJuego.setJugadasMax((palabraJuego.getJugadasMax()-1));
            if (palabraJuego.getJugadasMax() == 0){
                System.out.println("USTED A PERDIDO .... ");
            }
        }
        System.out.println("Numeros de letras (encontradas/faltantes)" + encontradas + "/" + (palabraJuego.getVectorPalabra().length-encontradas));
        return acierto;
    }

    public void intentos() {
        /**
         * Método intentos(): para mostrar cuántas oportunidades le queda al
         * jugador.
         */
        System.out.println("Intentos restantes : " + palabraJuego.getJugadasMax());
    }

    public void juego() {
        /**
         * Método juego(): el método juego se encargará de llamar todos los
         * métodos previamente mencionados e informará cuando el usuario
         * descubra toda la palabra o se quede sin intentos. Este método se
         * llamará en el main.
         */

        crearJuego();
        longitud();
        do {
            if (encontradas != palabraJuego.getVectorPalabra().length){
                System.out.println("Ingrese una letra : ");
                String letra = input.next();
                encontradas(letra);
                intentos();
            }else{
                System.out.println(" ACERTO TODAS LAS LETRAS ! FELICITACIONES ");
                palabraJuego.setJugadasMax(0);
            }
        }while (palabraJuego.getJugadasMax() != 0);
    }
}
