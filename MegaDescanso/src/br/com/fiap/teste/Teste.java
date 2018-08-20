package br.com.fiap.teste;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.PFisica;

public abstract class Teste {

	public static void main(String[] args) {
		PFisica p1= new Aluno();
		p1.setCpf("123456789");
		System.out.println(p1.qtdCpf());

	}

}
