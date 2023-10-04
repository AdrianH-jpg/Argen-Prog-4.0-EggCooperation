/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Raices;

/**
 *
 * @author Adrian H
 */
public class RaicesService {
    
    public double getDiscriminante(Raices r){
        
        return Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC());

    }
    
    public boolean tieneRaices(Raices r) {
        double discriminante = getDiscriminante(r);
        return discriminante > 0;
    }
    
    public boolean tieneRaiz(Raices r) {
    double discriminante = getDiscriminante(r);
    return discriminante == 0;
    }
    
    public void obtenerRaices(Raices r) {
        
        if (tieneRaices(r)) {
            double x1 = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            double x2 = (-r.getB() - Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            System.out.println("Las raíces son: " + x1 + " y " + x2);
        } else {
            System.out.println("La ecuación no tiene dos raíces reales.");
        }
    }
    
    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            double raiz = (-r.getB() + Math.sqrt(getDiscriminante(r))) /(2*r.getA());
            System.out.println("La única raíz es: " + raiz);
        } else {
            System.out.println("No tiene una única raíz.");
        }
    }
    
    public void calcular(Raices r) {
        double discriminante = getDiscriminante(r);

        if (tieneRaices(r)) {
            System.out.println("La ecuación tiene dos posibles soluciones:");
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            System.out.println("La ecuación tiene una única solución: ");
            obtenerRaiz(r);
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }
}
