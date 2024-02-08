package Ejercicio.Eurovision;

import java.util.*;

public class Pais{

    private String nombre;
    private String cantante;
    private String cancion;
    private int puntos;
    private Map<Pais,Integer> votados;
    private List<Pais> participantes;


    public Pais(String nombre, String nombre_cantante, String cancion) {
        this.nombre = nombre;
        this.cantante = nombre_cantante;
        this.cancion = cancion;
        puntos=0;
        votados = new HashMap<>();
    }

    public boolean votar(){
        List<Integer> totalPuntos = puntos();
        for (int i = 0; i < totalPuntos.size(); i++) {
            Pais paisvotado = participantes.get(i);
            int puntodado = totalPuntos.get(i);
            paisvotado.setPuntos(puntodado);
            anyadirVotos(paisvotado,puntodado);
        }
        return true;
    }

    private List<Integer> puntos(){
        List<Integer> puntuacionTotal = new ArrayList<>();
        for (int i = 1; i <=8 ; i++) {
            puntuacionTotal.add(i);
        }
        puntuacionTotal.add(10);
        puntuacionTotal.add(12);
        Collections.shuffle(puntuacionTotal);
        return  puntuacionTotal;
    }

    public void setParticipantes(Collection<Pais> participantes) {
        List<Pais> copiaParticipantes = new ArrayList<>(participantes);
        Iterator<Pais> iterator = copiaParticipantes.iterator();
        while (iterator.hasNext()) {
            Pais pais = iterator.next();
            if (pais.getNombre().equals(this.getNombre())) {
                iterator.remove();
            }
        }
        Collections.shuffle(copiaParticipantes);
        this.participantes = copiaParticipantes;
    }

    public void anyadirVotos(Pais pais,Integer num){
        votados.put(pais,num);
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
    public Map<Pais, Integer> getVotados() {
        return votados;
    }
    public List<Pais> getParticipantes() {
        return participantes;
    }
    private void setPuntos(int puntos) {
        this.puntos += puntos;
    }
    @Override
    public String toString() {
        return "\nPais: "+nombre+" con la cancion: "+cancion+" interpretada por: "+cantante;
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
