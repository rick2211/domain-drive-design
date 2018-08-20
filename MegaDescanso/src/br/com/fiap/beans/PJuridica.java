package br.com.fiap.beans;

public class PJuridica extends Pessoa{
	private String razaoSocial;
	private String cnpj;
	private int qtdFuncionarios;
	
	
	public String getAll() {
		return super.getAll() + "\n" + 
				"Razao Social: " + razaoSocial + "\n" + 
				"CNPJ: " + cnpj + "\n" + 
				"Quantidade de Funcionarios: " + qtdFuncionarios;
	}
	public PJuridica() {
		super();
	}
	public PJuridica(String nome, Endereco endereco, int telefone, String email, String razaoSocial, String cnpj,
			int qtdFuncionarios) {
		super(nome, endereco, telefone, email);
		setRazaoSocial(razaoSocial);
		setCnpj(cnpj);
		setQtdFuncionarios(qtdFuncionarios);
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial.toUpperCase();
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj.toUpperCase();
	}
	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}
	public void setQtdFuncionarios(int qtdFuncionarios) {
		if (qtdFuncionarios<0) {
		this.qtdFuncionarios = 0;
		} else {
			this.qtdFuncionarios=qtdFuncionarios;
		}
	}
		
	

}
