package Map.Ejercicios.EJ1;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Map<Trabajador,Pais> empresa1 = new HashMap<>();
        Pais Espanya = new Pais("España",470000000);
        Pais Inglaterra = new Pais("Inglaterra",470000000);
        Pais Grecia = new Pais("Grecia",470000000);
        Pais Noruega = new Pais("Noruega",470000000);
        Pais Islandia = new Pais("Islandia",470000000);


        empresa1.put(new Trabajador("123456789","Pepe","Floreta", LocalDate.of(1950,1,10)),Espanya);
        empresa1.put(new Trabajador("987654321","Marta","Castillos", LocalDate.of(1995,6,10)),Espanya);
        empresa1.put(new Trabajador("147258369","Samuel","Rios", LocalDate.of(1996,1,10)),Islandia);
        empresa1.put(new Trabajador("963852741","Aray","Brito", LocalDate.of(1992,3,10)),Inglaterra);
        empresa1.put(new Trabajador("789456123","Jesus","Tarin", LocalDate.of(2000,1,10)),Noruega);
        empresa1.put(new Trabajador("369258147","Alexandre","Tarin", LocalDate.of(2005,8,10)),Noruega);

        System.out.println(empresa1);
        System.out.println();

        for (Pais pais:empresa1.values()){
            System.out.println(pais);
        }
        System.out.println();

        Set<Pais> paisesSet = new TreeSet<>();
        paisesSet.addAll(empresa1.values());
        for (Pais pais:paisesSet)
            System.out.println(pais);
        System.out.println();

        Set<Trabajador> tarabajadorSet = new TreeSet<>(empresa1.keySet());
        for (Trabajador pais:tarabajadorSet)
            System.out.println(pais);
        System.out.println();

        List<Trabajador> tarabajadorSet2 = new ArrayList<>(empresa1.keySet());
        Collections.sort(tarabajadorSet2);
        for (Trabajador pais:tarabajadorSet2)
            System.out.println(pais);
        System.out.println();


        Map<Pais,List<Trabajador>> paises = new TreeMap<>();
        for (Pais pais: paisesSet){
            List<Trabajador> aux = new ArrayList<>();
            for (Trabajador trabajador: empresa1.keySet()){
                if (empresa1.get(trabajador).equals(pais)){
                    aux.add(trabajador);
                }
            }
            aux.sort(Trabajador.SORT_BY_AGE2);
            paises.put(pais,aux);
        }
        for (Pais pais:paises.keySet()){
            System.out.println(pais+" trabajador ---> "+paises.get(pais));
        }


        Iterator<Trabajador> trabajadorIterator = empresa1.keySet().iterator();
        while (trabajadorIterator.hasNext()){
            Trabajador trabajador = trabajadorIterator.next();
            if (Period.between(trabajador.getFechaNacimiento(),LocalDate.now()).getYears()>=50){
                System.out.println(trabajador);
            }

        }


        empresa1.keySet().stream().
                filter(trabajador -> Period.between(trabajador.getFechaNacimiento(),LocalDate.now()).getYears()>=50).
                sorted(Trabajador.SORT_BY_AGE2).
                forEach(System.out::println);




    }



}
