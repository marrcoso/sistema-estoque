package com.example.State;

import com.example.Produto;

public class BaixoEstoqueState implements ProdutoState{
    @Override
    public void verificarEstoque(Produto p){
        System.out.println("Produto " + p.nome() + " está em baixo estoque.");
    }
}
