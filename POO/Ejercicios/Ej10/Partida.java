package Ejercicios.Ej10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Partida {


    private Carta[] baraja;

    private String[] palo = {"Oros","Bastos","Espadas","Copas"};

    public Partida(){
        baraja= new Carta[12*4];
        int a=0;
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < 4; j++) {
//                baraja[a++]=Carta(i,palo[j]);
            }
        }
    }


    private void barajar(){
        List<Carta> listaCartas = Arrays.asList(baraja);
        Collections.shuffle(listaCartas);
        listaCartas.toArray(baraja);
    }


    @Override
    public String toString() {
        return "Partida{" +
                "baraja=" + Arrays.toString(baraja) +
                ", palo=" + Arrays.toString(palo) +
                '}';
    }
}
