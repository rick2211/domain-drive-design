package br.com.fiap.principal;


import br.com.fiap.modelo.Escala;
import br.com.fiap.modelo.Voo;

public class TesteVoo {

	public static void main(String[] args) {
		Voo voo = new Voo();
		voo.setDestino("Rio de Janeiro");
		voo.setDuracao("45 minutos");
		voo.setHorario("10h00");
		//Escala escala =new Escala("Bagulhos","1hora");
		//escala.setDuracao("1hora");
		//escala.setLocalidade("Bagulhos");
		voo.setEscala(new Escala("Bagulhos","1hora"));
		//VOU ERRAR NA PROVA
		//System.out.println(escala.getLocalidade());
		System.out.println(voo.getEscala().getLocalidade());
		System.out.println(voo.getDestino());
		System.out.println(voo.getDuracao());
		//A linha abaixo apresenta a posicao de memoria
		System.out.println(voo.getEscala());
	

	}
		
}
