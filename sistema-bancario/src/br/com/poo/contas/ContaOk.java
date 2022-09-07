package br.com.poo.contas;

public class ContaOk {

	private int numero;
	private String titular;
	private double saldo;

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente!");
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}

	}

	

	public boolean depositar(double valor) {
		if (valor < 0) {
			System.out.println("Valor inválido!");
			return false;
		} else {
			this.saldo += valor;
			return true;
		}
	}

	/*
	 * public void transferir(Conta destino, double valor) { this.sacar(valor);
	 * destino.depositar(valor);
	 */

	public boolean transferir(ContaOk contaDestino, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			return true;
		} else {
			System.out.println("Valor inválido!");
			return false;
		}
	}

	public ContaOk(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;

	}

	public double getNumero() {
		return this.numero;

	}

	public String getTitular() {
		return this.titular;

	}

	public double getSaldo() {
		return this.saldo;

	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
}