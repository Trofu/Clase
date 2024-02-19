package Streams.Ejercicios.EJ1;


import Exception.Exercicies.Gato.ExcepcionGatuna;
import Exception.Exercicies.Gato.Gato;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws ExcepcionGatuna, IOException, ClassNotFoundException {

        Gato felix = new Gato("Aray",15);
        Gato felix1 = new Gato("Marcos",15);
        Gato felix2 = new Gato("David",15);
        Gato felix3 = new Gato("Jesus",15);

        List<Gato> gato = new ArrayList<>();
        gato.add(felix);
        gato.add(felix1);
        gato.add(felix2);
        gato.add(felix3);

        felix.save(gato,"gatosos");


        System.out.println(felix.load("gatosos"));


    }


}
