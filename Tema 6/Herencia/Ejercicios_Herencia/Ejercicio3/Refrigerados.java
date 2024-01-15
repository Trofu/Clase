package Ejercicios_Herencia.Ejercicio3;

import java.time.LocalDate;

public class Refrigerados extends Productos{

    private int cod;

    public Refrigerados(LocalDate fechaCad, int lote, int orgaSuperAliment) {
        super(fechaCad, lote);
        this.cod = orgaSuperAliment;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public void envioProducto(String direccion) {
        System.out.println("Envio de producto por furgoneta a " + direccion);

    }

    @Override
    public String toString() {
        return "Producto refrigerado del lote "+getLote()+" con codigo del organismo de supervision alimentaria: "+cod+" con fecha de caducidad: "+getFechaCad();
    }
}
