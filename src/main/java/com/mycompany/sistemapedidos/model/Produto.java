package com.mycompany.sistemapedidos.model;

public class Produto {
    private String nome;
    private String categoria;
    private double valorUnitario;
    private int estoque;
    
    //CONSTRUTOR
    public Produto(String nome, Categoria categoria, double valorUnitario, int estoque) {
        this.nome = nome;
        this.categoria = categoria.getNome();
        this.valorUnitario = valorUnitario;
        this.estoque = estoque;
    }
    
    //RETIRA OS PRODUTOS DO ESTOQUE
    public void retiraEstoque(int qtd){
        this.estoque = this.estoque - qtd;
    }
    
    //GETS
    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public double getValorUnitario() {
        return valorUnitario;
    }
    
    public int getEstoque() {
        return estoque;
    }
}
