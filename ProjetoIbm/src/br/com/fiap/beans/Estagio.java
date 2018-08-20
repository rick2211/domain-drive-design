package br.com.fiap.beans;

public class Estagio {
	private int codEstagio;
	private Usuario usuario;
	private String requisitoEstagio;
	private String descricaoEstagio;
	private double salario;
	private String dataAberturaEstagio;
	private String dataFechamentoEstagio;
	
	public String getAll() {
		return "Usuário: " + usuario.getCodUsuario()+ "\n" + 
				"Requisito do Estágio: " + requisitoEstagio + "\n" + 
				"Descrição do Estagio: " + descricaoEstagio + "\n" + 
				"Sálario: " + salario + "\n" + 
				"Data de Abertura do Estágio: " + dataAberturaEstagio + "\n" +
				"Data de Fechamento do Estágio " + dataFechamentoEstagio;
	}
	public void setAll(int codEstagio, Usuario usuario, String requisitoEstagio, String descricaoEstagio, double salario,
			String dataAberturaEstagio, String dataFechamentoEstagio) {
		
		setCodEstagio(codEstagio);
		setUsuario(usuario);
		setRequisitoEstagio(requisitoEstagio);
		setDescricaoEstagio(descricaoEstagio);
		setSalario(salario);
		setDataAberturaEstagio(dataAberturaEstagio);
		setDataFechamentoEstagio(dataFechamentoEstagio);
	}
	public Estagio() {
		super();
	}
	public Estagio(int codEstagio, Usuario usuario, String requisitoEstagio, String descricaoEstagio, double salario,
			String dataAberturaEstagio, String dataFechamentoEstagio) {
		super();
		setCodEstagio(codEstagio);
		setUsuario(usuario);
		setRequisitoEstagio(requisitoEstagio);
		setDescricaoEstagio(descricaoEstagio);
		setSalario(salario);
		setDataAberturaEstagio(dataAberturaEstagio);
		setDataFechamentoEstagio(dataFechamentoEstagio);
	}
	
	public int getCodEstagio() {
		return codEstagio;
	}
	public void setCodEstagio(int codEstagio) {
		this.codEstagio = codEstagio;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getRequisitoEstagio() {
		return requisitoEstagio;
	}
	public void setRequisitoEstagio(String requisitoEstagio) {
		this.requisitoEstagio = requisitoEstagio;
	}
	public String getDescricaoEstagio() {
		return descricaoEstagio;
	}
	public void setDescricaoEstagio(String descricaoEstagio) {
		this.descricaoEstagio = descricaoEstagio;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDataAberturaEstagio() {
		return dataAberturaEstagio;
	}
	public void setDataAberturaEstagio(String dataAberturaEstagio) {
		this.dataAberturaEstagio = dataAberturaEstagio;
	}
	public String getDataFechamentoEstagio() {
		return dataFechamentoEstagio;
	}
	public void setDataFechamentoEstagio(String dataFechamentoEstagio) {
		this.dataFechamentoEstagio = dataFechamentoEstagio;
	}
	
	

}
