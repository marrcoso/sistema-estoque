package com.example;

public class Produto {
    private String nome;
    private int valor;
    private int quantidade;
    ProdutoState produtoState;

    public Produto(String nome, int valor){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = 0;
    }

    public String nome(){
        return this.nome;
    }

    public int quantidade() {
        return this.quantidade;
    }
}