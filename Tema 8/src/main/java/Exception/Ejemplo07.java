package Exception;

public class Ejemplo07 {

    public static void main(String[] args) {

        try{
            contieneA("Aray");
            contieneA("Santi");
        }catch (Exception e){
            System.err.println(e);
        }




    }

    public static void contieneA(String nombre) throws Exception{
        if (!nombre.contains("A")&&!nombre.contains("a")){
            throw new Exception("No tiene la A");
        }
        System.out.println(nombre);
    }

}
