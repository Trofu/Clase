package Streams.Ejercicios.EJ2;

import java.io.*;

public class main {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("Tema 8/src/main/java/Streams/Ejercicios/Documentos/numeros.txt"))){
            int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,num=0;
            String numCadena="";
            do {
                numCadena = br.readLine();
                if (numCadena!=null){
                    num=Integer.parseInt(numCadena);
                    if (num>max)
                        max=num;
                    if (num<min)
                        min=num;
                }
            }while (numCadena!=null);
            System.out.println(max +" y "+min);
        }catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }




    }
}
