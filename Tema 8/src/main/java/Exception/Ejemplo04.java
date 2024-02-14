package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int div,x,y;

        try {
            System.out.println("Introduce un numero: ");
            x = sc.nextInt();
            System.out.println("Introduce el denominador");
            y = sc.nextInt();
            div=x/y;
            System.out.println("Resultado: " + div);

        }catch (ArithmeticException e){
            System.out.println("Error producido: "+e);
        }catch (InputMismatchException e){
            System.out.println("Letras no.... "+e);
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("FIN");
        }



    }


}
