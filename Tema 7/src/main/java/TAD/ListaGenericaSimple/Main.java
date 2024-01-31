package TAD.ListaGenericaSimple;

import Model.Persona;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Model.Persona[] a = new Model.Persona[]{new Model.Persona("123456789","Pepe","Fran",LocalDate.now()),new Model.Persona("987654321","Pepe","Fran",LocalDate.now()),new Model.Persona("5454545454","Pepe","Fran",LocalDate.now()),new Model.Persona("00000001","Pepe","Fran",LocalDate.now())};
        Lista zumba = new Lista<>(a);
        System.out.println(zumba);
        zumba.addHead(new Model.Persona("1597532684","Aray","PorElCulito", LocalDate.now()));
        System.out.println(zumba);
        zumba.removeTail();
        System.out.println(zumba);
        System.out.println(Arrays.toString(zumba.getAsArray(Persona.class)));
        zumba.clear();
        System.out.println(zumba);





    }


}
