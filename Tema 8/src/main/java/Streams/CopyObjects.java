package Streams;

import java.io.*;
import java.math.BigDecimal;

public class CopyObjects {

    static BigDecimal[] precios ={new BigDecimal(0.99),new BigDecimal(2.59),new BigDecimal(1.99)};
    static String[] productos = {"naranja","tomate","manzana"};
    static Integer[]stock = {100,200,300};

    public static void main(String[] args) {

        try {
            save();
            load();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
    public static void save() throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Archivos/objectos.dat")))){
            for (int i = 0; i < productos.length; i++) {
                oos.writeObject(productos[i]);
                oos.writeObject(precios[i]);
                oos.writeObject(stock[i]);
            }
        }
    }

    public static void load() throws IOException,ClassNotFoundException{
        try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Archivos/objectos.dat")))){
            BigDecimal precio;
            String producto;
            Integer stock;
            while (true){
                producto= (String) ois.readObject();
                precio=(BigDecimal) ois.readObject();
                stock= (Integer) ois.readObject();
                System.out.println("Producto "+producto+" precio: "+precio+" stock: "+stock);
            }
        }catch (EOFException e){

        }
    }



}
