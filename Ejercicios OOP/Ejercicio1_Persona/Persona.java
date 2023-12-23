package Ejercicio1_Persona;

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private Sexo sexo;
    private double peso;
    private double altura;


    Persona(String nombre, String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        dni=null;
        sexo=Sexo.NoQuieroDecirlo;
        peso=0;
        altura=0;
    }

    Persona(String nombre, String apellidos, int edad, String sexo, double peso, double altura){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.dni=generaDNI();
        if (sexo.equals("Hombre")){
            this.sexo=Sexo.Hombre;
        }else if (sexo.equals("Mujer")){
            this.sexo=Sexo.Mujer;
        }else {
            this.sexo=Sexo.NoQuieroDecirlo;
        }
        this.peso=peso;
        this.altura=altura;
    }

    public int calcularIMC(){
        double imc = peso/(altura*altura);
        if (imc<18.5){
            return -1;
        }else if (imc>=18.5&&imc<25){
            return 0;
        }else if (imc>=25&&imc<30){
            return 1;
        }else {
            return 2;
        }
    }
    public boolean esMayorDeEdad(){
        if (edad>=18){
            return true;
        }
        return false;
    }
    private String generaDNI(){
        int dni = (int) (Math.random()*100000000);
        char[] letra ={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K'};
        return dni+""+letra[dni%23];
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return  "La persona "+nombre+" "+apellidos+" tiene " + edad +" años de edad, con DNI: "+dni+", "+sexo+" con peso "
                +peso+"kg y altura: "+ altura+"metros";
    }
}
