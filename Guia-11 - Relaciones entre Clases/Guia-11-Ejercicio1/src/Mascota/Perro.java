/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascota;

/**
 *
 * @author Adrian H
 */
public class Perro {
    private String Nombre;
    private String Raza;
    private int Edad;
    private String Tamano;

    public Perro() {
    }

    public Perro(String Nombre, String Raza, int Edad, String Tamano) {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Edad = Edad;
        this.Tamano = Tamano;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTamaño() {
        return Tamano;
    }

    public void setTamaño(String Tamano) {
        this.Tamano = Tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "Nombre=" + Nombre + ", Raza=" + Raza + ", Edad=" + Edad + ", Tamano=" + Tamano + '}';
    }
    
    
}
