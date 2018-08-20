
package br.com.fiap.teste;

import br.com.fiap.modelo.Cliente;
import br.com.fiap.modelo.ItemPedido;
import br.com.fiap.modelo.Pedido;
import br.com.fiap.modelo.Produto;
import br.com.fiap.view.Magica;

public class TesteItemPedido {
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(Magica.inteiro("Numero Pedido"),
				new Cliente(Magica.texto("Nome"),
						Magica.texto("Email"),
						Magica.texto("Login"),
						Magica.texto("Senha"),
						Magica.inteiro("Estrelas")),
				Magica.decimal("Total"),
				Magica.texto("Forma de Pagamento"),
				new ItemPedido(new Produto(Magica.texto("Descricao"),
						Magica.decimal("Valor"),
						Magica.inteiro("Codigo")),
						Magica.inteiro("Qtde"), 
						Magica.decimal("Valor")));
		
		System.out.println(pedido1.getAll());
	}
}
