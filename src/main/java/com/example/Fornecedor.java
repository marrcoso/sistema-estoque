package com.example;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor implements Observavel{
    private String nome;
    private List<Observer> produtos = new ArrayList<>();

    public Fornecedor(String nome) {
        this.nome = nome;
    }

    public void registrar(Produto p) {
        produtos.add(p);
    }

    public int adicionarQuantidade(Produto p, int quantidade) {
        return p.quantidade() + quantidade;
    }

}
