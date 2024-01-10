package Concesionario;

public class Taller {

    private String nombre;
    private Vehiculo[] vehiculos;
    private int vehiculosTaller;

    public Taller(String nombre){
        this.nombre = nombre;
        vehiculos = new Vehiculo[10];
        this.vehiculosTaller=0;
    }

//    public void addVehiculos(Vehiculo ... vehiculo) {
//        if (vehiculosTaller<10) {
//
//        }
//    }

    public boolean cambioColor(String color, int pos){
        if (pos>=0 && pos<=10) {
            vehiculos[pos].settColor(color);
            return true;
        }
        return false;
    }


}
