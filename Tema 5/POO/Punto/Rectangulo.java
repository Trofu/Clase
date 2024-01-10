package Punto;

public class Rectangulo {

    private Punto ver1;
    private Punto ver2;
    private Punto ver3;
    private Punto ver4;

    public Rectangulo(Punto ver1,Punto ver3){
        this.ver1=ver1;
        this.ver2= new Punto(ver1.getX(),ver3.getY());
        this.ver3=ver3;
        this.ver4= new Punto(ver3.getX(),ver1.getY());
    }

    public Rectangulo(Punto ver1, int base, int altura){

        this.ver1=ver1;
        this.ver2= ver1.newPuntoUp(altura);
        this.ver3= ver2.newPuntoRight(base);
        this.ver4= ver1.newPuntoRight(base);
    }

    public int getBase(){
        return (int)(ver4.distancia(ver1));
    }

    public int getAltura(){
        return (int)(ver2.distancia(ver1));
    }

    public int perimetro(){
        return (getBase()+getAltura())*2;
    }

    public int area(){
        return getBase()*getAltura();
    }

    public void moveUp(int distancia){

        this.ver1.subir(distancia);
        this.ver2.subir(distancia);
        this.ver3.subir(distancia);
        this.ver4.subir(distancia);

    }


    @Override
    public String toString() {
        return
                "Punto abajo_izquierda ="+ver1+"\nPunto arriba_izquierda ="+ver2+
                "\nPunto arriba_derecha ="+ver3+"\nPunto abajo_derecha ="+ver4;
    }
}
