package Ejercicios.Ej10;

public class Main {

    public static void main(String[] args) {

        Partida P1 = new Partida();
        System.out.println(P1);
        System.out.println("-");
        Carta C1 = P1.repartitDebajo();
        System.out.println(P1);
        System.out.println("La carta en juego es el: " + C1);
        System.out.println("-");
        C1 = P1.repartitDebajo();
        System.out.println(P1);
        System.out.println("La carta en juego es el: " + C1);
    }

}
