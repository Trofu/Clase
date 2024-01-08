package Ejercicio1_Persona;
import java.util.Scanner;
public class PersonaTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Persona[] personas = new Persona[6];
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona " + (i+1));
            int edad;
            double altura,peso;
            String nombre, apellidos, dni, sexo,dnisi;
            System.out.println("Nombre: ");
            nombre=sc.nextLine();
            System.out.println("Apellidos: ");
            apellidos=sc.nextLine();
            System.out.print("Edad: ");
            edad= sc.nextInt();
            System.out.print("Tienes DNI?: ");
            dnisi = sc.next();
            if (dnisi.equals("si")){
                System.out.print("DNI: ");
                dni= sc.next();
                System.out.print("Sexo: ");
                sexo= sc.next();
                System.out.print("Peso(kg): ");
                peso= sc.nextDouble();
                System.out.print("Altura(metros): ");
                altura= sc.nextDouble();
                personas[i] = new Persona(nombre,apellidos,edad,dni,sexo,peso,altura);
            }else {
                personas[i] = new Persona(nombre,apellidos,edad);
            }
            System.out.println("Es mayor de edad?: "+personas[i].esMayorDeEdad());
            int num =personas[i].calcularIMC();
            if (num==-1){
                System.out.println("El IMC esta en el rango bajo");
            } else if (num==0) {
                System.out.println("El IMC esta en el rango normal");
            } else if (num==1) {
                System.out.println("El IMC esta en el rango sobrepeso");
            }else {
                System.out.println("El IMC esta en el rango obeso");
            }
            System.out.println("El DNI es: "+personas[i].getDni());
            System.out.println("El sexo es: "+personas[i].getSexo()+"\n");
        }
    }
}