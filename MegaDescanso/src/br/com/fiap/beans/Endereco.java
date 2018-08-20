package br.com.fiap.beans;

public class Endereco {
	private String logradoro;
	private String descricaoEndereco;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;

	public String getAll() {
		return   logradoro+ " " + descricaoEndereco + " "+ numero+" " + complemento + " "+ bairro + " " + cep + " " + cidade  + " " + estado ;
	}
	public Endereco() {
		super();
	}
	public Endereco(String logradoro, String descricaoEndereco, int numero, String complemento, String bairro,
			String cep, String cidade, String estado) {
		super();
		setLogradoro(logradoro);
		setDescricaoEndereco(descricaoEndereco);
		setNumero(numero);
		setComplemento(complemento);
		setBairro(bairro);
		setCep(cep);
		setCidade(cidade);
		setEstado(estado);;
	}
	public String getLogradoro() {
		return logradoro;
	}
	public void setLogradoro(String logradoro) {
		this.logradoro = logradoro.toUpperCase();
	}
	public String getDescricaoEndereco() {
		return descricaoEndereco;
	}
	public void setDescricaoEndereco(String descricaoEndereco) {
		this.descricaoEndereco = descricaoEndereco.toUpperCase();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento.toUpperCase();
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro.toUpperCase();
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep.toUpperCase();
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade.toUpperCase();
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado.toUpperCase();
	}



}
