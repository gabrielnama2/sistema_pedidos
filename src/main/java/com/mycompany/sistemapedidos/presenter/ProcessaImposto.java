package com.mycompany.sistemapedidos.presenter;
import com.mycompany.sistemapedidos.model.Pedido;
import com.mycompany.sistemapedidos.model.Produto;
import com.mycompany.sistemapedidos.model.imposto.ImpostoCestaBasica;
import com.mycompany.sistemapedidos.model.imposto.ImpostoICMS;
import com.mycompany.sistemapedidos.model.imposto.ImpostoISS;

public class ProcessaImposto {
    private double imposto;
    ImpostoCestaBasica impostoCestaBasica = new ImpostoCestaBasica("Cesta Basica", 0.00);
    ImpostoISS impostoISS = new ImpostoISS("ISS", 0.02);
    ImpostoICMS impostoICMS = new ImpostoICMS("ICMS", 0.07);
    
    //CONSTRUTOR
    public ProcessaImposto(Pedido pedido, Produto produto){
        this.processar(pedido, produto);
    }
    //PROCESSA OS DESCONTOS DO PEDIDO
    public double processar(Pedido pedido, Produto produto){
        this.imposto = 0;
        if(produto.getCategoria() == "Cesta Basica"){
            this.imposto = this.imposto + impostoCestaBasica.getPorcentagem();
        }
        else{
            this.imposto = this.imposto + impostoISS.getPorcentagem() + impostoICMS.getPorcentagem();
        }
        return this.imposto * 100;
    }
    
    //GETS
    public double getDesconto() {
        return imposto;
    }
}
