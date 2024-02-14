package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("Archivos/Jack_Russell_Terrier_1.jpg");
            fos = new FileOutputStream("Archivos/copia.jpg");

            int copia;

            while((copia=fis.read())!=-1)
                fos.write(copia);

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if(fis!=null)
                fis.close();
            if(fos!=null)
                fos.close();
        }

    }
}
