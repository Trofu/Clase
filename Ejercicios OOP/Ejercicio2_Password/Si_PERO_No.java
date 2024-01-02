package Ejercicio2_Password;

import java.util.Random;

public class Si_PERO_No {
    private static final int LONGITUD_DEFECTO = 10;
    private int longitud;
    private String contrasena;

    public Si_PERO_No() {
        this.longitud = LONGITUD_DEFECTO;
        this.contrasena = generarPassword();
    }

    public Si_PERO_No(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarPassword();
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
        return mayusculas >= 2 && minusculas >= 1 && numeros >= 4;
    }

    public String generarPassword() {
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String pass = "";
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int num = random.nextInt(letras.length);
            pass += letras[num];
        }
        return pass;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String toString() {
        return "Contraseña de longitud " + longitud + " es: " + contrasena;
    }
}

