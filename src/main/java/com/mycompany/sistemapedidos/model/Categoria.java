package com.mycompany.sistemapedidos.model;
import com.mycompany.sistemapedidos.model.desconto.DescontoCategoria;

public class Categoria {
    private String nome;
    
    //CONSTRUTOR
    public Categoria(String nome) {
        this.nome = nome;
        DescontoCategoria desconto = new DescontoCategoria();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
