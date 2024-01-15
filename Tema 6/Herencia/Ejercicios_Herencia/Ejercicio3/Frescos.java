package Ejercicios_Herencia.Ejercicio3;

import java.time.LocalDate;

public class Frescos extends Productos{

    private LocalDate fechaEnva;
    private String paisOrig;

    public Frescos(LocalDate fechaCad, int lote, LocalDate fechaEnva, String paisOrig) {
        super(fechaCad, lote);
        this.fechaEnva = fechaEnva;
        this.paisOrig = paisOrig;
    }

    public LocalDate getFechaEnva() {
        return fechaEnva;
    }

    public void setFechaEnva(LocalDate fechaEnva) {
        this.fechaEnva = fechaEnva;
    }

    public String getPaisOrig() {
        return paisOrig;
    }

    public void setPaisOrig(String paisOrig) {
        this.paisOrig = paisOrig;
    }

    @Override
    public void envioProducto(String direccion) {
        System.out.println("Envio de producto por coche a " + direccion);
    }

    @Override
    public String toString() {
        return "Producto fresco del lote "+getLote()+" con fecha de envase: "+fechaEnva+" desde "+paisOrig+" con fecha de caducidad: "+getFechaCad();
    }
}
