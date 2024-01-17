package Ejercicios_Herencia.Ejercicio4;

public class Coche extends VehiculoMotor{
    private String matricula;
    public Coche(String tipoMotor, int numMarchas, String matricula){
        super(tipoMotor, numMarchas);
        this.matricula=matricula;
    }

    public String getMatricula(){return matricula;}

    @Override
    public boolean subirVelocidad(int incremento) {
        if(incremento<1 || incremento>40)
            return false;
        setVelocidad(getVelocidad()+incremento);
        return true;
    }

    @Override
    public boolean bajarVelocidad(int decremento) {
        if(decremento<1 || (getVelocidad()-decremento)<0)
            return false;
        setVelocidad(getVelocidad()-decremento);
        return true;
    }

    @Override
    public String toString(){
        return "Coche con matricula " + matricula + " " + super.toString();
    }

}
