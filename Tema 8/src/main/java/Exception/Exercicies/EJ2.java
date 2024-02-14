package Exception.Exercicies;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] vector = new double[5];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Valor "+i+": ");
            try {
                vector[i] = sc.nextDouble();
            } catch (InputMismatchException e){
                System.out.println(e);
                sc.nextLine();
                i--;
            }
        }


    }


}
