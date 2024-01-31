package Map.Ejercicios.EJ1;

import java.util.Objects;

public class Pais {

    private String nombre;
    private int poblacion;

    public Pais(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPoblacion() {
        return poblacion;
    }

    @Override
    public String toString() {
        return nombre;
    }

}



