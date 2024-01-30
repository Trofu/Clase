package Listas;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaComoInterfaz {

    public static void main(String[] args) {


        ArrayList<String> listaArray = new ArrayList<>();
        listaArray.add("Sarria");
        listaArray.add("Chayane");
        listaArray.add("ElMashOMenos");
        listaArray.add("David El guitarra");

        LinkedList<String> listaLinked = new LinkedList<>(listaArray);
        imprimir(listaArray);
        imprimir(listaLinked);

    }

    public static void imprimir(List<String> List){
        for (String s:List){
            System.out.println(" - "+s);
        }
        System.out.println();
    }




}
