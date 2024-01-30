package Listas;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import Model.Persona;

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
        ArrayList<Model.Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Model.Persona("123","A","ABC", LocalDate.of(2005,5,21)));
        listaPersonas.add(new Model.Persona("456","Bo","BCD",LocalDate.of(2003,5,21)));
        listaPersonas.add(new Model.Persona("789","C","CDE",LocalDate.of(2001,5,21)));
        listaPersonas.add(new Model.Persona("741","D","DEF",LocalDate.of(1995,5,21)));
        System.out.println();
        Iterator<Persona> iteradorPersona = listaPersonas.iterator();
        Persona p;
        while (iteradorPersona.hasNext()) {
            p = iteradorPersona.next();
            if (p.getNombre().contains("o")) {
                iteradorPersona.remove();
                System.out.println("Hem esborrat a -->" + p);
            }
        }
        Collections.sort(listaPersonas);
        System.out.println(listaPersonas);
        listaPersonas.sort(Persona.SORT_BY_AGE);
        System.out.println(listaPersonas);

    }

}
