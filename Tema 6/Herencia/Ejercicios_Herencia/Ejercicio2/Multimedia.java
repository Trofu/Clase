package Ejercicios_Herencia.Ejercicio2;

import java.util.Objects;

public class Multimedia {

    private String titulo;
    private String autor;
    private Formato formato;
    private int duracion;

    public Multimedia(String titulo, String autor, Formato formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }
    public Formato getFormato() {
        return formato;
    }
    public String getAutor() {
        return autor;
    }
    public int getDuracion() {
        return duracion;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "La cancion "+titulo+" de "+autor+" de duracion: "+duracion+" en formato: "+formato;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null) return false;
        if (!(o instanceof Multimedia)) return false;
        Multimedia that = (Multimedia) o;
        return this.titulo.equals(that.getTitulo()) &&
                this.autor.equals(that.getAutor());
    }
}
