package br.com.fiap.modelo;

public class Curso {
	private String nome;
	private String sigla;
	private String titulacao;

	public String getAll(String nome, String sigla, String titulacao) {
		return "Nome" + nome + "Sigla" + sigla + "Titulacao "+ titulacao;
	}
		public Curso() {
			super();
		}
		public Curso(String nome, String sigla, String titulacao) {
			super();
			this.nome = nome;
			this.sigla = sigla;
			this.titulacao = titulacao;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSigla() {
			return sigla;
		}
		public void setSigla(String sigla) {
			this.sigla = sigla;
		}
		public String getTitulacao() {
			return titulacao;
		}
		public void setTitulacao(String titulacao) {
			this.titulacao = titulacao;
		}



	}
