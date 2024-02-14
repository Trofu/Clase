package Exception.Exercicies;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num1,num2;
        double total;

        try {
            System.out.println("Primer Numero");
            num1= sc.nextInt();
            System.out.println("Segundo Numero");
            num2= sc.nextInt();
            total= (double) num1 /num2;
            System.out.println(total);
        }catch (InputMismatchException e){
            System.err.println("No pongas letras cuando te digo que pongas un numero \n"+e);
        }catch (ArithmeticException e){
            System.err.println("No dividas por 0 esta mal \n"+e);
        }finally {
            System.out.println("FINAL");
        }





    }




}
