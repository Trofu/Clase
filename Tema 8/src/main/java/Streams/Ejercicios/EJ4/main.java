package Streams.Ejercicios.EJ4;

import java.io.*;
import java.util.*;

public class main {

    public static void main(String[] args) {

        String ruta ="Tema 8/src/main/java/Streams/Ejercicios/Documentos/";
        String ruta1 = "Tema 8/src/main/java/Streams/Ejercicios/Documentos/usa_nombres.txt";
        String ruta2 = "Tema 8/src/main/java/Streams/Ejercicios/Documentos/usa_apellidos.txt";

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos nombres aleatorios quieres? :");
        int num = sc.nextInt();
        System.out.print("Donde quieres guardarlos? :");
        String fichero = sc.next();
//        fichero ="usa_personas";

        try (BufferedReader br1 = new BufferedReader(new FileReader(ruta1));
             BufferedWriter bw = new BufferedWriter(new FileWriter(ruta+fichero+".txt"));
             BufferedReader br2 = new BufferedReader(new FileReader(ruta2))){

            List<String> nombre1 = new ArrayList<>();
            List<String> nombre2 = new ArrayList<>();
            List<String> nombreCompleto = new ArrayList<>();
            String nom="",nom2="";

            while ((nom = br1.readLine())!=null){
                nombre1.add(nom);
            }
            while ((nom2 = br2.readLine())!=null){
                nombre2.add(nom2);
            }

            Collections.shuffle(nombre1);
            Collections.shuffle(nombre2);

            for (int i = 0; i < num; i++) {
                nombreCompleto.add(nombre1.get(i)+" "+nombre2.get(i));
            }

            for (String nombre:nombreCompleto){
                bw.write(nombre+"\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
