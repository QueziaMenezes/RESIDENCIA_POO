package br.com.residencia.poo.atividades;

import java.util.Scanner;

public class BalancoTrimestral {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Integer gastosJaneiro = 15000;
		Integer gastosFevereiro = 23000;
		Integer gastosMarco = 17000;
		Integer gastosTrimestre = 0;
		
		gastosTrimestre += gastosJaneiro + gastosFevereiro + gastosMarco;		
		
		System.out.println("O gasto trimestral foi de: " + gastosTrimestre);
		
		ler.close();
	
	
	}

	public BalancoTrimestral() {
		super();
		
	}

}