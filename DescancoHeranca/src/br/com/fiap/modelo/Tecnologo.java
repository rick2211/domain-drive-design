package br.com.fiap.modelo;

public class Tecnologo extends Curso{
	private boolean estendido;
	private String am;
	
	public double exibirMensalidade() {

		if (estendido == true) {
			return getValor() / (getDuracao()+12);
		} return getValor() / getDuracao();
	}
	
	public String getAll() {
		return super.getAll() + "\n" +
				"Curso Estendido :" + estendido +"\n" +
				"Am : " + am;
	}
	public void setAll(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor,
			boolean estendido, String am) {
		super.setAll(descricao, coordenacao, unidade, sigla, duracao, valor);
		isEstendido(estendido);
		setAm(am);
	}
	public Tecnologo() {
		super();
	}
	public Tecnologo(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor,
			boolean estendido, String am) {
		super.setAll(descricao, coordenacao, unidade, sigla, duracao, valor);
		isEstendido(estendido);
		setAm(am);
	}
	public boolean getEstendido() {
		return estendido;
	}
	public void isEstendido(boolean estendido) {
		this.estendido = estendido;
	}
	public String getAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am.toUpperCase();
	}
	
	

}
