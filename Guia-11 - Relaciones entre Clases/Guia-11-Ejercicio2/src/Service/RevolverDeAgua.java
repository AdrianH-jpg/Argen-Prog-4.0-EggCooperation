/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.Random;

/**
 *
 * @author Adrian H
 */
public class RevolverDeAgua {
    private double posActual;
    private double posAgua;
    
    public void llenarRevolver(){
        Random random = new Random();
        this.posActual = random.nextInt(6)+1;
        this.posAgua = random.nextInt(6)+1;
    }
    
    public boolean mojar(){
        boolean aux = false;
        if (posActual == posAgua){
            aux = true;
        }
        return aux;
    }
    
    public void siguienteChorro(){
        if (posActual == 6){
            posActual = 1;
        }else{
            posActual ++;
        }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }  
}
