package Ejercicio1_Persona;

public class PersonaTester {

    public static void main(String[] args) {

        Persona[] personas = new Persona[6];



        Persona Juan = new Persona("Juan","JUJU JJJUU",18,"Hombre", 80.3,1.93);
        System.out.println(Juan);
        int num = Juan.calcularIMC();
        if (num==-1){
            System.out.println("El IMC esta en el rango bajo");
        } else if (num==0) {
            System.out.println("El IMC esta en el rango normal");
        } else if (num==1) {
            System.out.println("El IMC esta en el raango sobrepeso");
        }else {
            System.out.println("El IMC esta en el rango obeso");
        }
    }




}
