package Ejercicios_Herencia.Ejercicio4;

public abstract class Vehiculo {
    private int velocidad;

    //podría no estar
    public Vehiculo(){
        this.velocidad=0;
    }

    public int getVelocidad(){ return velocidad;}
    public void setVelocidad(int velocidad){ this.velocidad=velocidad;}

    public void subirVelocidad1(){velocidad++;}
    public void bajarVelocidad1(){velocidad--;}

    public abstract boolean subirVelocidad(int incremento);
    public abstract boolean bajarVelocidad(int decremento);

    @Override
    public String toString(){
        return "velocidad: " + velocidad;
    }
}
