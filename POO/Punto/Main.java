package Punto;

public class Main {

    public static void main(String[] args) {
        Punto p2 = new Punto(8);
        Punto p3 = new Punto(2,8);
        System.out.println("Punto 1" +p2);
        System.out.println("Punto 2" +p3);
        p2.derecha(5);
        p3.bajar(15);
        System.out.println("-----------");
        System.out.println("Punto 1" +p2);
        System.out.println("Punto 2" +p3);
        Punto p4 = p3.newPuntoUp(5);
        Punto p5 = p3.newPuntoDown(48);
        Punto p6 = p3.newPuntoLeft(36);
        Punto p7 = p3.newPuntoRight(19);
        System.out.println("-----------");
        System.out.println("Punto 3" +p4);
        System.out.println("Punto 4" +p5);
        System.out.println("Punto 5" +p6);
        System.out.println("Punto 6" +p7);
        System.out.println("Distacia entre Punto 3 y Punto 6 = "+p4.distancia(p7));

    }

}
