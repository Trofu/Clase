package Streams.Ejercicios.EJ2;

import java.io.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {

        int max=0,min=0;
        int i=0;
        int num;
        try (FileReader fr = new FileReader("Tema 8/src/main/java/Streams/Ejercicios/Documentos/numeros.txt")){
            while((num= fr.read())!=-1){
                if (i==0){
                    max=num;
                    min=num;
                }
                if (num>max){
                    max=num;
                }
                if (num<min){
                    min=num;
                }
                i++;
                System.out.print(num+"|");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println();
            System.out.println(max+" num max");
            System.out.println(min+" num min");
        }




    }
}
