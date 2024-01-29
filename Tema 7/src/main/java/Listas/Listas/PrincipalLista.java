package Listas;

import java.util.ArrayList;
import java.util.List;

public class PrincipalLista {

    public static void main(String[] args) {

        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(4);
        listaEnteros.add(6);
        listaEnteros.add(7);
        listaEnteros.add(9);

        System.out.println(listaEnteros.size());
        System.out.println(listaEnteros);
        listaEnteros.remove(2);
        listaEnteros.remove(4);
        System.out.println(listaEnteros);
        listaEnteros.addAll(List.of(11,15,18,20,34,55,99));
        System.out.println(listaEnteros);
        listaEnteros.set(0,8);
        System.out.println(listaEnteros);
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("123","A","ABC",18));
        listaPersonas.add(new Persona("456","B","BCD",10));
        listaPersonas.add(new Persona("789","C","CDE",30));
        listaPersonas.add(new Persona("741","D","DEF",50));
        System.out.println();
        imprimir(listaPersonas);
    }
    public static void imprimir(List<Persona> List){
        for (Persona s:List){
            System.out.println(" - "+s);
        }
        System.out.println();
    }
}
