package Exception;


public class ExcepcionMayor10 extends Exception{
    private int num;

    public ExcepcionMayor10(int num){
        super();
        this.num=num;
    }

    @Override
    public String toString(){
        return "Excepción mayor de 10. Número introducido: " + num;
    }

}