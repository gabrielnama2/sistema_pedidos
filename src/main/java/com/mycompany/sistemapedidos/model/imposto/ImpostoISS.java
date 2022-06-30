package com.mycompany.sistemapedidos.model.imposto;

public class ImpostoISS {
    private String nome;
    private double porcentagem;
    
    public ImpostoISS(String nome, double porcentagem) {
        this.nome = nome;
        this.porcentagem = porcentagem;
    }
    
    //GETS E SETS
    public String getNome() {
        return nome;
    }
    
    public double getPorcentagem() {
        return porcentagem;
    }
}
