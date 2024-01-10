package Ejercicios.Ej3;

public class Main {
    public static void main(String[] args) {

        Contador c1 = new Contador();
        Contador c2 = new Contador(10);

        for (int i = 0; i < 5; i++) {
            c1.increment();
            c2.increment();
        }

        c2.decrement();
        System.out.println(c1);
        System.out.println(c2);


    }
}
