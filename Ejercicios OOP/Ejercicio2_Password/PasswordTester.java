package Ejercicio2_Password;

import java.util.Scanner;

public class PasswordTester {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Cuantas contraseñas quieres guardar? ");
        Password[] pass = new Password[sc.nextInt()];
        System.out.println("De que tamaño quieres las contraseñas? ");
        int length = sc.nextInt();
        Boolean[] strong = new Boolean[pass.length];
        for (int i = 0; i < pass.length; i++) {
            pass[i] = new Password(length);
            strong[i]=pass[i].esFuerte();
        }
        for (int i = 0; i < pass.length; i++) {
            System.out.println(pass[i] +" y es fuerte: "+strong[i]);//*********

        }

    }

}
