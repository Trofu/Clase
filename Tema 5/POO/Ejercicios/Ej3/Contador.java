package Ejercicios.Ej3;

public class Contador {

    private int num;

    public Contador(){
        this.num=0;
    }
    public Contador(int cont){
        this.num=cont;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num ;
    }

    public void increment(){
        num++;
    }

    public void decrement(){
        num--;
    }

    @Override

    public String toString(){
        return "Contador en: "+num;
    }

}
