package com.mycompany.sistemapedidos.model;

public class Cliente {
    private String nome;
    private String UF;
    
    //CONSTRUTOR
    public Cliente(String nome, String UF) {
        this.nome = nome;
        this.UF = UF;
    }
    
    //GETS E SETS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    
    
}
