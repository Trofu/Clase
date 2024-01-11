package Ejercicio3_Biblioteca;

public class BibliotecaTester {

    public static void main(String[] args) {
        Biblioteca biblio1 = new Biblioteca("de la Eliana","la Eliana");
        Biblioteca biblio2 = new Biblioteca("Municipla d'Alberic","Alberic");
        System.out.println(biblio1);
        System.out.println(biblio2);
        biblio1.nuevoLibro("El archivo de la tormenta","Brandon Sanderson",3);
        biblio1.nuevoLibro("El arte de la guerra","Sun Tzu",3);
        biblio1.nuevoLibro("Alas de sangre","Rebeca Yarros",3);
        biblio1.nuevoLibro("Harry Potter El Caliz de Fuego","J.K. Rowling",3);
        biblio1.nuevoLibro("La guerra de los chips","Chris Miller",3);
        System.out.println(biblio1);
        biblio2.eliminarLibro("Quijote");
        biblio2.eliminarLibro("El amor");
        biblio2.eliminarLibro("espíritus");
        biblio2.eliminarLibro("Franco");
        System.out.println(biblio2);
    }


}
