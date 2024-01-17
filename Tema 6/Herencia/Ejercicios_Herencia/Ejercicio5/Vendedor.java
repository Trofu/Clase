package Ejercicios_Herencia.Ejercicio5;

public class Vendedor extends Empleado{

    private static final int INCREMENTO=10;
    private Coche coche;
    private String movil;
    private String areaVenta;
    private Cliente[] clientes;
    private double comision;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, Coche coche, String movil, String areaVenta, double comision) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.coche = coche;
        this.movil = movil;
        this.areaVenta = areaVenta;
        this.comision = comision;
        clientes = new Cliente[100];
    }
    @Override
    public void incrementarSalario(){
        cambioSalario(INCREMENTO);
    }
    @Override
    public boolean cambiarSupervisor(Empleado supervisor) {
        if(!(supervisor instanceof Secretario||supervisor instanceof JefeZona))
            return false;
        setSupervisor(supervisor);
        return true;
    }

    public void anyadirCliente(Cliente cliente){
        Cliente[] aux;
        if (cliente==null){
            aux=new Cliente[1];
        }else {
            aux=new Cliente[clientes.length+1];
            System.arraycopy(clientes,0,aux,0,clientes.length);
        }
        aux[aux.length-1]=cliente;
        clientes=aux;
    }

}
