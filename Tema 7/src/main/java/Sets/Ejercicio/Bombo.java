package Sets.Ejercicio;

import java.util.*;

public class Bombo {

    private Set<Bola> bombo;

    public Bombo(){
        bombo=new LinkedHashSet<>();
    }

    public Bombo(Collection<Bola> bolas) {
        bombo=new LinkedHashSet<>(bombo);
    }

    public void initialize(){
        for (int i =1; i < 90; i++) {
             bombo.add(new Bola(i));
        }
    }

    public void shuffle(){
        List<Bola> bolaList = new LinkedList<>(bombo);
        Collections.shuffle(bolaList);
        bombo.clear();
        bombo.addAll(bolaList);
    }

    public void addBola(Bola bola){
        bombo.add(bola);
    }
    public void addBolas(Collection<Bola> bolas){ bombo.addAll(bolas);}
    public Bola getBolaLista(){
        List<Bola> bolaList = new LinkedList<>(bombo);
        Bola out = bolaList.remove(0);
        bombo.remove(out);
        return out;
    }
    public Bola getBola(){
        Bola bola=null;
        Iterator<Bola>iterator= bombo.iterator();
        if (iterator.hasNext()){
            bola=iterator.next();
            iterator.remove();
        }
        return bola;
    }


    @Override
    public String toString(){
        return bombo.toString();
    }


}
