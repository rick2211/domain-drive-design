package br.com.fiap.principal;  
import br.com.fiap.modelo.Fabricante;
import br.com.fiap.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto(2222,"TV",200, new Fabricante("Sony", "43353774"));
		
		System.out.println(produto.getAll());
		
		//Utilizando o setAll()
		Fabricante fabricante = new Fabricante();
		fabricante.setAll("123324", "Chaves SA");
		Produto p2 = new Produto();
		p2.setAll(2, "mouse", 45, fabricante);
		System.out.println(p2.getAll());
		
		System.out.println(p2.aumentar(50));
		System.out.println(p2.getValor());
		
		System.out.println(produto.getDesconto());
		
		
		
	}

}
