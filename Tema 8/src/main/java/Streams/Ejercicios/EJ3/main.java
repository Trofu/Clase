package Streams.Ejercicios.EJ3;

import java.util.*;
import java.io.*;

public class main {

    public static void main(String[] args){

        String ruta = "Tema 8/src/main/java/Streams/Ejercicios/Documentos/alumnos_notas.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;
            double media = 0;
            do {
                linea = br.readLine();
                if (linea!=null){
                    String[] partes = linea.split(" ");
                    String nombre = partes[0]+" "+partes[1];
                    for (int i = 2; i < partes.length; i++) {
                        media += Double.parseDouble(partes[i]);
                    }
                    media = media/ (partes.length-2);
                    System.out.println(nombre + " media "+media);
                }
            }while (linea!=null);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
