/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Pais;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Adrian H
 */
public class ServicePais {
    private Set<Pais> listaPais;
    private Scanner input = new Scanner(System.in);
    public ServicePais() {
        this.listaPais = new HashSet<>();
    }
    
    public Pais agregarPais(String nPais){
        Pais p = new Pais(nPais);
        return p;
    }
    
    public void ingresarPais() {
        boolean salir = false;
        while (!salir) {
            System.out.println("Inserte nombre del pais");
            String nPais = input.nextLine();
            if (!nPais.equals("")) {
                if (!listaPais.contains(agregarPais(nPais))) {
                    listaPais.add(agregarPais(nPais));
                    System.out.println("País agregado.");
                } else {
                    System.out.println("El país ya está en la lista.");
                }
            }
            System.out.println("¿Desea ingresar otro pais? (s/n): ");
            String opcion = input.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                salir = true;
            }
        }
    }
    public void mostrarPais(){
        System.out.println("Los paices guardados en la lista son:");
        listaPais.forEach((aux) -> {
            System.out.println(aux.toString());
        });
    }
    
    public void ordenarAlfa(){
        // Ordenar los países alfabéticamente y mostrarlos
        Set<Pais> paisesOrdenados = new TreeSet<>(listaPais);
        System.out.println("Lista de países ordenados alfabéticamente:");
        for (Pais p : paisesOrdenados) {
            System.out.println("- " + p);
        }
    }
    
    public void eliminarPais(){
        // Eliminar un país de la lista
        System.out.print("Ingrese un país para eliminar: ");
        String nPais = input.nextLine();
        if (listaPais.contains(agregarPais(nPais))) {
            listaPais.remove(agregarPais(nPais));
            System.out.println("País eliminado.");
            System.out.println("Lista de países actualizada:");
            for (Pais p : listaPais) {
                System.out.println("- " + p);
            }
        } else {
            System.out.println("El país no está en la lista.");
        }
    }
}
