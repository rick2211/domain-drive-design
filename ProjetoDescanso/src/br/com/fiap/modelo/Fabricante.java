package br.com.fiap.modelo;

public class Fabricante {
	private String cnpj;
	private String razaoSocial;
	
	public String getAll() {
		return  "CNPJ..........: " + "\n" + cnpj + "\n"+
				"Razao Social..: " + "\n" + razaoSocial;
		
	}
	
	public void setAll (String cnpj, String razaoSocial) {
		this.cnpj=cnpj;
		this.razaoSocial=razaoSocial;
	}
	public Fabricante() {}
	public Fabricante (String cnpj, String razaoSocial) {
		this.cnpj=cnpj;
		this.razaoSocial=razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	

}
