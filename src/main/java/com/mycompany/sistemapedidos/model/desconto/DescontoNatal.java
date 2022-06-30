package com.mycompany.sistemapedidos.model.desconto;

public class DescontoNatal extends Desconto{
    private String nome;
    private double porcentagem;
    
    public DescontoNatal(String nome, double porcentagem) {
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
