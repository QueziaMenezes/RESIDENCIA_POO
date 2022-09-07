package br.com.poo.principal;

import br.com.poo.contas.ContaOk;

public class PrincipalOk {

	public static void main(String[] args) {

		ContaOk minhaConta = new ContaOk(123, "Quezia", 1000.0);
		ContaOk novaConta = new ContaOk(456, "Sulamita", 900.0);

		
		minhaConta.sacar(50.0);
		minhaConta.depositar(20.0);
		minhaConta.transferir(novaConta, 500.0);


		  System.out.println("Saldo atual: " + minhaConta.getSaldo() + "\nNome do titular: "
		  + minhaConta.getTitular() + "\nNúmero da conta: " + minhaConta.getNumero());

		  System.out.println("\nNome do titular: " + minhaConta.getTitular() + "\nNúmero da conta: " 
		  + minhaConta.getNumero()
				+ "\nSaldo atual: " + minhaConta.getSaldo());
		  System.out.println("\nNome do titular: " + novaConta.getTitular() + "\nSaldo atual: "
				+ novaConta.getSaldo() + "\nNome do titular: " + novaConta.getTitular());
	}
}