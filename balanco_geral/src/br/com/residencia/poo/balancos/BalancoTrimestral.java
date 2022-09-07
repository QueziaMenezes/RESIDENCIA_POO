package br.com.residencia.poo.balancos;

public class BalancoTrimestral {
	
public static void main(String[] args) {
		
		int gastosJaneiro = 15000;
		int gastosFevereiro =23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("\nO gasto de Janeiro foi de R$15000");
		System.out.println("\nO gasto de Fevereiro foi de R$23000");
		System.out.println("\nO gasto de Março foi de R$17000\n");
		
		System.out.println("O gasto do trimeste foi de R$ "+ gastosTrimestre);
	}

}