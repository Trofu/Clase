package Sets.Ejercicio;

import java.util.Objects;

public class Bola implements Comparable<Bola> {

    private int numero;

    public Bola(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "El numero de la bola es: "+numero;
    }
    @Override
    public int hashCode() {
        return numero;
    }
    @Override
    public boolean equals(Object obj){
        if (obj==null|| !(obj instanceof Bola))return false;
        Bola bola = (Bola) obj;
        return bola.getNumero()==numero;
    }
    @Override
    public int compareTo(Bola bola){
        return numero- bola.getNumero();
    }

}
