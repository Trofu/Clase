package Ejercicios_Herencia.Ejercicio5;
import java.util.Arrays;
public class Vendedor extends Empleado{
    private static final int INCREMENTO=10;
    private Coche coche;
    private String movil;
    private String areaVenta;
    private Cliente[] clientes;
    private double comision;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion,String telefono, double salario,Coche coche,String movil, String areaVenta, double comision){
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.areaVenta=areaVenta;
        this.comision=comision;
        this.movil=movil;
        this.coche=coche;
        clientes = null;
    }

    @Override
    public void incrementarSalario(){
        cambiaSalario(INCREMENTO);
    }

    @Override
    public boolean cambiarSupervisor(Empleado supervisor){
        if(!(supervisor instanceof Vendedor || supervisor instanceof JefeZona))
            return false;
        setSupervisor(supervisor);
        return true;
    }

    public void anyadirCliente(Cliente cliente){
        Cliente[] aux;
        if(clientes==null){
            aux = new Cliente[1];
        } else {
            aux= new Cliente[clientes.length+1];
            System.arraycopy(clientes,0,aux,0,clientes.length);
        }
        aux[aux.length-1]=cliente;
        clientes=aux;
    }

    private int buscarCliente(Cliente cliente){
        if(cliente!=null){
            for (int i = 0; i < clientes.length; i++) {
                if(clientes[i].equals(cliente))
                    return i;
            }
        }
        return -1;
    }

    public boolean borrarCliente(Cliente cliente){
        int pos=buscarCliente(cliente);
        if(pos<0)
            return false;
        Cliente[] aux = new Cliente[clientes.length-1];
        if(pos>0)
            System.arraycopy(clientes,0,aux,0,pos);
        System.arraycopy(clientes,pos+1,aux,pos,(clientes.length-pos)-1);
        clientes=aux;
        return true;
    }

    public void cambiarCoche(Coche coche){
        this.coche=coche;
    }

    @Override
    public String toString(){
        return "Vendedor " + super.toString() + "\n coche: " + coche +
                " movil: " + movil + " area de venta: " + areaVenta
                + " comision: " + comision + " clientes: "+ Arrays.toString(clientes);
    }

}
