package Ejercicios_Herencia.Ejercicio5;

public class Secretario extends Empleado{

    private static final int INCREMENTO=15;
    private String despacho;
    private String fax;

    public Secretario(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, String despacho, String fax) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }




}
