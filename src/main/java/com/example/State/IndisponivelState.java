package com.example.State;

import com.example.Produto;

public class IndisponivelState implements ProdutoState{
    @Override
    public void verificarEstoque(Produto p){
        System.out.println("Produto " + p.nome() + " está indisponível");
    }
}
