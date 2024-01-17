package Ejercicios_Herencia.Ejercicio4;

public abstract class VehiculoMotor extends Vehiculo{

    private String tipoMotor;
    private int numMarchas;

    public VehiculoMotor(String tipoMotor, int numMarchas){
        this.numMarchas=numMarchas;
        this.tipoMotor=tipoMotor;
    }

    public String getTipoMotor(){return tipoMotor;}
    public int getNumMarchas(){return numMarchas;}
    public void setTipoMotor(String tipoMotor){this.tipoMotor=tipoMotor;}
    public void setNumMarchas(int numMarchas){this.numMarchas=numMarchas;}

    @Override
    public String toString(){
        return " tipo de motor: " + tipoMotor +
                " número de marchas: " + numMarchas +
                super.toString();
    }

}
