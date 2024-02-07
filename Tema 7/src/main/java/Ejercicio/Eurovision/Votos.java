package Ejercicio.Eurovision;

import java.util.*;

public class Votos {

        private Map<Pais,Integer> votos;

        private List<Integer> puntuacion;


        public Votos() {
            votos = new HashMap<>();
            puntuacion = puntos();
        }



    public List<Integer> getPuntuacion() {
        return puntuacion;
    }

    public Map<Pais, Integer> getVotos() {
        return votos;
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

    @Override
    public String toString() {
        return "Votados: "+votos;
    }
}
