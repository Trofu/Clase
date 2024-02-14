package Streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader("Archivos/Hola.txt");
            FileWriter fw = new FileWriter("Archivos/copiatexo.txt")){

            int copia;
            while((copia= fr.read())!=-1)
                fw.write(copia);

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
