package br.com.fiap.testes;

import br.com.fiap.beans.Pedido;

public class TestePedido {
	public static void main(String[] args) {
		Pedido pedido1=new Pedido(89098, 650, "22/11/2018");
		System.out.println(pedido1.getAll());

	}

}
