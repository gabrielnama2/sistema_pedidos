package com.mycompany.sistemapedidos.model.imposto;

public class ImpostoICMS {
    private String nome;
    private double porcentagem;
    
    //CONSTRUTOR
    public ImpostoICMS(String nome, double porcentagem) {
        this.nome = nome;
        this.porcentagem = porcentagem;
    }
    
    //GETS
    public String getNome() {
        return nome;
    }
    
    public double getPorcentagem() {
        return porcentagem;
    }
}
