package br.com.fiap.modelo;

public class PessoaJuridica extends Cliente{
	private String razaoSocial;
	private String cnpj;
	private String ie;
	private String im;
	
	public String getAll() {
		return super.getAll()+ "\n" + razaoSocial + "\n" + cnpj+"\n" + ie+ "\n" + im;
		
	}
	
	public void setAll(String nome, String email, String login, String senha, int qtdEstrelas, String razaoSocial,
			String cnpj, String ie, String im) {
		super.setAll(nome, email, login, senha, qtdEstrelas);
		setRazaoSocial(razaoSocial);
		setCnpj(cnpj);
		setIe(ie);
		setIm(im);
	}
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, String email, String login, String senha, int qtdEstrelas, String razaoSocial,
			String cnpj, String ie, String im) {
		super(nome, email, login, senha, qtdEstrelas);
		setRazaoSocial(razaoSocial);
		setCnpj(cnpj);
		setIe(ie);
		setIm(im);
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getIm() {
		return im;
	}
	public void setIm(String im) {
		this.im = im;
	}
	
}
