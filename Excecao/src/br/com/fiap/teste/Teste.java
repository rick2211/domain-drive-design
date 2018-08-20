package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.excecao.Excecao;

public class Teste {

	public static void main(String[] args) {
		try {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		
		} catch (Exception e) {
			//e.printStackTrace();
			
			
			System.out.println(Excecao.tratarExcecao(e));
		} finally {
			System.out.println("Até logo.....");
		}
	}

}
