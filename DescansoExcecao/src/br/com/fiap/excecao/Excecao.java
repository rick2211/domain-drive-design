package br.com.fiap.excecao;

public class Excecao extends Exception{
	public static String tratar(Exception e) {
		//pe�o a classe, o nome 
		//toda vez que vc olhar uma classe e nao tiver atributos, apenas metodos -> se cria como static(estatico)
		if (e.getClass().getName().equals("java.lang.NumberFormatException")) {
			
		return"N�mero Inv�lido";
		}else {
			return"Erro desconhecido";// NUNCA usar system.out
		}
	}
	

}

