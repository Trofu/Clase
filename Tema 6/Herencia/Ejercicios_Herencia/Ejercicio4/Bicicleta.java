package Ejercicios_Herencia.Ejercicio4;

public class Bicicleta extends Vehiculo{
    private String tipo;

    public Bicicleta(String tipo){
        this.tipo=tipo;
    }

    @Override
    public boolean subirVelocidad(int incremento){
        //una bici no puede subir más de 4 kms/h su velocidad de una
        if(incremento<1 || incremento>4)
            return false;
        setVelocidad(getVelocidad()+incremento);
        return true;
    }

    @Override
    public boolean bajarVelocidad(int decremento){
        if(decremento<0 || decremento>4 || (getVelocidad()-decremento)<0)
            return false;
        for (int i = 0; i < decremento; i++) {
            bajarVelocidad1();
        }
        return true;
    }

    @Override
    public String toString(){
        return "Bicicleta tipo " + tipo + " " + super.toString();
    }

}
