package com.mycompany.sistemapedidos.model.imposto;

public class ImpostoCestaBasica {
    private String nome;
    private double porcentagem;
    
    public ImpostoCestaBasica(String nome, double porcentagem) {
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
