package Ejercicios_Herencia.Ejercicio2;

public class Pelicula extends Multimedia {

    private String actor;
    private String actriz;

    private static final String ANIMACION = "Animacion";
    public Pelicula(String titulo, String autor, Formato formato, int duracion, String actor, String actriz) {
        this(titulo, autor, formato, duracion);
        if (!(actor==null&&actriz==null)){
            this.actor=actor;
            this.actriz=actriz;
        }
    }

    public Pelicula(String titulo, String autor, Formato formato, int duracion) {
        super(titulo, autor, formato, duracion);
        actor=ANIMACION;
        actriz=ANIMACION;
    }

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    @Override
    public String toString() {
        return "En la pelicula "+getTitulo()+" de "+getActor()+" aparece el actor "+actor+" y la actriz "+actriz;
    }
}
