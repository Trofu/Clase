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
    @Override
    public void incrementarSalario(){
        cambiaSalario(INCREMENTO);
    }

    @Override
    public boolean cambiarSupervisor(Empleado supervisor){
        if(!(supervisor instanceof Secretario || supervisor instanceof JefeZona))
            return false;
        setSupervisor(supervisor);
        return true;
    }

    @Override
    public String toString(){
        return "Secretario " + super.toString() + "\n despacho: " + despacho +
                " fax: " + fax;
    }
}
