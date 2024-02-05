package Map.Ejercicios.EJ1;

import java.util.Comparator;
import java.util.Objects;

public class
Pais implements Comparable<Pais> {


    public static Comparator<Pais> SORT_BY_POPULATION = (o1, o2) -> o1.getPoblacion() - o2.getPoblacion();

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
        return " Pais: "+ nombre;
    }

    @Override
    public int hashCode(){
        return nombre.hashCode()+poblacion;
    }

    @Override
    public boolean equals(Object obj){
        if (obj==null||!(obj instanceof Pais))
                return false;
        Pais pais = (Pais) obj;
        return nombre.equals(pais.getNombre());
    }

    @Override
    public int compareTo(Pais pais){
        return nombre.compareTo(pais.getNombre());
    }



}



