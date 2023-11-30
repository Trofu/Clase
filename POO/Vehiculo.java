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
    public Vehiculo(String marca,String modelo,String color,String matricula,boolean cambioAuto){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.matricula=matricula;
        this.cambioAutomatico=cambioAuto;
        if (cambioAutomatico){
            this.numMarchas=0;
        }else{
            this.numMarchas=5;
        }

    }

}
