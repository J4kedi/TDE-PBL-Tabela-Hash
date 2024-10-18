package src.models;

public class ListaEncadeada<T> {
    private Node base;
    private Node topo;
    private int tamanho;

    public ListaEncadeada() {
        this.base = null;
        this.topo = null;
        this.tamanho = 0;
    }

    public void add(T valor) {
        Node no = new Node(valor);

        if(base == null) {
            base = no;
            topo = no;
        }

        no.anterior = topo;
        topo.proximo = no;
        
        topo = no;
        tamanho++;
    }

    public void add(T valor, int pos) {
        Node noIndex = getNode(pos);

        Node no = new Node(valor);

        no.proximo = noIndex;
        no.anterior = noIndex.anterior;
        
        noIndex.anterior = no;

        no.anterior.proximo = no;
    }

    public Node getNode(int pos) {
        if (pos > tamanho)
            throw new IllegalArgumentException("Length out of index");
        
        Node no = new Node(null);

        if (tamanho / 2 <= pos) {
            for (int i = 0; i < pos; i++) {
                no = topo.anterior;
            }
        } else {
            for (int i = tamanho - 1; i > pos; i--) {
                no = topo.anterior;
            }
        }

        return no;
    }
    
    public void clear() {
        base = null;
        topo = null;
    }

    public T remove(int pos) {
        Node no = getNode(pos);
        T valor = no.valor;
        no.proximo = null;
        no.anterior = null;
        return valor;
    }
    
    private class Node {
        private Node proximo;
        private T valor;
        private Node anterior; 

        public Node(T valor) {
            this.valor = valor;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
