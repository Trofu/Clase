package Streams.Ejercicios.EJ3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {

    public static void main(String[] args){


        try (FileReader fr = new FileReader("Tema 8/src/main/java/Streams/Ejercicios/Documentos/alumnos_notas.txt")){

            Integer num;
            while((num=fr.read())!=-1){
                System.out.println(num);
            }


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {

        }


    }


}
