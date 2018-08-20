package br.com.fiap.modelo;

public class Medio extends Curso{
	private String tipo;
	private String orientadorPedagogico;

	public String getAll() {
		return super.getAll() + "\n" + 
				"Tipo :" + "\n" +
				"Orientador Pedagógico :" + orientadorPedagogico;

	}

	public void setAll(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor,
			String tipo, String orientadorPedagogico) {
		super.setAll(descricao, coordenacao, unidade, sigla, duracao, valor);
		setTipo(tipo);
		setOrientadorPedagogico(orientadorPedagogico);
	}
	public Medio() {
		super();
	}
	public Medio(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor,
			String tipo, String orientadorPedagogico) {
		super(descricao, coordenacao, unidade, sigla, duracao, valor);
		setTipo(tipo);
		setOrientadorPedagogico(orientadorPedagogico);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if (!tipo.equalsIgnoreCase("tecnico")) {
			this.tipo = tipo.toUpperCase();
					
		}else {
			this.tipo = "REGULAR";
			
		}
	}
	public String getOrientadorPedagogico() {
		return orientadorPedagogico;
	}
	public void setOrientadorPedagogico(String orientadorPedagogico) {
		this.orientadorPedagogico = orientadorPedagogico.toUpperCase();
	}




}
