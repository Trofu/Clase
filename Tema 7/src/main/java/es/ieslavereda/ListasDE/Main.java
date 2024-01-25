package es.ieslavereda.ListasDE;

public class Main {

    public static void main(String[] args) {

        Lista listaEnteros = new Lista();
        listaEnteros.addHead("5");
        listaEnteros.addHead("10");
        listaEnteros.addHead("15");
        listaEnteros.addTail("0");
        listaEnteros.addTail("-5");
        System.out.println(listaEnteros);
        System.out.println(listaEnteros);
        listaEnteros.removeHead();
        System.out.println(listaEnteros);
        System.out.println(listaEnteros.contains("5"));
        System.out.println(listaEnteros.get(0));
        System.out.println(listaEnteros);
        System.out.println(listaEnteros.remove(1));
        System.out.println(listaEnteros);
        String[] a = new String[]{"1","20","45","73","-123","654","2","0","-23","1"};
        listaEnteros.addAll(a);
        System.out.println(listaEnteros);


    }

}
