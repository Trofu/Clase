package Ejercicio.Eurovision;

import java.util.*;

public class Pais{

    private String nombre;
    private String cantante;
    private String cancion;
    private int puntos;
    private Votos votados;
    private List<Pais> participantes;


    public Pais(String nombre, String nombre_cantante, String cancion) {
        this.nombre = nombre;
        this.cantante = nombre_cantante;
        this.cancion = cancion;
        puntos=0;
        votados=new Votos();
    }

    public boolean votar(){
        for (Pais pais:participantes){

        }

        return false;
    }
    public void setParticipantes(List<Pais> participantes) {
        List<Pais> copiaParticipantes = new ArrayList<>(participantes);
        Iterator<Pais> iterator = copiaParticipantes.iterator();
        while (iterator.hasNext()) {
            Pais pais = iterator.next();
            if (pais.getNombre().equals(this.getNombre())) {
                iterator.remove();
            }
        }
        this.participantes = copiaParticipantes;
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

    public Votos getVotados() {
        return votados;
    }

    @Override
    public String toString() {
        return "Pais: "+nombre+" con la cancion: "+cancion+" interpretada por: "+cantante;
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
}
