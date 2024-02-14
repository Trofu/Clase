package Streams;

import java.io.*;

public class CopyCharactersEnhaced {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos/Hola.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter ("Archivos/copiatexo2.txt"))){

            String copia;
            while((copia=br.readLine())!=null){
                bw.write(copia);
                bw.newLine();
                 }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
