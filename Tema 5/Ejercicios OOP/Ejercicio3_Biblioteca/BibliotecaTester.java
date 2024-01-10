package Ejercicio3_Biblioteca;

public class BibliotecaTester {

    public static void main(String[] args) {
        Biblioteca biblio1 = new Biblioteca();
        Biblioteca biblio2 = new Biblioteca();
        System.out.println(biblio1+"\n");
        biblio1.nuevoLibro("YUJU","JONAS",5);
        System.out.println(biblio1);
    }


}
