package Ejercicios_Herencia.Ejercicio1;

public class Alumno extends Persona {

    private int nia;
    private Grado grado;

    public Alumno(String DNI, String nombre, String apellidos, int edad, int nia, Grado grado) {
        super(DNI, nombre, apellidos, edad);
        this.nia = nia;
        this.grado = grado;
    }

    public Alumno(String DNI, String nombre, String apellidos, int edad, Grado grado) {
        super(DNI, nombre, apellidos, edad);
        this.grado = grado;
        this.nia=generarNIA();
    }

    private int generarNIA(){
        return (int)(Math.random()*100000000);
    }
    @Override
    public void printDNI(){
        System.out.println("Desde Alumno imprimo el DNI: " + getDNI());
    }

    @Override
    public String toString() {
        return "El alumno "+getNombre()+ " CON NIA: "+nia+ " estudia "+grado;
    }
}
