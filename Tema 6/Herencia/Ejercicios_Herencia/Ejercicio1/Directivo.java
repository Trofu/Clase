package Ejercicios_Herencia.Ejercicio1;

import java.util.Arrays;

public class Directivo extends Persona{

    private String cargo;

    private Grado[] grado;
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Directivo(String DNI, String nombre, String apellidos, int edad, String cargo, Grado[] grado) {
        super(DNI, nombre, apellidos, edad);
        this.cargo = cargo;
        this.grado = grado;
    }

    @Override
    public void printDNI(){
        System.out.println("Desde Directivo imprimo el DNI: " + getDNI());
    }
    @Override
    public String toString() {
        return "El directivo "+getNombre()+" con cargo "+cargo+" da clase a "+ Arrays.toString(grado);
    }
}

