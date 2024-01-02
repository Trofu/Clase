package Ejercicio1_Persona;

import java.util.Scanner;

public class PersonaTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Persona[] personas = new Persona[6];
        for (Persona persona:personas) {
            int edad;
            double altura,peso;
            String nombre, apellidos, dni, sexo;
            System.out.print("Nombre: ");
            nombre=sc.nextLine();
            System.out.print("Apellidos: ");
            apellidos=sc.nextLine();
            System.out.print("Edad: ");
            edad= sc.nextInt();
            System.out.print("DNI: ");
            dni= sc.next();
            if (dni.equals(" ")){
                persona = new Persona(nombre,apellidos,edad);
            }else {
                System.out.print("Sexo: ");
                sexo= sc.next();
                System.out.print("Peso(kg): ");
                peso= sc.nextDouble();
                System.out.print("Altura(metros): ");
                altura= sc.nextDouble();
                persona = new Persona(nombre,apellidos,edad,dni,sexo,peso,altura);
            }
            System.out.println("Es mayor de edad?: "+persona.esMayorDeEdad());
            int num =persona.calcularIMC();
            if (num==-1){
                System.out.println("El IMC esta en el rango bajo");
            } else if (num==0) {
                System.out.println("El IMC esta en el rango normal");
            } else if (num==1) {
                System.out.println("El IMC esta en el raango sobrepeso");
            }else {
                System.out.println("El IMC esta en el rango obeso");
            }
            System.out.println("El DNI es: "+persona.getDni());
            System.out.println("El sexo es: "+persona.getSexo());
        }
    }




}
