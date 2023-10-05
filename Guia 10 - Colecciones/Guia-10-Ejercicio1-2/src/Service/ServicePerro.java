/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Adrian H
 */
public class ServicePerro {
    private Scanner leer = new Scanner(System.in);
    private ArrayList <Perro> perroLista;

    public ServicePerro() {
        this.perroLista = new ArrayList();
    }
    
    
    public Perro CrearPerro(){
        System.out.println("Ingrese la raza del perro");
        String raza = leer.next();
        
        return new Perro(raza);

    }
    
    public void mostrarPerro(){
        System.out.println("Las razas guardadas en la lista son:");
        for (Perro aux : perroLista) {
            System.out.println(aux.toString());
        }
    }
    public void actualizarPerro(){
        System.out.println("Ingrese raza de perro a buscar");
        String tipo = leer.next();
        boolean f = false;
        Iterator it = perroLista.iterator();
        while(it.hasNext()){
            
            if(it.next().toString().equalsIgnoreCase(tipo)){
                it.remove();
                f=true;
            }
        }
        if(f){
            System.out.println("Se elimino la raza de perro");
            mostrarPerro();
        }
        else{
            System.out.println("No se encotro la raza de perro");
            mostrarPerro();
        }
    }
    
    public void ingresarPerro(){
        String opc;
        do {
            
            perroLista.add(CrearPerro());
            System.out.println("Desea ingresar una raza de perro? S/N");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
        mostrarPerro();
    }
}
