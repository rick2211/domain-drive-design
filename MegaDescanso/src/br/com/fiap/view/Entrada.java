package br.com.fiap.view;

import javax.swing.JOptionPane;

public class Entrada {
	
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static long longo(String msg) {
		return Long.parseLong(texto(msg));
	}
	
	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}
	
	public static float flutuante(String msg) {
		return Float.parseFloat(texto(msg));
	}
	
	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg));
	}
	
	public static boolean logico(String msg) {
		char resposta=texto(msg).charAt(0);
		
		if( resposta =='S') {
			return true;
		} else {
			return false;
		}
	}
	
	public static char caractere(String msg) {
		return texto(msg).charAt(0);
	}
}
