package ListaGenericaSimple;

public class Main {

    public static void main(String[] args) {

        Model.Persona[] a = new Model.Persona[]{new Model.Persona("123456789","Pepe","Fran",15),new Model.Persona("987654321","Pepe","Fran",15),new Model.Persona("5454545454","Pepe","Fran",15),new Model.Persona("00000001","Pepe","Fran",15)};
        Lista zumba = new Lista<>(a);
        System.out.println(zumba);
        zumba.addHead(new Model.Persona("1597532684","Aray","PorElCulito",2));
        System.out.println(zumba);
        zumba.removeTail();
        System.out.println(zumba);
        System.out.println(zumba.getAsArray(Model.Persona.class).toString());
        zumba.clear();
        System.out.println(zumba);


    }


}
