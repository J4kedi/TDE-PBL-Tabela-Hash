package src.models;

public class TabelaHash {
    private int[] data; 

    public TabelaHash(int size) {
        this.data = new int[size];
    }

    public void inserir(int valor) {
        data[valor % data.length] = valor;
    }

    public int buscar(int valor) {
        if(!(data[valor % data.length] > - 1)) 
            throw new IllegalArgumentException("Valor não encontrado!");
        return valor;
    }

    public int remover(int valor) {
        data[valor % data.length] = 0;
        return valor;
    }
}