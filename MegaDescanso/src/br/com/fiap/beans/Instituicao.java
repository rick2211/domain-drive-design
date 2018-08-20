package br.com.fiap.beans;

public class Instituicao extends PJuridica {

	private long codigo;
	private String url;
	private String contato;
	private double desconto;

	public String getAll() {
		return super.getAll() + "\n" + 
				"Codigo: " + codigo + "\n" + 
				"URL: " + url + "\n" +
				"Contato: " + contato + "\n " + 
				"Desconto: " + desconto;
	}
	public Instituicao() {
		super();
	}
	public Instituicao(String nome, Endereco endereco, int telefone, String email, String razaoSocial, String cnpj,
			int qtdFuncionarios, long codigo, String url, String contato, double desconto) {
		super(nome, endereco, telefone, email, razaoSocial, cnpj, qtdFuncionarios);
		setCodigo(codigo);
		setUrl(url);
		setContato(contato);
		setDesconto(desconto);

	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url.toLowerCase();
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato.toUpperCase();
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		if( desconto<0||desconto>30) {
			this.desconto=0;
		}else {
			this.desconto = desconto;
		}
	}






}
