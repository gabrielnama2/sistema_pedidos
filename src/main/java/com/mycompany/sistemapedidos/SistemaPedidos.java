package com.mycompany.sistemapedidos;
import com.mycompany.sistemapedidos.model.Categoria;
import com.mycompany.sistemapedidos.model.Cliente;
import com.mycompany.sistemapedidos.model.Pedido;
import com.mycompany.sistemapedidos.model.Produto;

public class SistemaPedidos {

    public static void main(String[] args) {
        //CLIENTES
        Cliente gabriel = new Cliente("Gabriel", "MG");
        Cliente rafael = new Cliente("Gabriel", "MG");
        Cliente keyla = new Cliente("Gabriel", "MG");
        
        //CATEGORIAS
        Categoria papelaria = new Categoria("Papelaria");
        
        //PRODUTOS
        Produto papel = new Produto("Papel A4", papelaria, 15.0);
        Produto caneta = new Produto("Caneta", papelaria, 7.0);
        Produto borracha = new Produto("Borracha", papelaria, 2.0);
        Produto lapis = new Produto("Lapis", papelaria, 1.2);
        
        //PEDIDOS
        Pedido pedido01 = new Pedido(0, gabriel, papel, 10, "30/06/2022");
        Pedido pedido02 = new Pedido(1, rafael, caneta, 5, "01/07/2022");
        Pedido pedido03 = new Pedido(2, keyla, borracha, 7, "02/07/2022");
    }
}
