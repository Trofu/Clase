package Concesionario;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int marcha;
    private String matricula;
    private boolean cambioAutomatico;
    private  int numMarchas;
    public Vehiculo(){
        marca="";
        modelo="";
        color="";
        matricula="";
        cambioAutomatico=false;
        numMarchas=0;
    }
    public Vehiculo(String marca,String modelo,String color,String matricula,boolean cambioAuto,int marcha){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.marcha=marcha;
        this.matricula=matricula;
        this.cambioAutomatico=cambioAuto;
        if (cambioAutomatico){
            this.numMarchas=0;
            this.marcha=0;
        }else{
            this.numMarchas=5;
        }
    }
    public String getMarca(){
        return marca;
    }
    public String getColor(){
        return color;
    }
    public void settColor(String color){
        this.color = color;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMatricula(){
        return matricula;
    }
    public void settMatricula(String matricula){
        this.matricula = matricula;
    }
    public int getMarcha(){
        return  marcha;
    }
    public void settMarcha(int marcha){
        this.marcha = marcha;
    }
    public boolean getCambioAutomatico(){
        return cambioAutomatico;
    }
    public void settCambioAutomatico(boolean cambioAutomatico){
        this.cambioAutomatico = cambioAutomatico;
    }
    public int getNumMarcha(){
        return  numMarchas;
    }
    public void settNumMarcha(int numMarcha){
        this.numMarchas = numMarchas;
    }

    public void subirMarcha(){
        if (marcha<numMarchas&&!cambioAutomatico){
            this.marcha+=1;
        }
    }
    public void bajarMarcha(){
        if (marcha>0&&!cambioAutomatico){
            this.marcha-=1;
        }
    }


    @Override
    public String toString() {
        String Automatico = cambioAutomatico?"automatico":"manual";
        return "Concesionario.Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", matricula='" + matricula + '\'' +
                ", cambioAutomatico=" + Automatico+"}"
                ;
    }
}