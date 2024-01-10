package Ejercicio2_Password;

public class Password {

    private static int longitud = 10;
    private String contrasena;


    Password(int longitud){
        this.longitud=longitud;
        this.contrasena=generarPassword();
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for (int i = 0; i < getLongitud(); i++) {
            char c = getContrasena().charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }
        return mayusculas > 2 && minusculas > 1 && numeros > 4;
    }


    public String generarPassword(){
        String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X"
                            ,"Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v"
                            ,"w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
        String pass="";
        for (int i = 0; i < longitud; i++) {
            int num = (int) (Math.random()*letras.length);
            pass+= letras[num];
        }
        return pass;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String toString() {
        return "Contraseña de logitud "+ longitud+" es: "+ contrasena;
    }
}
