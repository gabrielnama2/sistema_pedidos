package com.mycompany.sistemapedidos;
import com.mycompany.sistemapedidos.model.Categoria;
import com.mycompany.sistemapedidos.model.Cliente;
import com.mycompany.sistemapedidos.model.Pedido;
import com.mycompany.sistemapedidos.model.Produto;

public class SistemaPedidos {

    public static void main(String[] args) {
        //CLIENTES
        Cliente gabriel = new Cliente("Gabriel", "MG");
        Cliente rafael = new Cliente("Rafael", "ES");
        Cliente keila = new Cliente("Keila", "ES");
        
        //CATEGORIAS
        Categoria papelaria = new Categoria("Papelaria");
        Categoria cestaBasica = new Categoria("Cesta Basica");
        
        //PRODUTOS
        Produto papel = new Produto("Papel A4", papelaria, 15.0, 100);
        Produto caneta = new Produto("Caneta", papelaria, 7.0, 100);
        Produto borracha = new Produto("Borracha", papelaria, 2.0, 100);
        Produto lapis = new Produto("Lapis", papelaria, 1.2, 100);
        Produto kitEscolar = new Produto("Kit Escolar", cestaBasica, 2.0, 100);
        
        //PEDIDOS
        Pedido pedido01 = new Pedido(0, gabriel, lapis, 10, "Natal");
        Pedido pedido02 = new Pedido(1, rafael, caneta, 5, "01/07/2022");
        Pedido pedido03 = new Pedido(2, keila, kitEscolar, 7, "02/07/2022");
    }
}
