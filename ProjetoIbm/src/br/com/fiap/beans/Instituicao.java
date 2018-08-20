package br.com.fiap.beans;

public class Instituicao extends Usuario {
	
	private String cnpj;
	private String ie;
	private String razaoSocial;
	
	public String getAll() {
		return super.getALL() + "\n" +
				"CNPJ: " + cnpj + "\n" +
				"Inscrição Estadual: " + ie + "\n" + 
				"Razão Social: " + razaoSocial;
	}
	
	public void SetAll(int codUsuario, String nomeUsuario, String email, String fone, String senha, String endereco, String cnpj,
			String ie, String razaoSocial) {
		super.setAll(codUsuario, nomeUsuario, email, fone, senha, endereco);
		setCnpj(cnpj);
		setIe(ie);
		setRazaoSocial(razaoSocial);
	}
	public Instituicao() {
		super();
	}
	public Instituicao(int codUsuario, String nomeUsuario, String email, String fone, String senha, String endereco, String cnpj,
			String ie, String razaoSocial) {
		super(codUsuario, nomeUsuario, email, fone, senha, endereco);
		setCnpj(cnpj);
		setIe(ie);
		setRazaoSocial(razaoSocial);
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
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		if (razaoSocial.length() > 20) {
			razaoSocial = razaoSocial.substring(0, 20);
		}this.razaoSocial = razaoSocial.toUpperCase();
	
		
	}
	
	
	
	

}
