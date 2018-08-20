package br.com.fiap.modelo;


import javax.swing.JOptionPane;

public class Magica {
	public static boolean logico(String msg) {
		//resposta poderia ser char ou int (showConfirmDialog())
		String resposta =
				JOptionPane.showInputDialog(msg).toUpperCase();
		if(resposta.equals("SIM")) {
			return true;
		}else {
			return false;
		}
	}
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}
	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}
}
