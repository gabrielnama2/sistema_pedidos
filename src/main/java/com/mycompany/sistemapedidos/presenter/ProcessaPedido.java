package com.mycompany.sistemapedidos.presenter;
import com.mycompany.sistemapedidos.model.Cliente;
import com.mycompany.sistemapedidos.model.Pedido;
import com.mycompany.sistemapedidos.model.Produto;
import com.mycompany.sistemapedidos.model.desconto.ProcessaDesconto;
import com.mycompany.sistemapedidos.model.imposto.ProcessaImposto;

public class ProcessaPedido {
    private double desconto;
    private double imposto;
    private double valorTarifas;
    private double valorTotal;
    private double valorPagar;
    
    //CALCULA OS DESCONTOS DO PEDIDO
    public void processarDesconto(Pedido pedido, Produto produto){
        ProcessaDesconto processaDesconto = new ProcessaDesconto(pedido, produto);
        this.desconto = processaDesconto.processar(pedido, produto);
    }
    
    //CALCULA OS IMPOSTOS DO PEDIDO
    public void processarImposto(Pedido pedido, Produto produto){
        ProcessaImposto processaImposto = new ProcessaImposto(pedido, produto);
        this.imposto = processaImposto.processar(pedido, produto);
    }
    
    //CALCULA O VALOR TOTAL E A PAGAR DO PEDIDO
    public void processarValorTotal(Pedido pedido, Produto produto){      
        this.valorTotal = pedido.getQtd() * produto.getValorUnitario();
        this.valorPagar = this.valorTotal - (1 - this.desconto/100);
        this.valorPagar = this.valorPagar + (1 - this.imposto/100);
    }
    
    //CONSTRUTOR    
    public ProcessaPedido(Pedido pedido, Cliente cliente, Produto produto){
        this.processarDesconto(pedido, produto);
        this.processarImposto(pedido, produto);
        this.processarValorTotal(pedido, produto);
        this.imprimePedido(pedido, cliente, produto);
    }
    
    //IMPRIME NO CONSOLE
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
                "\nDescontos: " + this.desconto + "%" +
                "\nImpostos: " + this.imposto + "%" +
                "\nValor a pagar: " + this.valorPagar +
                "\n-------------------//");
    }
}
