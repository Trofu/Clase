package Ejercicios.Ej1;
public class Cuenta {
    private static final String COD_CUENTA="ES33";
    private double money;
    private String titular;
    private String numCuenta;
    private static int num;
    public Cuenta(String titular){
        this.money=50;
        this.titular=titular;
        this.numCuenta=COD_CUENTA+num;
        num++;
    }
    public Cuenta(String titular,double money){
        this(titular);
        this.money=money;
    }
    public boolean ingreso(double cant){
        if (cant>0) {
            this.money+=cant;
            return true;
        }
        return false;
    }
    public boolean reintegro(double cant){
        if (cant>0) {
            this.money-=cant;
            return true;
        }
        return false;
    }
    public boolean transferencia(Cuenta Cuenta, double money){
        if (money>0) {
            reintegro(money);
            Cuenta.ingreso(money);
            return true;
        }
        return false;
    }
    public double getMoney() {
        return money;
    }
    public String getNumCuenta() {
        return numCuenta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString(){
        return "Dinero actual en la cuenta: "+money+ "\nEl actual titular de la cuenta es: "
                +titular+"\nNumero de cuenta es: "+numCuenta;
    }

}
