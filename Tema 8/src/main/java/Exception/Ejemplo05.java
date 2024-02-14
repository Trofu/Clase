package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int div,x,y;
        int[] vector = {0,1,2};

        try {
            System.out.println("Introduce un numero: ");
            x = sc.nextInt();
            System.out.println("Introduce el denominador");
            y = sc.nextInt();
            div=x/y;
            System.out.println("Resultado: " + div);


            //pedir consultar un elemento del vector
            //capturar la excepción si está fuera de rango
            System.out.print("Introduce la posición en el vector: ");
            int posicion = sc.nextInt();
            System.out.println("Elemento es: " + vector[posicion]);

        }
        catch (ArithmeticException e){
            System.out.println("Error producido: "+e);
        } catch (InputMismatchException e){
            System.out.println("Letras no.... "+e);
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            System.out.println("Acceso incorrecto al array: "+e);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("FIN");
        }



    }


}
