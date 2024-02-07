package Ejercicio.Eurovision;

import java.util.Set;

public class Pais {

    private String nombre;
    private String nombre_cantante;
    private String cancion;
    private Set<Pais> votos;


    public Pais(String nombre, String nombre_cantante, String cancion) {
        this.nombre = nombre;
        this.nombre_cantante = nombre_cantante;
        this.cancion = cancion;
        votos=null;
    }

    public void votar(){

    }

    @Override
    public String toString() {
        return "Pais: "+nombre+" con la cancion: "+cancion+" interpretada por: "+nombre_cantante;
    }
}
