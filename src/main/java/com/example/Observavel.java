package com.example;

public interface Observavel {
    void registrar(Produto p);

    int adicionarQuantidade(Produto p, int quantidade);
}