package com.mycompany.sistemapedidos.model.desconto;

public class DescontoCategoria extends Desconto{
    private String nome;
    private double porcentagem;
    
    //CONSTRUTOR
    public DescontoCategoria(String nome, double porcentagem) {
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
