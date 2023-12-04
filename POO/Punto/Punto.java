package Punto;

public class Punto {

    //Atributos
    private int x;
    private int y;

    //Constructores
    public Punto(){
        this.x=0;
        this.y=0;
    }
    public Punto(int x){
        this.x=x;
        this.y=0;
    }
    public Punto(int x, int y){
        this(x);
        this.y=y;
    }


    //Getters

    public int getX (){
        return x;
    }

    public int getY() {
        return y;
    }

    //Metodos


    public void subir(int y){
        this.y+=y;
    }
    public void bajar(int y){
        this.y-=y;
    }
    public void derecha(int x){
        this.x+=x;
    }
    public void izquierda(int x){
        this.x-=x;
    }

    public Punto newPuntoUp(int distancia){
        return new Punto(x,y+distancia);
    }
    public Punto newPuntoDown(int distancia){
        return new Punto(x,y-distancia);
    }
    public Punto newPuntoLeft(int distancia){
        return new Punto(x-distancia,y);
    }
    public Punto newPuntoRight(int distancia){
        return new Punto(x+distancia,y);
    }

    public double distancia(Punto p) {
//        d=√(x2−x1)2+(y2−y1)2
        int difx = p.getX() - this.x;
        int dify = p.getY() - this.y;
        return Math.sqrt(Math.pow(difx,2)+Math.pow(dify,2));
    }



    //toString


    @Override
    public String toString() {
        return  " (" + x + "," + y +")";
    }


}
