package Ejercicios_Herencia.Ejercicio3;

import java.time.LocalDate;

public class Congelados extends Productos{

    private int tempCongel;

    public Congelados(LocalDate fechaCad, int lote, int tempCongel) {
        super(fechaCad, lote);
        this.tempCongel = tempCongel;
    }

    public int getTempCongel() {
        return tempCongel;
    }

    public void setTempCongel(int tempCongel) {
        this.tempCongel = tempCongel;
    }

    @Override
    public void envioProducto(String direccion) {
        System.out.println("Envio de producto por camion congelado a " + direccion);

    }

    @Override
    public String toString() {
        return "Producto congelado del lote "+getLote()+" con temperatura de congelado: "+tempCongel+" con fecha de caducidad: "+getFechaCad();
    }
}
