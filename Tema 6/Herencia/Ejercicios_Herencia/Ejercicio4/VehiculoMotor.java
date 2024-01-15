package Ejercicios_Herencia.Ejercicio4;

public class VehiculoMotor extends Vehiculo{

    private String tipoMotor;
    private int numMarchas;

    public VehiculoMotor(int velocidad, String tipoMotor, int numMarchas) {
        super(velocidad);
        this.tipoMotor = tipoMotor;
        this.numMarchas = numMarchas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

}
