package Ejercicios_Herencia.Ejercicio3;

import java.time.LocalDate;

public abstract class Productos {
    private LocalDate fechaCad;
    private int lote;

    public Productos(LocalDate fechaCad, int lote) {
        this.fechaCad = fechaCad;
        this.lote = lote;
    }
    public LocalDate getFechaCad() {
        return fechaCad;
    }
    public void setFechaCad(LocalDate fechaCad) {
        this.fechaCad = fechaCad;
    }
    public int getLote() {
        return lote;
    }
    public void setLote(int lote) {
        this.lote = lote;
    }

    public abstract void envioProducto(String direccion);

    @Override
    public String toString() {
        return "Producto del lote "+lote+" con fecha caducidad "+fechaCad;
    }
}
