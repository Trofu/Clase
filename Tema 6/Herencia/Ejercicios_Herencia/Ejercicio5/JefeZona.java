package Ejercicios_Herencia.Ejercicio5;
import java.util.Arrays;
public class JefeZona extends Empleado{

    private static final int INCREMENTO=5;
    private String despacho;
    private Secretario secretario;
    private Vendedor[] vendedores;
    private Coche coche;

    public JefeZona(String nombre, String apellidos, String DNI, String direccion, String telefono, double salario, String despacho, Secretario secretario, Vendedor[] vendedores, Coche coche) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.coche = coche;
    }
    public void cambiarCoche(Coche coche){
        this.coche=coche;
    }
    @Override
    public boolean cambiarSupervisor(Empleado supervisor){
        if(!(supervisor instanceof JefeZona))
            return false;
        setSupervisor(supervisor);
        return true;
    }

    public void incrementarSalario(){
        cambiaSalario(INCREMENTO);
    }
    public void anyadirVendedores(Vendedor vendedor){
        Vendedor[] aux;
        if (vendedor==null){
            aux=new Vendedor[1];
        }else {
            aux=new Vendedor[vendedores.length+1];
            System.arraycopy(vendedores,0,aux,0,vendedores.length);
        }
        aux[aux.length-1]=vendedor;
        vendedores=aux;
    }

    private int buscarVendedor(Vendedor vendedor){
        if (vendedor!=null){
            for (int i = 0; i < vendedores.length; i++) {
                if (vendedores[i].equals(vendedor)){
                    return i;
                }
            }
        }
        return -1;
    }
    public boolean borrarVendedor(Vendedor vendedor){
        int pos= buscarVendedor(vendedor);
        if (pos<0)return false;
        Vendedor[]aux = new Vendedor[vendedores.length-1];
        if (pos>0) System.arraycopy(aux,0,aux,0,pos);
        System.arraycopy(vendedores,pos+1,aux,pos,(aux.length-pos));
        vendedores=aux;
        return true;
    }

    public void cambiarSecretario(Secretario secretario) {this.secretario=secretario;}

    @Override
    public String toString(){
        return "Jefe de Zona " + super.toString() + "\n coche: " + coche +
                " despacho: " + despacho + " secretario DNI: " + secretario.getDNI()
                + " vendedores: "+ Arrays.toString(vendedores);
    }
}
