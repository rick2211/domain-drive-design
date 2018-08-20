package br.com.fiap.beans;

public class Intercambio {
	private int codIntercambio;
	private Usuario usuario;
	private String requisitoInter;
	private String dataAberturaInter;
	private String dataFechamentoInter;
	private double valor;
	private String destino;
	private String saida;
	private String duracao; 
	
	public String getAll() {
		
		return "Codigo do Intercâmbio: " + codIntercambio + "\n" +
				"Usuario: " + usuario.getCodUsuario() + "\n" + 
				"Requisito do Intercâmbio: " + requisitoInter + "\n" +
				"Data de Abertura do Intercâmbio" + dataAberturaInter + "\n" + 
				"Data de Fechamento do Intercâmbio: " + dataFechamentoInter + "\n" +
				"Valor do Intercâmbio: " + valor + "\n" +
				"Destino: " + destino + "\n" +
				"Saida: " + saida + "\n" +
				"Duração: " + duracao;
	}
	
	public void setAll(int codIntercambio, Usuario usuario, String requisitoInter, String dataAberturaInter, String dataFechamentoInter,
			double valor, String destino, String saida, String duracao) {
		setCodIntercambio(codIntercambio);
		setUsuario(usuario);
		setRequisitoInter(requisitoInter);
		setDataAberturaInter(dataAberturaInter);
		setDataFechamentoInter(dataFechamentoInter);
		setValor(valor);
		setDestino(destino);
		setSaida(saida);
		setDuracao(duracao);
	}
	public Intercambio() {
		super();
	}
	public Intercambio(int codIntercambio, Usuario usuario, String requisitoInter, String dataAberturaInter, String dataFechamentoInter,
			double valor, String destino, String saida, String duracao) {
		super();
		setCodIntercambio(codIntercambio);
		setUsuario(usuario);
		setRequisitoInter(requisitoInter);
		setDataAberturaInter(dataAberturaInter);
		setDataFechamentoInter(dataFechamentoInter);
		setValor(valor);
		setDestino(destino);
		setSaida(saida);
		setDuracao(duracao);
	}
	
	public int getCodIntercambio() {
		return codIntercambio;
	}

	public void setCodIntercambio(int codIntercambio) {
		this.codIntercambio = codIntercambio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getRequisitoInter() {
		return requisitoInter;
	}
	public void setRequisitoInter(String requisitoInter) {
		this.requisitoInter = requisitoInter;
	}
	public String getDataAberturaInter() {
		return dataAberturaInter;
	}
	public void setDataAberturaInter(String dataAberturaInter) {
		this.dataAberturaInter = dataAberturaInter;
	}
	public String getDataFechamentoInter() {
		return dataFechamentoInter;
	}
	public void setDataFechamentoInter(String dataFechamentoInter) {
		this.dataFechamentoInter = dataFechamentoInter;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getSaida() {
		return saida;
	}
	public void setSaida(String saida) {
		this.saida = saida;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	
	

}
