package Ejercicio3_Biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;


    Libro(String titulo, String autor, int numero){
        this.ejemplares=numero;
        this.prestados=0;
        this.autor=autor;
        this.titulo=titulo;
    }
    public int getEjemplares() {
        return ejemplares;
    }
    public int getPrestados() {
        return prestados;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    public void setEjemplares(int numero) {
        this.ejemplares = numero;
    }
    public boolean prestamoLibro(){
        if (ejemplares>0){
            prestados++;
            ejemplares--;
            return true;
        }else {
            return false;
        }
    }
    public boolean devolucionLibro(){
        if (prestados>0){
            prestados--;
            ejemplares++;
            return true;
        }else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "\nEl libro " + titulo+ " de " + autor+" tiene "+ejemplares+ " ejemplares y " + prestados + " estan prestados";
    }
}
