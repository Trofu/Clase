package ListaGenericaSimple;

public interface ILista<E> {

    int INITIAL_SIZE=0;
    void addHead(E element);
    E removeHead();
    int size();


}
