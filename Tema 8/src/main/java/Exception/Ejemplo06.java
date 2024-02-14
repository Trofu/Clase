package Exception;

public class Ejemplo06 {
    public static void main(String[] args) {
        try {
            numero(2);
            numero(17);
        } catch (ExcepcionMayor10 e){
            System.err.println(e);
        }
    }

    public static void numero(int num) throws ExcepcionMayor10{
        if(num>=10)
            throw new ExcepcionMayor10(num);
        System.out.println("Número: " + num);
    }

}
