package Ejercicios.Ej5;

public class Fraccion {

    private int denominador;
    private int numerador;

    public Fraccion(){
        denominador=0;
        numerador=0;
    }

    public Fraccion(int numNum, int numDem){
        this.numerador=numNum;
        this.denominador=numDem;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public Fraccion suma(Fraccion f1){
        if (this.denominador== f1.getDenominador()){
            int num= this.numerador+f1.getNumerador();
            return new Fraccion(num,this.numerador);
        }else {
            int num=(this.getNumerador()*f1.getDenominador())+(f1.getNumerador()*this.getDenominador());
            int den= this.denominador*f1.getDenominador();
            return new Fraccion(num,den);
        }
    }

    public void resta(Fraccion f1){

    }

    public Fraccion multiplicacion(Fraccion f1){
        int num = this.getNumerador()* f1.getNumerador();
        int den = this.getDenominador()*f1.getDenominador();
        return new Fraccion(num,den);
    }

    public Fraccion division (Fraccion f1){
        int num = this.getNumerador()*f1.getDenominador();
        int den = this.getDenominador()*f1.getNumerador();
        return new Fraccion(num,den);
    }

    @Override
    public String toString() {
        return numerador+"/"+denominador;
    }
}
