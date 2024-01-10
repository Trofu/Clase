package Concesionario;

public class Main {
    public static void main(String[] args) {

        Vehiculo miIbiza = new Vehiculo("Seat","Ibiza","rojo","1235BHC",false,3);
        Vehiculo miBMW = new Vehiculo("BMW","I3","Negro","5321CBH",true,4);
        Vehiculo miToyota = new Vehiculo("Toyota","Corolla","rojo","9856BXT",false,5);
        System.out.println(miBMW);
        System.out.println(miToyota.getMarcha());
        miToyota.subirMarcha();
        System.out.println(miToyota.getMarcha());
    }

}
