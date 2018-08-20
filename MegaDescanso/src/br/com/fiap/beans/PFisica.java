package br.com.fiap.beans;

public class PFisica extends Pessoa{
	
	private String rg;
	private String cpf;
	private String dataNascimento;
	private char sexo;
	
	public int qtdCpf() {
		return cpf.length();
	}
	public String getAll() {
		return super.getAll() + "\n" +
				"RG : " + rg +"\n" + 
				"CPF : " + cpf +"\n" +
				"Data de Nascimento : " + dataNascimento +"\n" +
				"Sexo : " + sexo;
	}
	public PFisica() {
		super();
	}
	
	public PFisica(String nome, Endereco endereco, int telefone, String email, String rg, String cpf,
			String dataNascimento, char sexo) {
		super(nome, endereco, telefone, email);
		setRg(rg);;
		setCpf(cpf);
		setDataNascimento(dataNascimento);
		setSexo(sexo);
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg.toUpperCase();
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf.toUpperCase();
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento.toUpperCase();
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
	
		if (sexo=='M') {
			this.sexo = 'M';
		} else {
			this.sexo='F';
		}
		
	
		
	}
	
	
	
	

}
