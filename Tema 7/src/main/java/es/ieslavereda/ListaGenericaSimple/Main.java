package es.ieslavereda.ListaGenericaSimple;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Persona[] a = new Persona[]{new Persona("123456789","Pepe","Fran",15),new Persona("987654321","Pepe","Fran",15),new Persona("5454545454","Pepe","Fran",15),new Persona("00000001","Pepe","Fran",15)};
        Lista zumba = new Lista<>(a);
        System.out.println(zumba);
        zumba.addHead(new Persona("1597532684","Aray","Brito",2));
        System.out.println(zumba);
        zumba.removeTail();
        System.out.println(zumba);
        System.out.println(zumba.getAsArray(Persona.class).toString());
        zumba.clear();
        System.out.println(zumba);


    }


}
