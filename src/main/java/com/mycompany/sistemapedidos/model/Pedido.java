package com.mycompany.sistemapedidos.model;
import com.mycompany.sistemapedidos.presenter.ProcessaPedido;

public class Pedido {
    private int id;
    private int qtd;
    private String data;
    
    //CONSTRUTOR
    public Pedido(int id, Cliente cliente, Produto produto, int qtd, String data) {
        this.id = id+1;
        this.qtd = qtd;
        produto.retiraEstoque(qtd);
        this.data = data;
        this.processar(cliente, produto, qtd);
    }
    
    public void processar(Cliente cliente, Produto produto, int qtd){
        ProcessaPedido processa = new ProcessaPedido(this, cliente, produto);
    }
    
    //GETS
    public int getId() {
        return id;
    }


    public int getQtd() {
        return qtd;
    }

    public String getData() {
        return data;
    }
    
}
