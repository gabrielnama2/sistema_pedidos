package com.mycompany.sistemapedidos.model;

public class Produto {
    private String nome;
    private String categoria;
    private double valorUnitario;
    
    //CONSTRUTOR
    public Produto(String nome, Categoria categoria, double valorUnitario) {
        this.nome = nome;
        this.categoria = categoria.getNome();
        this.valorUnitario = valorUnitario;
    }
    
    //GETS E SETS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
}
