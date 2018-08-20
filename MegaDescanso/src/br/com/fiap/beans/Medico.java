package br.com.fiap.beans;

public class Medico extends Funcionario{
	
	private long codigo;
	private int crm;
	
	public String getAll() {
		return super.getAll() + "\n"+
				"Codigo: " + codigo + "\n" + 
				"CRM:" + crm;
				
	}
	public Medico() {
		super();
	}
	public Medico(String nome, Endereco endereco, int telefone, String email, String rg, String cpf,
			String dataNascimento, char sexo, String cargo, double salario, int cargaHorariaSemanal, long codigo,
			int crm) {
		super(nome, endereco, telefone, email, rg, cpf, dataNascimento, sexo, cargo, salario, cargaHorariaSemanal);
		setCodigo(codigo);;
		setCrm(crm);
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	
	
	

}
