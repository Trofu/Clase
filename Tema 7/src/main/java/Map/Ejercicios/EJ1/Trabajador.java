package Map.Ejercicios.EJ1;

import Model.Persona;

import java.time.LocalDate;
import java.util.Comparator;

public class Trabajador implements Comparable<Trabajador> {

    public static final Comparator<Trabajador> SORT_BY_AGE= new Comparator<>() {
        @Override
        public int compare(Trabajador o1, Trabajador o2) {
            return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
        }
    };

    public static final Comparator<Trabajador> SORT_BY_AGE1 =
            ( o1, o2) -> o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());

    public static final Comparator<Trabajador> SORT_BY_AGE2 =
            Comparator.comparing(Trabajador::getFechaNacimiento);

    private String dni;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;


    public Trabajador(String dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    @Override
    public String toString() {
        return "El trabajador "+nombre+" "+apellidos+" con dni: "+dni +" nacio: "+fechaNacimiento+" ";
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null||!(obj instanceof Trabajador)) return false;
        Trabajador persona = (Trabajador) obj;
        return this.dni.equals(persona.getDni()) &&
                this.nombre.equals(persona.getNombre()) &&
                this.apellidos.equals(persona.getApellidos());
    }
    @Override
    public int compareTo(Trabajador trabajador){
        if (apellidos.equals(trabajador.getApellidos())){
            return nombre.compareTo(trabajador.getNombre());
        }
        return apellidos.compareTo(trabajador.getApellidos());
    }

    @Override
    public int hashCode(){
        return dni.hashCode()+nombre.hashCode()+apellidos.hashCode();
    }

}
