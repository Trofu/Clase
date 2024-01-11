package Ejercicio3_Biblioteca;

import java.util.Arrays;

public class Biblioteca {

    private int numero_libro_max;
    private static Libro[] libros=new Libro[100];
    private String nombre;
    private String localizacion;

    public Biblioteca(String nombre, String localizacion) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        String[][] libro = {
                {"Don Quijote de la Mancha", "Miguel de Cervantes Saavedra"},
                {"Cien años de soledad","Gabriel García Márquez"},
                {"El alquimista", "Paulo Coehlo"},
                {"20 poemas de amor y una canción desesperada", "Pablo Neruda"},
                {"La ciudad y los perros", "Mario Vargas Llosa"},
                {"La casa de los espíritus","Isabel Allende"},
                {"Desolación", "Gabriela Mistral"},
                {"Rayuela", "Julio Cortázar"},
                {"El Aleph", "Jorge Luis Borges"},
                {"El amor en los tiempos del cólera","Gabriel García Márquez"}
        };
        numero_libro_max=libro.length;
        for (int i = 0; i < libro.length; i++) {
            libros[i] = new Libro(libro[i][0], libro[i][1], 3);
        }
    }

    Biblioteca(){
        String[][] libro = {
                {"Don Quijote de la Mancha", "Miguel de Cervantes Saavedra"},
                {"Cien años de soledad","Gabriel García Márquez"},
                {"El alquimista", "Paulo Coehlo"},
                {"20 poemas de amor y una canción desesperada", "Pablo Neruda"},
                {"La ciudad y los perros", "Mario Vargas Llosa"},
                {"La casa de los espíritus","Isabel Allende"},
                {"Desolación", "Gabriela Mistral"},
                {"Rayuela", "Julio Cortázar"},
                {"El Aleph", "Jorge Luis Borges"},
                {"El amor en los tiempos del cólera","Gabriel García Márquez"}
        };
        numero_libro_max=libro.length;
        for (int i = 0; i < libro.length; i++) {
            libros[i] = new Libro(libro[i][0], libro[i][1], 3);
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setNumero_libro_max(int numero_libro_max) {
        this.numero_libro_max = numero_libro_max;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero_libro_max() {
        return numero_libro_max;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public int recuperarLibro(String titulo){
        for (int i = 0; i < libros.length; i++) {
            String tituloLibro = libros[i].getTitulo();
            tituloLibro= tituloLibro.substring(0,titulo.length());
            if (tituloLibro.equalsIgnoreCase(titulo)){
                return i;
            }
        }
        return -1;
    }
    public boolean nuevoLibro(String titulo,String autor,int ejemplares){
        if (numero_libro_max==100){
            return false;
        }else {
            libros[numero_libro_max]=new Libro(titulo,autor,ejemplares);
            numero_libro_max++;
            return true;
        }
    }
    public boolean eliminarLibro(String titulo){
        int pos = recuperarLibro(titulo);
        if (pos<0){
            return false;
        }else if (pos>=0){
            libros[pos]=libros[numero_libro_max-1];
            libros[numero_libro_max-1]=null;
            numero_libro_max--;
            return true;
        }
        return false;
    }
    public boolean prestamo(String titulo){
        int pos = recuperarLibro(titulo);
        if (pos<0){
            return false;
        }else {
            return libros[pos].prestamoLibro();
        }
    }
    public boolean devolucion(String titulo){
        int pos = recuperarLibro(titulo);
        if (pos<0){
            return false;
        }else {
            return libros[pos].devolucionLibro();
        }
    }
    @Override
    public String toString() {
        return "La Biblioteca "+nombre+" de la calle "+localizacion+
                " tiene "+ numero_libro_max+" de libros.\n"+Arrays.toString(libros)+"\n";

    }
}
