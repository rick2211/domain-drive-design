package br.com.fiap.principal;

import br.com.fiap.modelo.Fabricante;

public class TesteFabricante {
	public static void main (String[] args) {
		
		Fabricante fabricante = new Fabricante("21262672","Sony");
		System.out.println(fabricante.getAll());
		
		System.out.println(fabricante.getCnpj());
		System.out.println(fabricante.getRazaoSocial());
		



	}
}