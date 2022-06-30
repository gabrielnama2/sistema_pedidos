package com.mycompany.sistemapedidos.model;

public class ItemPedido {
    private int qtdProduto;
    private double valorUnitario;
    private double valorTotal;
    private Produto produto;
    
    
    
    //CONSTRUTOR
    public ItemPedido(int qtdProduto, double valorUnitario, double valorTotal, Produto produto) {
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.produto = produto;
    }
    
    //GETS E SETS
    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
