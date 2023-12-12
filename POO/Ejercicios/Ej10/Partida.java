package Ejercicios.Ej10;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Partida {

    private Carta[] baraja;

    private String[] palo = {"Oros","Bastos","Espadas","Copas"};

    public Partida(){
        int numeroTotal = 12;
        int numeroPalos = 4;
        baraja= new Carta[numeroTotal*numeroPalos];
        int a=0;
        for (int i = 1; i <=numeroTotal; i++) {
            for (int j = 0; j < numeroPalos; j++) {
                baraja[a++] = new Carta(i, palo[j]);
            }
        }
        barajar();
    }


    private void barajar(){
        List<Carta> listaCartas = Arrays.asList(baraja);
        Collections.shuffle(listaCartas);
        listaCartas.toArray(baraja);
    }

    public Carta repartitEncima(){
        //devuelve 0
        Carta carta = null;
        if (baraja.length>0){
            carta = baraja[0];
            this.baraja=Arrays.copyOfRange(this.baraja,1,baraja.length);
        }
        return carta;
    }

    public Carta repartitDebajo(){
        //devuelve length-1
        Carta carta = null;
        if (baraja.length>0){
            carta = baraja[baraja.length-1];
            this.baraja=Arrays.copyOfRange(this.baraja,0,baraja.length-1);
        }
        return carta;
    }

    @Override
    public String toString() {
        return Arrays.toString(baraja);
    }
}
