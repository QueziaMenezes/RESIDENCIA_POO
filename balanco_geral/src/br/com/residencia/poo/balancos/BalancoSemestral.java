package br.com.residencia.poo.balancos;

public class BalancoSemestral {

	private int gastosAbril = 10000;
	private int gastosMaio = 10000;
	private int gastosJunho = 10000;
	private int soma;
	
	public BalancoSemestral (int soma) {
		this.setSoma(soma + gastosAbril + gastosMaio + gastosJunho);
	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}
}