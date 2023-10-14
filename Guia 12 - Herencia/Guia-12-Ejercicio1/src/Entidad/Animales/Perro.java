/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad.Animales;

import Entidad.Animal;

/**
 *
 * @author Adrian H
 */
public class Perro extends Animal{
    
   public Perro(String Nombre, String Alimento, int Edad, String Raza) {
        super(Nombre, Alimento, Edad, Raza);
        
    }
    
    @Override
    public void Alimentarse(){
        String alimento = super.getAlimento();
        System.out.println("Se alimenta de: " + alimento);
    }
}
