package Ejercicio.Eurovision;

import java.util.*;

public class Pais implements Comparable<Pais>{
    public static final Comparator<Pais> SORT_BY_POINTS= new Comparator<>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return (o2.getPuntos()-o1.getPuntos());
        }

    } ;
    public static final Comparator<Pais> SORT_BY_POINTS2= new Comparator<>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return (o1.getPuntos()-o2.getPuntos());
        }

    } ;
    public static final Comparator<Pais> SORT_BY_SONG= new Comparator<>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getCancion().compareTo(o2.getCancion());
        }

    } ;
    public static final Comparator<Pais> SORT_BY_SINGER= new Comparator<>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getCantante().compareTo(o2.getCantante());
        }

    } ;

    private String nombre;
    private String cantante;
    private String cancion;
    private int puntos;
    private Map<Pais,Integer> votados;


    public Pais(String nombre, String nombre_cantante, String cancion) {
        this.nombre = nombre;
        this.cantante = nombre_cantante;
        this.cancion = cancion;
        puntos=0;
        votados = new LinkedHashMap<>();
    }


    public void votar(Collection<Pais> participantes){
        List<Integer> totalPuntos = puntos();
        List<Pais> copaia = new ArrayList<>(participantes);
        Collections.shuffle(copaia);
        for (int i = 0; i < totalPuntos.size(); i++) {
            Pais paisvotado = copaia.get(i);
            if (paisvotado.equals(this)){
                paisvotado = copaia.get(11);
            }
            int puntodado = totalPuntos.get(i);
            paisvotado.setPuntos(puntodado);
            votados.put(paisvotado,puntodado);
        }
    }


    private List<Integer> puntos(){
        List<Integer> puntuacionTotal = new ArrayList<>();
        for (int i = 1; i <=8 ; i++) {
            puntuacionTotal.add(i);
        }
        puntuacionTotal.add(10);
        puntuacionTotal.add(12);
        return  puntuacionTotal;
    }


    public String getNombre() {
        return nombre;
    }
    public String getCantante() {
        return cantante;
    }
    public String getCancion() {
        return cancion;
    }
    public int getPuntos() {
        return puntos;
    }
    public Map<Pais,Integer> getVotados() {
        return votados;
    }
    private void setPuntos(int puntos) {
        this.puntos += puntos;
    }
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(nombre, pais.nombre) && Objects.equals(cantante, pais.cantante) && Objects.equals(cancion, pais.cancion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cantante, cancion);
    }

    @Override
    public int compareTo(Pais o) {
        return nombre.compareTo(o.getNombre());
    }

}
