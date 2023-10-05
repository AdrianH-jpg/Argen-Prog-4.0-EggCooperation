/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Adrian H
 */
public class MesSecreto {
     private String[] meses = new String[12];
    private String mesSecreto;

    public MesSecreto() {
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";        
        meses[4]="mayo";
        meses[5]="junio";        
        meses[6]="julio";        
        meses[7]="agosto";        
        meses[8]="septiembre";        
        meses[9]="octubre";        
        meses[10]="noviembre";        
        meses[11]="diciembre";                
        mesSecreto=meses[(int)(Math.random()*12)];
    }   

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
}
