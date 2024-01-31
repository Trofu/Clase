package Map;

import java.util.*;

public class MainMap {

    public static void main(String[] args) {

        Map<String,Double> fruta = new HashMap<>();
        fruta.put("platano",1.99);
        fruta.put("naranja",1.19);
        fruta.put("clementina",1.79);
        fruta.put("pomelo",0.99);
        fruta.put("platano",1.79);
        fruta.put("patata",1.99);
        fruta.put("guayaba",2000.25);


        fruta.remove("patata");
        System.out.println(fruta.get("guayaba"));
        fruta.put("guayaba",null);
        System.out.println(fruta);

        System.out.println(fruta.containsKey("guallaba"));
        System.out.println(fruta.containsValue(0.99));

        Set<String> clavesFrutas = fruta.keySet();
        System.out.println(clavesFrutas);
        Set<String> claves = new TreeSet<>(clavesFrutas);
        System.out.println(claves);

        Collection<Double> valores = fruta.values();
        Set<Double> valores1 = new HashSet<>(valores);
        List<Double> valores2 = new ArrayList<>(valores);
        System.out.println(valores1);
        System.out.println(valores2);

        for (String clave: fruta.keySet()){
            System.out.println(" --> "+" key: "+clave+" valor: "+fruta.get(clave));
        }

        System.out.println();

        for (Map.Entry<String,Double>frutaIndividual:fruta.entrySet()){
            System.out.println(" --> "+" key: "+frutaIndividual.getKey()+" valor: "+frutaIndividual.getValue());
        }


        System.out.println();

        for (String claro:fruta.keySet()){
            System.out.println(claro);
        }
        System.out.println();

        for (Double claro:fruta.values()){
            System.out.println(claro);
        }

        System.out.println();


        Iterator<String> iteSet = fruta.keySet().iterator();
        while (iteSet.hasNext()){
            String clave = iteSet.next();
            System.out.println(clave+" --> " + fruta.get(clave));

        }

        System.out.println();

        fruta.forEach((frutilla,precio)->System.out.println(frutilla+" --> " + precio));


    }


}
