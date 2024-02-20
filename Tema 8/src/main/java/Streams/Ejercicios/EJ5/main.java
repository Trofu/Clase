package Streams.Ejercicios.EJ5;

import java.io.*;
import java.util.*;

public class main {

    static String ruta = "Tema 8/src/main/java/Streams/Ejercicios/Documentos/diccionario.txt";
    static String ruta2 = "Tema 8/src/main/java/Streams/Ejercicios/Documentos/Libros/quijote_cervantes.txt";
    static String ruta3 = "Tema 8/src/main/java/Streams/Ejercicios/Documentos/Libros/coplas_manrique.txt";
    static String ruta4 = "Tema 8/src/main/java/Streams/Ejercicios/Documentos/Libros/fuenteovejuna_lopevega.txt";
    static String ruta5 = "Tema 8/src/main/java/Streams/Ejercicios/Documentos/Libros/lazarillo.txt";
    static String ruta6 = "Tema 8/src/main/java/Streams/Ejercicios/Documentos/Libros/vida_unamuno.txt";

    public static void main(String[] args) throws IOException {

        List<String> palabras = leerLineas(ruta2);
        palabras.addAll(leerLineas(ruta3));
        palabras.addAll(leerLineas(ruta4));
        palabras.addAll(leerLineas(ruta5));
        palabras.addAll(leerLineas(ruta6));

        for (String palabra:palabras){
            System.out.println(palabra);
        }

        System.out.println("Canidad de lineas: "+cantLineas(palabras));

        System.out.println("Canidad de Palabras: "+cantPalabras(palabras));

        System.out.println("Canidad de Caracteres: "+cantCaracts(palabras));



    }

    public static List<String> leerLineas (String ruta) throws IOException{
        List<String> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea="";
            while ((linea = br.readLine())!=null){
                lista.add(linea);
            }
            return lista;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return lista;
    }


    public static int cantLineas (List<String> palabras){
        return palabras.size();
    }
    public static int cantPalabras (List<String> palabras){
        int numPalabra=0;
        for (String palabra:palabras){
            String[] palabraLinea = palabra.split(" ");
            if (!(palabraLinea.length==1 && palabraLinea[0].equals(""))){
                numPalabra+=palabraLinea.length;
            }
        }
        return numPalabra;
    }
    public static int cantCaracts (List<String> palabras){
        int numPalabra=0;
        for (String palabra:palabras){
            String[] palabraLinea = palabra.split(" ");
            for (String palabra2:palabraLinea){
                numPalabra+=palabra2.length();
            }
        }
        return numPalabra;
    }



}
