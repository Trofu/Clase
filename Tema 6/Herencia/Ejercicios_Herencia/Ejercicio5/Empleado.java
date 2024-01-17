package Ejercicios_Herencia.Ejercicio5;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public abstract class Empleado extends Persona{

    private LocalDate fechaInicio;
    private String telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario) {
        super(nombre, apellidos, DNI, direccion);
        this.fechaInicio = LocalDate.now();
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor=null; //iniciar a null
    }

    protected void setSalario(double salario){this.salario=salario;}

    protected abstract boolean cambiarSupervisor(Empleado supervisor);
    public abstract void incrementarSalario();

    private long diasEntreFechas(){
        return DAYS.between(LocalDate.now(),fechaInicio);
    }
    @Override
    public String toString() {
        return "Empleado con "+super.toString()+" telefono: "+telefono + " salario: "+salario+" antigüedad: "+diasEntreFechas()+" supervisor: "+((supervisor==null)?"no tiene":supervisor.getNombre()+" "+getApellidos());
    }
}
