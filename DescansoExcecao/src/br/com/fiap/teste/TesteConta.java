package br.com.fiap.teste;

import br.com.fiap.beans.Conta;
import br.com.fiap.excecao.Excecao;
import br.com.fiap.modelo.Magica;

public class TesteConta {
	public static void main (String [] args) {
		Conta c = new Conta();
		
		//existem 2 tipos de excecoes -> unchecked (abaixo) e checked (checa antes de compilar)
		//bloco try serve -> 
		try {
		c.setSaldo(Magica.decimal("Digite o saldo"));
		// catch -> o que voce quer q exiba se ocorrer uma excecao
		// catch vem sempre acompanhado do try
		}catch(Exception e) {
			System.out.println(Excecao.tratar(e));
			//new Excecao().tratarExcecao(e);
			//System.out.println("N�mero Inv�lido");
		//}catch(Exception e){
			//System.out.println("Erro Desconhecido");
		//finally -> o que voce quer q execute se der excecao ou nao 	
		}finally {
			System.out.println("At� logo!!");
		}
	}

}
