package br.com.fiap.beans;

public class Pedido {
	private int numPedido;
	private double total;
	private String data;


	public Pedido () {

	}
	public Pedido(int numPedido, double total, String data) {
		this.numPedido=numPedido;
		this.total=total;
		this.data=data;
	}
	public void setAll(int numPedido, double total, String data) {
		this.numPedido=numPedido;
		this.total=total;
		this.data=data;
	}
	public String getAll() {
		return "Numero do pedido...: " + numPedido + "\n" +
				"Total do Pedido...: " + total + "\n"+
				"Data do Pedido....: " + data ;
	             
	}
	public int getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
