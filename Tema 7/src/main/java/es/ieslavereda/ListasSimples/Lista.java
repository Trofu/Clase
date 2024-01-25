package es.ieslavereda.ListasSimples;

public class Lista {

    private Nodo head;
    private Nodo tail;
    private int size;

    public Lista() {
        head=null;
        tail=null;
        size=0;
    }

    public Lista(int[] elemts){
        this();
        addAll(elemts);
    }

    public int size(){return size;}
    public void addHead(int elem){
        Nodo nodo = new Nodo(elem);
        if (size==0){
            tail=nodo;
        }else {
            nodo.setSiguiente(head);
        }
        head=nodo;
        size++;
    }
    public void addTail(int elem){
        Nodo nodo = new Nodo(elem);
        if (size==0){
            head=nodo;
        }else {
            tail.setSiguiente(nodo);
        }
        tail=nodo;
        size++;
    }
    public Integer removeHead(){
        if (head==null){
            return null;
        }
        int aux = head.getElement();
        head=head.siguiente;
        if (head==null)tail=null;
        size--;
        return aux;
    }
    public Integer removeTail(){
        if (tail==null || head==null || size==0){
            return null;
        }
        if (size==1||head==tail)removeHead();
        int aux = tail.getElement();
        Nodo buc = head;
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
    public boolean contains(int num){
        Nodo aux = head;
        for (int i = 0; i < size; i++) {
            if (aux.getElement()==num){
                return true;
            }
            aux=aux.getSiguiente();
        }
        return false;
    }
    public Integer get(int num){
        if(num<0||num>=size)return null;
        Nodo aux = head;
        for (int i = 0; i < num ; i++) {
            aux=aux.getSiguiente();
        }
        return aux.getElement();
    }

    public Integer remove (int num){
        if(num<0||num>=size)return null;
        if (num==0)return removeHead();
        if (num==size-1)return removeTail();
        Nodo aux = head;
        for (int i = 0; i < num-1 ; i++) {
            aux=aux.getSiguiente();
        }
        int elm = aux.getSiguiente().getElement();
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        aux=null;
        size--;
        return elm;
    }
    public void addAll(int[] num){
        for (int a:num){
            addTail(a);
        }
    }
    public int[] getAsArray(){
        int[] a = new int[size];
        Nodo buc = head;
        for (int i = 0; i < size; i++) {
            a[i]=buc.getElement();
            buc=buc.getSiguiente();
        }
        return a;
    }
    @Override
    public String toString() {
        Nodo nodoAux = head;
        String cadena = "Lista con elementos: "+ size()+" \n";
        while (nodoAux!=null){
            cadena+=nodoAux+" → ";
            nodoAux=nodoAux.getSiguiente();
        }
        return cadena;
    }

    private class Nodo{
        private int element;
        private Nodo siguiente;
        public Nodo(int element) {
            this.element = element;
            siguiente=null;
        }
        public int getElement() {
            return element;
        }
        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        @Override
        public String toString() {
            return "("+element+")";
        }
    }

}
