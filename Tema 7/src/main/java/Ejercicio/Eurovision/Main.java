package Ejercicio.Eurovision;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Set<Pais> eurovision = new HashSet<>();
        eurovision.add(new Pais("España","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Francia","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Holanda","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Suecia","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Israel","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Italia","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Finlandia","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Estonia","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Australia","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Bélgica","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Austria","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Republica Checa","Melendi","SHUUUUu"));

        for (Pais pais: eurovision){
            pais.setParticipantes(eurovision);
            pais.votar();
        }

        for (Pais pais:eurovision){
            System.out.println(pais.getNombre() +" ha votado a: " +pais.getVotados().keySet() +" con "+pais.getVotados().values()+" puntos.\n");
        }











    }


}
