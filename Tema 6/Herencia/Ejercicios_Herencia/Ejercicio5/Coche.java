package Ejercicios_Herencia.Ejercicio5;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;

    public Coche(String matricula, String marca, String modelo){
        this.marca=marca;
        this.matricula=matricula;
        this.modelo=modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Coche con matricula: " + matricula +
                ", marca:" + marca + ", modelo:" + modelo;
    }
}
