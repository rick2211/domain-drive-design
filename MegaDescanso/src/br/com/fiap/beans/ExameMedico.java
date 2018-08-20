package br.com.fiap.beans;

public class ExameMedico {
	private long codigo;
	private Aluno aluno;
	private Medico medico;
	private String data;
	private String pressao;
	private int batimento;
	private float altura;
	private float peso;
	private String observacao;
	
	
	public ExameMedico() {
		super();
	}
	public ExameMedico(long codigo, Aluno aluno, Medico medico, String data, String pressao, int batimento,
			float altura, float peso, String observacao) {
		super();
		setCodigo(codigo);
		setAluno(aluno);
		setMedico(medico);
		setData(data);
		setPressao(pressao);
		setBatimento(batimento);
		setAltura(altura);
		setPeso(peso);
		setObservacao(observacao);
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data.toUpperCase();
	}
	public String getPressao() {
		return pressao;
	}
	public void setPressao(String pressao) {
		this.pressao = pressao.toUpperCase();
	}
	public int getBatimento() {
		return batimento;
	}
	public void setBatimento(int batimento) {
		this.batimento = batimento;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao.toUpperCase();
	}
	
	

}
