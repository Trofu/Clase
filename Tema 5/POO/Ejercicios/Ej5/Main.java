package Ejercicios.Ej5;

public class Main {

    public static void main(String[] args) {

        Fraccion fr1 = new Fraccion(11,10);
        Fraccion fr2 = new Fraccion(2,3);
        System.out.println(fr1);
        System.out.println(fr2);
        Fraccion fr3 =fr1.suma(fr2);
        System.out.println("La suma es: " +fr3);
        Fraccion fr4 = fr1.multiplicacion(fr2);
        System.out.println("La multiplicacion es: "+fr4);
        Fraccion fr5 = fr1.division(fr2);
        System.out.println("La division es: "+fr5);

    }


}
