/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Adrian H
 */
public final class Botas extends Dispositivo{

    public Botas() {
    }

    
    public Botas(boolean estado) {
        super(estado);
    }

    public int usarBotas() {
        /**
         * Al utilizar un dispositivo existe un 30% de posibilidades de que se
         * dañe
         */
        if (Math.random() <= 0.3) {
            estado = false;
            return consumo;
        } else {
            return consumo;
        }
    }

    @Override
    public String toString() {
        return "Botas{" + "consumo=" + consumo + ", estado=" + estado + '}';
    }
    
}
