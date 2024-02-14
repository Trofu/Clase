package Streams;

import java.io.*;

public class CopyData {

    static double[] precios ={0.99,2.59,1.99};
    static String[] productos = {"naranja","tomate","manzana"};
    static int[]stock = {100,200,300};

    public static void main(String[] args) {

        try {
            save();
            load();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void save() throws IOException {
        try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Archivos/fruteria.dat"))))
        {
            for (int i = 0; i < productos.length; i++) {
                dos.writeUTF(productos[i]);
                dos.writeDouble(precios[i]);
                dos.writeInt(stock[i]);
            }
        }
    }

    public static void load() throws IOException{
        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("Archivos/fruteria.dat"))))
        {

            double precio;
            String productos;
            int stock;

            while (true){
                productos = dis.readUTF();
                precio = dis.readDouble();
                stock=dis.readInt();
                System.out.println("Producto "+productos+" precio: "+precio+" stock: "+stock);
            }

        }catch (EOFException e){

        }
    }



}
