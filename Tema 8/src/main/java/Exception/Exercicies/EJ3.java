package Exception.Exercicies;

import Exception.Exercicies.Gato.ExcepcionGatuna;
import Exception.Exercicies.Gato.Gato;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EJ3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Gato felix = new Gato("Felix",5);

            System.out.println(felix);
        } catch (ExcepcionGatuna e){
            System.err.println(e);
        }

        List<Gato> camada = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre del gato "+i);
            String nom = sc.next();
            System.out.println("Edad del gato "+i);
            try {
                int edad = sc.nextInt();
                camada.add(new Gato(nom,edad));
            }catch (ExcepcionGatuna e){
                System.err.println(e);
                sc.nextLine();
                i--;
            }catch (InputMismatchException e){
                System.err.println("Pon un numero valido");
                sc.nextLine();
                i--;
            }
        }



    }

}
