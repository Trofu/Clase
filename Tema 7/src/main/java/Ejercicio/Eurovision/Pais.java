package Ejercicio.Eurovision;

import java.util.*;

public class Pais{

    private String nombre;
    private String cantante;
    private String cancion;
    private Map<Pais,Integer> votos;
    private List<Integer> puntuacion;


    public Pais(String nombre, String nombre_cantante, String cancion) {
        this.nombre = nombre;
        this.cantante = nombre_cantante;
        this.cancion = cancion;
        votos= new HashMap<>();
        puntuacion=puntos();
    }

    public boolean votar(Pais pais,Integer punto) {
        for (int puntos : puntuacion){
            if (punto == puntos) {
                puntuacion.remove(punto);
                votos.put(pais, puntos);
                System.out.println(puntuacion);
                return true;
            }
        }
        return false;
    }

    private List<Integer> puntos(){
        List<Integer> puntuacion = new ArrayList<>();
        for (int i = 1; i <=8; i++) {
            puntuacion.add(i);
        }
        puntuacion.add(10);
        puntuacion.add(12);
        return puntuacion;
    }

    @Override
    public String toString() {
        return "Pais: "+nombre+" con la cancion: "+cancion+" interpretada por: "+cantante;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Pais)) return false;
        Pais pais = (Pais) o;
        return Objects.equals(nombre, pais.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
