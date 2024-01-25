package es.ieslavereda.ListasDE;

public class Lista {

    private Nodo head;
    private Nodo tail;
    private int size;

    public Lista() {
        head=null;
        tail=null;
        size=0;
    }

    public Lista(String[] elemts){
        this();
        addAll(elemts);
    }

    public int size(){return size;}
    public void addHead(String elem){
        Nodo nodo = new Nodo(elem);
        if (size==0){
            tail=nodo;
        }else {
            nodo.setSiguiente(head);
            head.setAnterior(nodo);
        }
        head=nodo;
        size++;
    }
    public void addTail(String elem){
        Nodo nodo = new Nodo(elem);
        if (size==0){
            head=nodo;
        }else {
            nodo.setAnterior(tail);
            tail.setSiguiente(nodo);
        }
        tail=nodo;
        size++;
    }
    public String removeHead(){
        if (head==null){
            return null;
        }
        String aux = head.getElement();
        head=head.siguiente;
        if (head==null)
            tail=null;
        else
            head.setAnterior(null);
        size--;
        return aux;
    }
    public String removeTail(){
        if (tail==null || head==null || size==0){
            return null;
        }
        if (size==1||head==tail)removeHead();
        String aux = tail.getElement();
        tail=tail.anterior;
        tail.setSiguiente(null);
        size--;
        return aux;
    }
    public void clear(){
        head=null;
        tail=null;
        size=0;
    }
    public boolean contains(String num){
        Nodo aux = head;
        for (int i = 0; i < size; i++) {
            if (aux.getElement().equals(num)){
                return true;
            }
            aux=aux.getSiguiente();
        }
        return false;
    }
    public String get(int num){
        if(num<0||num>=size)return null;
        Nodo aux = head;
        for (int i = 0; i < num ; i++) {
            aux=aux.getSiguiente();
        }
        return aux.getElement();
    }

    public String remove (int num){
        if(num<0||num>=size)return null;
        if (num==0)return removeHead();
        if (num==size-1)return removeTail();
        Nodo aux = head;
        for (int i = 0; i < num-1 ; i++) {
            aux=aux.getSiguiente();
        }
        String elm = aux.getSiguiente().getElement();
        Nodo aux2=aux.getSiguiente().getSiguiente();
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        aux2.setAnterior(aux);
        aux=null;
        size--;
        return elm;
    }
    public void addAll(String[] num){
        for (String a:num){
            addTail(a);
        }
    }
    public String[] getAsArray(){
        String[] a = new String[size];
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
        String cadena = "ListaDE con elementos: "+ size()+" valores\n";
        cadena+= " Elementos: \t\t";
        while (nodoAux!=null){
            cadena+=nodoAux+" → ";
            nodoAux=nodoAux.getSiguiente();
        }
        cadena+="\n Elementos inversa: ";
        nodoAux=tail;
        while (nodoAux!=null){
            cadena+=nodoAux+" ← ";
            nodoAux=nodoAux.getAnterior();
        }
        return cadena;
    }

    private class Nodo{
        private String element;
        private Nodo siguiente;
        private Nodo anterior;
        public Nodo(String element) {
            this.element = element;
            siguiente=null;
            anterior=null;
        }
        public String getElement() {
            return element;
        }
        public Nodo getSiguiente() {
            return siguiente;
        }
        public Nodo getAnterior() {
            return anterior;
        }
        public void setAnterior(Nodo anterior) {
            this.anterior = anterior;
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
