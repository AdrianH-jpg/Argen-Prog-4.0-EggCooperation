/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alojamiento;
import Entidad.Hijo.Camping;
import Entidad.Hijo.Hotel;
import Entidad.Hijo.HotelCinco;
import Entidad.Hijo.HotelCuatro;
import Entidad.Hijo.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServicioAlojamiento {
    /*
    Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
    • todos los alojamientos.
    • todos los hoteles de más caro a más barato.
    • todos los campings con restaurante
    • todos las residencias que tienen descuento. 
     */
    public ArrayList<Alojamiento> listaAlojamientos() {

        ArrayList<Alojamiento> listaAlojamientos = new ArrayList<>();

        HotelCuatro hotel1 = new HotelCuatro(true, "Restaurante del Hotel", 100, 150.0, 50, 200, 10, 100, "Hotel Ejemplo 1", "Calle Ejemplo 1", "Ciudad Ejemplo 1", "Gerente Ejemplo 1");
        HotelCuatro hotel2 = new HotelCuatro(false, "Restaurante Principal", 80, 120.0, 40, 150, 8, 90, "Hotel Ejemplo 2", "Calle Ejemplo 2", "Ciudad Ejemplo 2", "Gerente Ejemplo 2");
        HotelCuatro hotel3 = new HotelCuatro(true, "Restaurante Exclusivo", 120, 180.0, 60, 250, 12, 150, "Hotel Ejemplo 3", "Calle Ejemplo 3", "Ciudad Ejemplo 3", "Gerente Ejemplo 3");

        HotelCinco hotel4 = new HotelCinco(5, 10, 3, true, "Restaurante del Hotel", 100, 200.0, 80, 150, 15, 120, "Hotel Ejemplo 1", "Calle Ejemplo 1", "Ciudad Ejemplo 1", "Gerente Ejemplo 1");
        HotelCinco hotel5 = new HotelCinco(3, 8, 2, false, "Restaurante Principal", 80, 180.0, 70, 120, 12, 100, "Hotel Ejemplo 2", "Calle Ejemplo 2", "Ciudad Ejemplo 2", "Gerente Ejemplo 2");
        HotelCinco hotel6 = new HotelCinco(7, 12, 4, true, "Restaurante Exclusivo", 120, 250.0, 100, 180, 20, 150, "Hotel Ejemplo 3", "Calle Ejemplo 3", "Ciudad Ejemplo 3", "Gerente Ejemplo 3");

        Camping camping1 = new Camping(50, 10, true, false, 5000, "Camping Ejemplo 1", "Calle Ejemplo 1", "Ciudad Ejemplo 1", "Gerente Ejemplo 1");
        Camping camping2 = new Camping(30, 5, true, true, 3000, "Camping Ejemplo 2", "Calle Ejemplo 2", "Ciudad Ejemplo 2", "Gerente Ejemplo 2");
        Camping camping3 = new Camping(40, 8, false, false, 4000, "Camping Ejemplo 3", "Calle Ejemplo 3", "Ciudad Ejemplo 3", "Gerente Ejemplo 3");

        Residencia residencia1 = new Residencia(50, true, false, false, 5000, "Residencia Ejemplo 1", "Calle Ejemplo 1", "Ciudad Ejemplo 1", "Gerente Ejemplo 1");
        Residencia residencia2 = new Residencia(30, false, true, true, 3000, "Residencia Ejemplo 2", "Calle Ejemplo 2", "Ciudad Ejemplo 2", "Gerente Ejemplo 2");
        Residencia residencia3 = new Residencia(40, true, true, false, 4000, "Residencia Ejemplo 3", "Calle Ejemplo 3", "Ciudad Ejemplo 3", "Gerente Ejemplo 3");

        listaAlojamientos.add(hotel1);
        listaAlojamientos.add(hotel2);
        listaAlojamientos.add(hotel3);
        listaAlojamientos.add(hotel4);
        listaAlojamientos.add(hotel5);
        listaAlojamientos.add(hotel6);
        listaAlojamientos.add(camping1);
        listaAlojamientos.add(camping2);
        listaAlojamientos.add(camping3);
        listaAlojamientos.add(residencia1);
        listaAlojamientos.add(residencia2);
        listaAlojamientos.add(residencia3);

        return listaAlojamientos;
    }

    public void menu(ArrayList<Alojamiento> listaAlojamiento) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" -- BIENBENIDO A ALOJAMIENTO CHAPAMADAL -- ");
        int var;
        do {
            System.out.println("--MENU--\n");
            System.out.println("OPCION 1 - Todos los alojamientos\n"
                    + "OPCION 2 - Hoteles mas caros a mas baratos\n"
                    + "OPCION 3 - Camping con restaurante\n"
                    + "OPCION 4 - Residencias con descuento\n"
                    + "OPCION 5 - Salir\n");
            var = leer.nextInt();

            switch (var) {
                case 1:
                    for (Alojamiento alojamiento : listaAlojamiento) {
                        System.out.println(alojamiento.toString());
                    }
                    break;
                case 2:
                    Collections.sort(listaAlojamiento, new Comparator<Alojamiento>() {
                        @Override
                        public int compare(Alojamiento a1, Alojamiento a2) {
                            return Double.compare(a2.precioHabitacion(), a1.precioHabitacion());
                        }
                    });

                    for (Alojamiento alojamiento : listaAlojamiento) {
                        if (alojamiento instanceof Hotel) {
                            System.out.println(alojamiento.toString());
                        }
                    }
                    break;
                case 3:
                    for (Alojamiento alojamiento : listaAlojamiento) {
                        if (alojamiento instanceof Camping && ((Camping) alojamiento).isResto()) {
                            System.out.println(alojamiento.toString());
                        }
                    }
                    break;
                case 4:
                    for (Alojamiento alojamiento : listaAlojamiento) {
                        if (alojamiento instanceof Residencia && ((Residencia) alojamiento).isDesGremios()) {
                            System.out.println(alojamiento.toString());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nos vemos....");
                    break;
                default:
                    System.out.println("Ingreso mal la Opcion.");
                    break;
            }
        } while (var != 5);
    }
}
