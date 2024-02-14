package Exception.Exercicies.Gato;

public class Gato {

    private int edad;
    private String nombre;

    public Gato(String nombre,int edad) throws ExcepcionGatuna {
        setEdad(edad);
        setNombre(nombre);
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws ExcepcionGatuna{
        if (edad<0)
            throw new ExcepcionGatuna("Edad incorrepta");
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) throws ExcepcionGatuna {
        if (nombre.length()<=3)
            throw new ExcepcionGatuna("Nombre incorrecto");
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "El gato "+nombre+ " tiene "+edad+" años de edad";
    }
}

