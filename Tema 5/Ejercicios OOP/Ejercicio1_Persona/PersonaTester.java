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
            System.out.print("Nombre: ");
            nombre=sc.nextLine();
            System.out.print("Apellidos: ");
            apellidos=sc.nextLine();
            System.out.print("Edad: ");
            edad= sc.nextInt();sc.nextLine();
            System.out.print("Tienes DNI?: (Si/No) ");
            dnisi = sc.nextLine();
            if (dnisi.equalsIgnoreCase("si")){
                System.out.print("DNI: ");
                dni= sc.nextLine();
                System.out.print("Sexo: ");
                sexo= sc.nextLine();
                System.out.print("Peso(kg): ");
                peso= sc.nextDouble();
                System.out.print("Altura(metros): ");
                altura= sc.nextDouble();sc.nextLine();
                personas[i] = new Persona(nombre,apellidos,edad,dni,sexo,peso,altura);
            }else {
                personas[i] = new Persona(nombre,apellidos,edad);
            }
            System.out.print("Es mayor de edad?: ");
            if (personas[i].esMayorDeEdad()){
                System.out.println("Si");
            }else {
                System.out.println("No");
            }
            int num =personas[i].calcularIMC();
            if (num==-1){
                System.out.println("El IMC esta en el rango bajo");
            } else if (num==0) {
                System.out.println("El IMC esta en el rango normal");
            } else if (num==1) {
                System.out.println("El IMC esta en el rango sobrepeso");
            }else if (num==2){
                System.out.println("El IMC esta en el rango obeso");
            }
            System.out.println("El DNI es: "+personas[i].getDni());
            System.out.println("El sexo es: "+personas[i].getSexo()+"\n");
        }
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
    }
}