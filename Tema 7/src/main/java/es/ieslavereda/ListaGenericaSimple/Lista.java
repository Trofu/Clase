package es.ieslavereda.ListaGenericaSimple;

import java.lang.reflect.Array;

public class Lista<E> {

    private Nodo<E> head;
    private Nodo<E> tail;
    private int size;

    public Lista() {
        head=null;
        tail=null;
        size=0;
    }

    public Lista(E[] elemts){
        this();
        addAll(elemts);
    }

    public int size(){return size;}
    public void addHead(E elem){
        Nodo<E> nodo = new Nodo<>(elem);
        if (size==0){
            tail=nodo;
        }else {
            nodo.setSiguiente(head);
        }
        head=nodo;
        size++;
    }
    public void addTail(E elem){
        Nodo<E> nodo = new Nodo<>(elem);
        if (size==0){
            head=nodo;
        }else {
            tail.setSiguiente(nodo);
        }
        tail=nodo;
        size++;
    }
    public E removeHead(){
        if (head==null){
            return null;
        }
        E aux = head.getElement();
        head=head.siguiente;
        if (head==null)tail=null;
        size--;
        return aux;
    }
    public E removeTail(){
        if (tail==null || head==null || size==0){
            return null;
        }
        if (size==1||head==tail)removeHead();
        E aux = tail.getElement();
        Nodo<E> buc = head;
        do{
            buc=buc.getSiguiente();
        }while (buc.getSiguiente()!=tail);
        buc.setSiguiente(null);
        tail=buc;
        size--;
        return aux;
    }
    public void clear(){
        head=null;
        tail=null;
        size=0;
    }
    public boolean contains(E num){
        Nodo<E> aux = head;
        for (int i = 0; i < size; i++) {
            if (aux.getElement()==num){
                return true;
            }
            aux=aux.getSiguiente();
        }
        return false;
    }
    public E get(int num){
        if(num<0||num>=size)return null;
        Nodo<E> aux = head;
        for (int i = 0; i < num ; i++) {
            aux=aux.getSiguiente();
        }
        return aux.getElement();
    }

    public E remove (int num){
        if(num<0||num>=size)return null;
        if (num==0)return removeHead();
        if (num==size-1)return removeTail();
        Nodo<E> aux = head;
        for (int i = 0; i < num-1 ; i++) {
            aux=aux.getSiguiente();
        }
        E elm = aux.getSiguiente().getElement();
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        aux=null;
        size--;
        return elm;
    }
    public void addAll(E[] num){
        for (E a:num){
            addTail(a);
        }
    }
    public E[] getAsArray(Class clazz){
        E[] a = (E[]) Array.newInstance(clazz,size);
        Nodo<E> buc = head;
        for (int i = 0; i < size; i++) {
            a[i]=buc.getElement();
            buc=buc.getSiguiente();
        }
        return a;
    }
    @Override
    public String toString() {
        Nodo<E> nodoAux = head;
        String cadena = "Lista con elementos: "+ size()+" \n";
        while (nodoAux!=null){
            cadena+=nodoAux+" → ";
            nodoAux=nodoAux.getSiguiente();
        }
        return cadena;
    }

    private class Nodo<E>{
        private E element;
        private Nodo<E> siguiente;
        public Nodo(E element) {
            this.element = element;
            siguiente=null;
        }
        public E getElement() {
            return element;
        }
        public Nodo<E> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo<E> siguiente) {
            this.siguiente = siguiente;
        }

        @Override
        public String toString() {
            return "("+element+")";
        }
    }

}
