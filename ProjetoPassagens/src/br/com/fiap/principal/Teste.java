package br.com.fiap.principal;
import br.com.fiap.modelo.Escala;

public class Teste {

	public static void main(String[] args) {
		Escala objeto = new Escala();
		objeto.setDuracao("2/horas");
		objeto.setLocalidade("Osasco");
		System.out.println(objeto.getDuracao());
		System.out.println(objeto.getLocalidade());
		
	}

}