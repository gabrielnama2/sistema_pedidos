package com.mycompany.sistemapedidos.model;

public class Cliente {
    private String nome;
    private String UF;
    
    //CONSTRUTOR
    public Cliente(String nome, String UF) {
        this.nome = nome;
        this.UF = UF;
    }
    
    //GETS
    public String getNome() {
        return nome;
    }
    
    public String getUF() {
        return UF;
    }
}
