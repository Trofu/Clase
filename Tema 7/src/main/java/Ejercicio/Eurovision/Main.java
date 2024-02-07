package Ejercicio.Eurovision;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<Pais> eurovision = new ArrayList<>();
        eurovision.add(new Pais("España","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Francia","Melendi","SHUUUUu"));
        eurovision.add(new Pais("Holanda","Melendi","SHUUUUu"));

        for (Pais pais: eurovision){
            pais.setParticipantes(eurovision);
        }


        System.out.println(eurovision);




    }


}
