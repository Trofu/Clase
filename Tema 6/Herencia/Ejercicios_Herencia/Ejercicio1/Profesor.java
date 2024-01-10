package Ejercicios_Herencia.Ejercicio1;

import java.util.Arrays;

public class Profesor extends Persona {

    private Grado[] imparte;

    public Grado[] getImparte() {
        return imparte;
    }

    public void setImparte(Grado[] imparte) {
        this.imparte = imparte;
    }

    public Profesor(String DNI, String nombre, String apellidos, int edad, Grado[] imparte) {
        super(DNI, nombre, apellidos, edad);
        this.imparte = imparte;
    }
    @Override
    public void printDNI(){
        System.out.println("Desde Profesor imprimo el DNI: " + getDNI());
    }

    @Override
    public String toString() {
        return "El profesor "+getNombre()+" da clase al grado "+ Arrays.toString(imparte);
    }
}
