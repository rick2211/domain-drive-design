package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.modelo.Bacharelado;
import br.com.fiap.modelo.Curso;
import br.com.fiap.modelo.Medio;
import br.com.fiap.modelo.Tecnologo;
import br.com.fiap.modelo.Unidade;
import br.com.fiap.view.Magica;

public class Teste {

	public static void main(String[] args) {
		char opcao =JOptionPane.showInputDialog("Selecione: \n" +
					"<B> - Bacharelado \n" +
					"<T> - Tecnologo\n" +
					"<M> - Medio").toUpperCase().charAt(0);
		Curso curso=null;
		
		if (opcao=='B') {
			curso = new Bacharelado(Magica.texto("Descricao:"), Magica.texto("Coordenacao:"), new Unidade(Magica.texto("Nome:"), Magica.texto("Fone:"), Magica.texto("Email:")), Magica.texto("Sigla:"), Magica.inteiro("Duraçao"), Magica.decimal("Valor"),
					Magica.inteiro("Carga Horaria"), Magica.logico("Extendido?"), Magica.texto("Projeto Conclusao:"));
			
			
		} else if (opcao=='T') {
			curso = new Tecnologo(Magica.texto("Descricao:"), Magica.texto("Coordenacao:"), new Unidade(Magica.texto("Nome:"), Magica.texto("Fone:"), Magica.texto("Email:")), Magica.texto("Sigla:"), Magica.inteiro("Duraçao"), Magica.decimal("Valor"),
					 Magica.logico("Extendido?"), Magica.texto("AM"));
			
			}else if (opcao=='M') {
				curso = new Medio(Magica.texto("Descricao:"), Magica.texto("Coordenacao:"), new Unidade(Magica.texto("Nome:"), Magica.texto("Fone:"), Magica.texto("Email:")), Magica.texto("Sigla:"), Magica.inteiro("Duraçao"), Magica.decimal("Valor"),
						Magica.texto("Tipo:"), Magica.texto("Orientador: "));
			}else {
				System.out.println("Opcao Invalida");
			}
		System.out.println(curso.getAll());
		
		
	}

}
