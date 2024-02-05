package Map.Ejercicios.EJ1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {

        List<Pais> paises = List.of(
                new Pais("España",47),
                new Pais("Italia",80),
                new Pais("Francia",57),
                new Pais("Alemania",20),
                new Pais("Noruega",25)
        );


        System.out.print(paises.stream()
                .sorted()
                .map(p -> p.getNombre())
                .collect(Collectors.joining(", ","Paises ordenadados por letra: ",".")));

        System.out.println();

        System.out.print(paises.stream()
                .sorted(Pais.SORT_BY_POPULATION.reversed())
                            //(o1, o2) -> o1.getPoblacion()- o2.getPoblacion()
                            //Comparator.comparingInt(Pais::getPoblacion
                            // Cambiar de mas a menos cambiar el orden de la resta
                .map(p -> p.getNombre())
                .collect(Collectors.joining(", ","Paises ordenadados por poblacion: ",".")));

        System.out.println();


        System.out.print(paises.stream()
                .filter(pais -> pais.getPoblacion()%2!=0)
                .filter(pais -> pais.getNombre().charAt(0) != 'A'&&
                        pais.getNombre().charAt(0) !='E'&&
                        pais.getNombre().charAt(0) !='I'&&
                        pais.getNombre().charAt(0) !='O'&&
                        pais.getNombre().charAt(0) !='U')
                .map(p -> p.getNombre())
                .collect(Collectors.joining(", ","Paises ordenadados por poblacion: ",".")));

        System.out.println();

        Optional<Pais> optional = paises.stream()
                .filter(pais -> pais.getPoblacion()<35)
                .findFirst();

        if (optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.println("No hay ninguno");




    }



}
