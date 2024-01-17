package Ejercicios_Herencia.Ejercicio4;

public class main {
    public static void main(String[] args) {
        Bicicleta bmx = new Bicicleta("Montaña");
        System.out.println(bmx.getVelocidad());
        bmx.subirVelocidad1();
        bmx.subirVelocidad1();
        bmx.bajarVelocidad(3);
        System.out.println(bmx);

        Coche bmw = new Coche("Electrico",0,"0000XXX");
        System.out.println(bmw);
        bmw.subirVelocidad(35);
        bmw.bajarVelocidad(10);
        System.out.println(bmw);

    }
}
