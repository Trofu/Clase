package Map.Ejercicios.EJ2;

import  java.util.*;
public class PeliculaTO {
    String titulo;
    List<String> actores;
    List<String> directores;

    public PeliculaTO(String titulo) {
        this.titulo=titulo;
        actores = new ArrayList<>();
        directores = new ArrayList<>();
    }
    public List<String> getActores() {
        return actores;
    }
    public void addActor(String actor) {
        actores.add(actor);
    }
}
