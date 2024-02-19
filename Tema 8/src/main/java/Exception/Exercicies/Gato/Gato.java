package Exception.Exercicies.Gato;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Gato implements Serializable {

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

    public List<Gato> load(String fichero) throws IOException,ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Tema 8/src/main/java/Streams/Ejercicios/EJ1/Content/"+fichero+".dat")))){
            List<Gato> gatos = new ArrayList<>();
            Gato gato = ((Gato) ois.readObject());
            while (gato!=null){
                gatos.add(gato);
                try {
                    gato = (Gato) ois.readObject();
                } catch (EOFException e){
                    break;
                }
            }
            return gatos;
        }
    }

    public void save(List<Gato> lista,String fichero)throws IOException{
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Tema 8/src/main/java/Streams/Ejercicios/EJ1/Content/"+fichero+".dat")))){
            for (Gato gato:lista){
                oos.writeObject(gato);
            }
        }
    }


    @Override
    public String toString() {
        return "El gato "+nombre+ " tiene "+edad+" años de edad";
    }
}

