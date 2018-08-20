package br.com.fiap.modelo;

public class ItemPedido  {
	private Produto produto;
	private int qtde;
	private double valor;
	
	public double getSubtotal() {
		
		return valor*qtde;
	}
	public void setAll(Produto produto, int qtde, double valor) {
		setProduto(produto);
		setQtde(qtde);
		setValor(valor);
		

	}
	public String getAll() {
		return "Produto : " + produto.getAll() + "\n" + "Quantidade : " + qtde + "\n" + "Valor : " + valor;
	}
	public ItemPedido() {
		super();
	}
	public ItemPedido(Produto produto, int qtde, double valor) {
		setProduto(produto);
		setQtde(qtde);
		setValor(valor);
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		if (qtde <1) {
			qtde = 1;
		}
		this.qtde = qtde;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	

}
