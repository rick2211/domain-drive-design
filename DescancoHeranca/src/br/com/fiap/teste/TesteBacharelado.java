package br.com.fiap.teste;

import br.com.fiap.modelo.Bacharelado;
import br.com.fiap.modelo.Curso;
import br.com.fiap.modelo.Unidade;
import br.com.fiap.view.Magica;

public class TesteBacharelado {

	public static void main(String[] args) {
		Curso curso1 = new Curso (Magica.texto("Descricao :"), 
				Magica.texto("Coordenação :"), 
				new Unidade(Magica.texto("Unidade :"), 
						Magica.texto("Fone :"), 
						Magica.texto("Email")), 
				Magica.texto("Sigla :"), Magica.inteiro("Duração :"), Magica.decimal("Valor :"));
		
		Bacharelado b1 = new Bacharelado();
		b1.setCargaHorariaEstagio(Magica.inteiro("Carga Horaria Estagio"));
		b1.setEstendido(true);
	
		System.out.println(curso1.getAll());
		
		System.out.println(curso1.exibirMensalidade());

	}

}
