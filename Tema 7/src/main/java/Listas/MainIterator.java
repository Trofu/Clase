package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(List.of("a","b","c","d","e"));

        for(String cadena : lista){
            System.out.print("-->"+ cadena);
        }

        Iterator<String> iterador = lista.iterator();

        while (iterador.hasNext()){
            String cadena = iterador.next();
            System.out.println(cadena);


        }



    }

}
