package br.com.residencia.poo.casa.atividades;

import java.util.Scanner;

public class AtividadeCasaQuatro {
	public static void main (String [] args) {
	Scanner ler = new Scanner(System.in);
	
	double tempC , tempF;
	

	System.out.println ("Digite a temperatura em Celcius a ser convertida: ");
	tempC = ler.nextDouble();
	
	tempF = (tempC*1.8+32);
	System.out.printf(tempC + "° é equivalente a: " + tempF + "°F");
		
	ler.close();
	
	}

}