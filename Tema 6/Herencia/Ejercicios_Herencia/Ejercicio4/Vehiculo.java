package Ejercicios_Herencia.Ejercicio4;

public abstract class Vehiculo {

    private int velocidad;
    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean subirVelocidad(int i){
        if (velocidad<120){
            velocidad++;
            return true;
        }
        return false;
    }
    public boolean bajarVelocidad(int i){
        if (velocidad>0){
            velocidad--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "El vehiculo va a "+velocidad;
        }
}
