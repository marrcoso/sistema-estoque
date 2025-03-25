package com.example.State;

import com.example.Produto;

public class DisponivelState implements ProdutoState{
    @Override
    public void verificarEstoque(Produto p){
        System.out.println("Produto " + p.nome() + " disponível");
    }
}
