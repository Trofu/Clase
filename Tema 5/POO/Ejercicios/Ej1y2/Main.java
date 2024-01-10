package Ejercicios.Ej1y2;

public class Main {

    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Jesus");
        Cuenta c2 = new Cuenta("Aray",180.58);
        Cuenta c3 = new Cuenta("David",0.0);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("--------------------");
        c2.transferencia(c3,150.00);
        System.out.println(c2);
        System.out.println(c3);
    }

}
