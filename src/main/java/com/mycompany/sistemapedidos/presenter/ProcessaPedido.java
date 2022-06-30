package com.mycompany.sistemapedidos.presenter;
import com.mycompany.sistemapedidos.model.Cliente;
import com.mycompany.sistemapedidos.model.ItemPedido;
import com.mycompany.sistemapedidos.model.Pedido;
import com.mycompany.sistemapedidos.model.Produto;

public class ProcessaPedido {
    //private ItemPedido item;
    private double valorTotal;
    
    public void processarDesconto(){
        
    }
    
    public void processarImposto(){
        
    }
    
    public void processarValorTotal(Pedido pedido, Produto produto){
        this.valorTotal = pedido.getQtd() * produto.getValorUnitario();
    }
    
    //CONSTRUTOR    
    public ProcessaPedido(Pedido pedido, Cliente cliente, Produto produto){
        this.processarValorTotal(pedido, produto);
        this.imprimePedido(pedido, cliente, produto);
    }
    
    public void imprimePedido(Pedido pedido, Cliente cliente, Produto produto){
        System.out.println("//-------------------\nPEDIDO: \n" +
                "\nNumero: "+ pedido.getId() +
                "\nData e horario: "+ pedido.getData() +
                "\nCliente: " + cliente.getNome() +
                "\nUF: " + cliente.getUF()+
                "\n\nITENS: \n"+
                "\nProduto: " + produto.getNome() +
                "\nQuantidade: " + pedido.getQtd() +
                "\nCategoria: " + produto.getCategoria()+
                "\nValor unitario: " + produto.getValorUnitario() +
                "\nValor total: " + this.valorTotal +
                "\n-------------------//");
    }
}
