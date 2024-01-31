package Map.Ejercicios.EJ1;

import Model.Persona;

import java.time.LocalDate;
import java.util.Objects;

public class Trabajador implements Comparable<Trabajador> {


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
        return "El trabajador "+nombre+" "+apellidos+" con dni: "+dni +" nacio: "+fechaNacimiento;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null||!(obj instanceof Persona)) return false;
        Persona persona = (Persona) obj;
        return this.dni.equals(persona.getDNI()) &&
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

}
