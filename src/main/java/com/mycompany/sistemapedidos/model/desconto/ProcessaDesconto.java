package com.mycompany.sistemapedidos.model.desconto;
import com.mycompany.sistemapedidos.model.Pedido;
import com.mycompany.sistemapedidos.model.Produto;

public class ProcessaDesconto {
    private double desconto;
    DescontoNatal descontoNatal = new DescontoNatal("Natal", 0.03);
    DescontoCategoria descontoCategoria = new DescontoCategoria("Papelaria", 0.01);
    DescontoProduto descontoProduto = new DescontoProduto("Lapis", 0.005);
    
    //CONSTRUTOR
    public ProcessaDesconto(Pedido pedido ,Produto produto){
        this.processar(pedido, produto);
    }
    //PROCESSA OS DESCONTOS DO PEDIDO
    public double processar(Pedido pedido ,Produto produto){
        this.desconto = 0;
        if(pedido.getData() == "Natal"){
            this.desconto = this.desconto + descontoNatal.getPorcentagem();
        }
        if(produto.getCategoria() == "Papelaria"){
            this.desconto = this.desconto + descontoCategoria.getPorcentagem();
        }
        if(produto.getNome() == "Lapis"){
            this.desconto = this.desconto + descontoProduto.getPorcentagem();
        }
        return this.desconto * 100;
    }
    
    //GETS
    public double getDesconto() {
        return desconto;
    }
}
