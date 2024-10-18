package src.models;

public abstract class TabelaHash {
    private int[] data; 
    private int capacidade;
    private int tamanho;

    public TabelaHash(int tamanho) {
        this.data = new int[tamanho];
        this.tamanho = tamanho;
        this.capacidade = (int) Math.round(tamanho * 0.70);
    }

    public void inserir(int valor) {
        data[valor % tamanho] = valor;
    }

    public int buscar(int valor) {
        if(!(data[valor % tamanho] > - 1)) 
            throw new IllegalArgumentException("Valor não encontrado!");
        return valor;
    }

    public int remover(int valor) {
        data[valor % tamanho] = 0;
        return valor;
    }
}