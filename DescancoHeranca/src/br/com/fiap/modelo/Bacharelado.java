package br.com.fiap.modelo;

public class Bacharelado extends Curso {
	private int cargaHorariaEstagio;
	private boolean estendido;
	private String projetoConclusao;

	public double exibirMensalidade() {

		if (estendido == true) {
			return getValor() / (getDuracao()+12);
		} return getValor() / getDuracao();
	}

		public void gerarCargaHorariaEstagio( ) {
			cargaHorariaEstagio = (int) (getDuracao() * 0.10);
		}

		public String getAll() {
			return super.getAll() + "\n" + 
					"Carga Horária do Estágio :" + cargaHorariaEstagio + "\n" +
					"Curso Estendido :" + estendido + "\n" + 
					"Projeto de Conclusão :" + projetoConclusao;
		}
		public void setAll(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor,
				int cargaHorariaEstagio, boolean estendido, String projetoConclusao) {
			super.setAll(descricao, coordenacao, unidade, sigla, duracao, valor);
			setCargaHorariaEstagio(cargaHorariaEstagio);
			setEstendido(estendido);
			setProjetoConclusao(projetoConclusao);
		}

		public Bacharelado() {
			super();
		}
		public Bacharelado(String descricao, String coordenacao, Unidade unidade, String sigla, int duracao, double valor,
				int cargaHorariaEstagio, boolean estendido, String projetoConclusao) {
			super(descricao, coordenacao, unidade, sigla, duracao, valor);
			setCargaHorariaEstagio(cargaHorariaEstagio);
			setEstendido(estendido);
			setProjetoConclusao(projetoConclusao);
		}
		public int getCargaHorariaEstagio() {
			return cargaHorariaEstagio;
		}
		public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
			this.cargaHorariaEstagio = cargaHorariaEstagio;
		}
		public boolean getEstendido() {
			return estendido;
		}
		public void setEstendido(boolean estendido) {
			this.estendido = estendido;
		}
		public String getProjetoConclusao() {
			return projetoConclusao;
		}
		public void setProjetoConclusao(String projetoConclusao) {
			this.projetoConclusao = projetoConclusao.toUpperCase();
		}



	}
