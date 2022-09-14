package br.com.residencia.poo.aulabalancos;

import java.text.DecimalFormat;

public class BalancoTrimestralDouble {

	private Double gastosJaneiro = 15000.00;
	private Double gastosFevereiro = 23000.00;
	private Double gastosMarco = 17000.00;

	private Double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	DecimalFormat df = new DecimalFormat("0.00");
	
	public BalancoTrimestralDouble() {
	}

	public BalancoTrimestralDouble(Double gastosJaneiro, Double gastosFevereiro, Double gastosMarco, Double somaTotal) {
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.somaTotal = somaTotal;
	}

	public Double soma() {
		System.out.println("O balanço trimestral total é R$ " + df.format(somaTotal));

		System.out.printf("O balanço trimestral total é R$ %.2f", somaTotal);
		return somaTotal;
	}

	public Double soma(Double gastosJaneiro) {
		System.out.println("\nO balanço de janeiro é R$ " + df.format(gastosJaneiro));

		System.out.printf("O balanço de janeiro é R$ %.2f", gastosJaneiro);
		return gastosJaneiro;
	}

	public Double soma(Double gastosJaneiro, Double gastosFevereiro) {
		Double somaTotal = gastosJaneiro + gastosFevereiro;

		System.out.println("\nO balanço bimestral total é R$ " + df.format(somaTotal));

		System.out.printf("O balanço bimestral total é R$ %.2f", somaTotal);
		return somaTotal;
	}

	public Double soma(Double gastosJaneiro, Double gastosFevereiro, Double gastosMarco) {
		Double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;

		System.out.printf("\nO balanço trimestral total é R$ %.2f", somaTotal);

		
		System.out.println("\nO balanço trimestral total é R$ " + df.format(somaTotal) + "\n*****");

		return somaTotal;
	}

}