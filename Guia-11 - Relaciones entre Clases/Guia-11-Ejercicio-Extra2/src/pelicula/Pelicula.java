/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

/**
 *
 * @author Adrian H
 */
public class Pelicula {
    /**
     * las películas nos interesa saber el título, duración, edad mínima y
     * director
     */
    
    private String tituloP;
    private String directorP;
    private double duracionP;
    private int edadminP;

    
    public Pelicula() {
    }
    
    public Pelicula(String tituloP, String directorP, double duracionP, int edadminP) {
        this.tituloP = tituloP;
        this.directorP = directorP;
        this.duracionP = duracionP;
        this.edadminP = edadminP;
    }

    public int getEdadminP() {
        return edadminP;
    }

    public void setEdadminP(int edadminP) {
        this.edadminP = edadminP;
    }

    public String getTituloP() {
        return tituloP;
    }

    public void setTituloP(String tituloP) {
        this.tituloP = tituloP;
    }

    public String getDirectorP() {
        return directorP;
    }

    public void setDirectorP(String directorP) {
        this.directorP = directorP;
    }

    public double getDuracionP() {
        return duracionP;
    }

    public void setDuracionP(double duracionP) {
        this.duracionP = duracionP;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "tituloP=" + tituloP + ", directorP=" + directorP + ", duracionP=" + duracionP + ", edadminP=" + edadminP + '}';
    }
}
