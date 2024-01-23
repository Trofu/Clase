package es.ieslavereda;

public class Lista {

    private Nodo head;
    private Nodo tail;
    private int size;

    public Lista() {
        head=null;
        tail=null;
        size=0;
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
            nodo.setSiguiente(tail);
        }
        tail=nodo;
        size++;
    }

    @Override
    public String toString() {
        Nodo nodoAux = head;
        Nodo nodotail = tail;
        String cadena = "Lista con elementos: "+ size()+" ";
        while (nodoAux!=null){
            cadena+=nodoAux+"->";
            nodoAux=nodoAux.getSiguiente();
        }
        while (nodotail!=null){
            cadena+=nodotail+"->";
            nodotail=nodotail.getSiguiente();
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
            return element+"";
        }
    }

}
