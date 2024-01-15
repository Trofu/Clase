package Ejercicios_Herencia.Ejercicio3;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Refrigerados atun = new Refrigerados(LocalDate.of(2024,4,15),23,25687);
        atun.envioProducto("Mercadona");
        System.out.println(atun);


    }
}
