package Ejercicios_Herencia.Ejercicio5;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
public abstract class Empleado extends Persona{
    private LocalDate fechaInicio;
    private String telefono;
    private double salario;
    private Empleado supervisor;
    public Empleado(String nombre, String apellidos, String DNI, String direccion,String telefono, double salario){
        super(nombre, apellidos, DNI, direccion);
        this.fechaInicio = LocalDate.now();
        this.telefono=telefono;
        this.salario=salario;
        this.supervisor=null; //remarco que lo inicio a null
    }

    protected void cambiaSalario(int incremento){
        salario = (salario*(1+(incremento/100)));
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public abstract boolean cambiarSupervisor(Empleado supervisor);
    public abstract void incrementarSalario();

    private long diasEntreFechas(){
        return DAYS.between(LocalDate.now(),fechaInicio);
    }

    @Override
    public String toString(){
        return super.toString() + "\n telefono: " + telefono
                + " salario: " + salario + " antigüedad: " + diasEntreFechas()
                + "supervisor: "
                + ((supervisor==null)?"no tiene":supervisor.getNombre()+" "+getApellidos());

    }
}
