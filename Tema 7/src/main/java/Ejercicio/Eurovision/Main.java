package Ejercicio.Eurovision;
//  Juan Luis Espinosa Cuenca 1ºDAM
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        Set<Pais> eurovision = new HashSet<>();
        eurovision.add(new Pais("Suecia","Loreen","Tattoo"));
        eurovision.add(new Pais("Finlandia","Käärijä","Cha Cha Cha"));
        eurovision.add(new Pais("Israel","Noa Kirel","Unicorn"));
        eurovision.add(new Pais("Italia","Marco Mengoni","Due vite"));
        eurovision.add(new Pais("Noruega","Alessandra Mele","Queen of Kings"));
        eurovision.add(new Pais("Ucrania","Tvorchi","Heart os Steel"));
        eurovision.add(new Pais("Bélgica","Gustaph","Because of You"));
        eurovision.add(new Pais("Estonia","Alika Milova","Bridges"));
        eurovision.add(new Pais("Australia","Voyager","Promise"));
        eurovision.add(new Pais("Republica Checa","Vesna","My Sister's Crown"));
        eurovision.add(new Pais("Lituania","Monika Linkyte","Stay"));
        eurovision.add(new Pais("Chipre","Andrew Lambrou","Break a Broken Heart"));
        eurovision.add(new Pais("Croacia","Let 3","Mama SC!"));
        eurovision.add(new Pais("Armenia","Brunette","Future Lover"));
        eurovision.add(new Pais("Austria","Teya","Who the Hell Is Edgar?"));
        eurovision.add(new Pais("Francia","La Zarra","Evidemment"));
        eurovision.add(new Pais("España","Blanca Paloma","Eaea"));
        eurovision.add(new Pais("Moldavia","Pasha Parfeni","Soarele si luna"));
        eurovision.add(new Pais("Polonia","Blanka Stajkow","Solo"));
        eurovision.add(new Pais("Suiza","Remo Forrer","Watergun"));
        eurovision.add(new Pais("Eslovenia","Joker Out","Carpe Diem"));
        eurovision.add(new Pais("Albania","Albina & Familja Kelmendi","Duje"));
        eurovision.add(new Pais("Portugal","Mimicat","Ai coraçao"));
        eurovision.add(new Pais("Serbia","Luke Black","Samo Mi Se Spava"));
        eurovision.add(new Pais("Reino Unido","Mae Muller","I Wrote a Song"));
        eurovision.add(new Pais("Alemania","Lord of the Lost","Blood & Glitter"));
        for (Pais pais: eurovision){
            pais.votar(eurovision);
        }


        //Listado de todos los paises participantes
        System.out.println("Participantes: ");
        eurovision.stream().forEach(pais -> System.out.print("| "+pais+" "));
        System.out.println("|\n");

//         Listado de todos los paises por orden alfabetico junto con las votaciones realizadas ordenadas de mayor a menor.

        System.out.println("Paises ordenador por orden alfabetico y votaciones de mayor a menor");
        eurovision.stream().sorted().forEach(pais -> { System.out.println(pais + " ha votado a:");
                     pais.getVotados().entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                    forEach(entry -> System.out.print(entry.getKey() + "->" + entry.getValue()+" "));
                    System.out.println("\n------------------------------");
                });
        System.out.println();
//         Listado de los paises ordenados por puntuaciones recibidas.
        System.out.println("Paises ordenados por puntuacion");
        eurovision.stream().sorted(Pais.SORT_BY_POINTS).forEach(pais -> System.out.println(pais+" puntos "+pais.getPuntos()));
        System.out.println();

//         Nombre del pais ganador junto con la puntacion total obtenida y paises que le han votado junto con los puntos asignados por cada uno de ellos.
        System.out.println("Ganador y quienes les han votado y con cuanto");
        Pais paisConMasPuntosNombre = eurovision.stream().max(Pais.SORT_BY_POINTS2).get();
        Map<Pais,Integer> votadosAlGanador = new HashMap<>();
        for (Pais pais : eurovision) {
            for (Pais votados : pais.getVotados().keySet()) {
                if (paisConMasPuntosNombre.equals(votados)){
                    votadosAlGanador.put(pais,pais.getVotados().get(votados));
                }
            }
        }
        eurovision.stream().sorted(Pais.SORT_BY_POINTS).limit(1).forEach(pais -> System.out.print("Ha ganado "+pais.getNombre() +" con "+pais.getPuntos() +" y le han votado: "));
        System.out.println(votadosAlGanador);
        System.out.println();

//         Listado de canciones ordenadas por nombre.
        System.out.println("Canciones ordenadas por nombre");
        eurovision.stream().sorted(Pais.SORT_BY_SONG).forEach(pais -> System.out.println("Cancion: "+pais.getCancion() +" de "+pais.getNombre()));
        System.out.println();

//         Listado de las 3 canciones mas votadas junto con su puntuacion.
        System.out.println("Las 3 mejores canciones");
        eurovision.stream().sorted(Pais.SORT_BY_POINTS).limit(3).forEach(pais -> System.out.println("Cancion: "+pais.getCancion() +" con "+pais.getPuntos()+" puntos"));
        System.out.println();

//         Listado de cantantes ordenados por nombre.
        System.out.println("Cantantes");
        eurovision.stream().sorted(Pais.SORT_BY_SINGER).forEach(pais -> System.out.println("Cantante: "+pais.getCantante()+" del pais: "+ pais.getNombre()));


    }

}
