package Ejercicio3_Biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private int numero;
    private int prestados;


    Libro(String titulo, String autor, int numero){
        this.numero=numero;
        this.prestados=0;
        this.autor=autor;
        this.titulo=titulo;
    }
    public int getNumero() {
        return numero;
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
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public boolean prestamoLibro(){
        if (numero>0){
            prestados++;
            numero--;
            return true;
        }else {
            return false;
        }
    }
    public boolean devolucionLibro(){
        if (prestados>0){
            prestados--;
            numero++;
            return true;
        }else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "\nEl libro " + titulo+ " de " + autor+" tiene "+numero+ " ejemplares y " + prestados + " estan prestados";
    }
}
