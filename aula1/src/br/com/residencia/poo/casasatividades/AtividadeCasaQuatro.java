package br.com.residencia.poo.casasatividades;

import java.util.Scanner;

public class AtividadeCasaQuatro {
	public static void main (String [] args) {
	
	double tempC, tempF;
	Scanner ler = new Scanner(System.in);
	
	System.out.println ("Digite a temperatura em Celcius a ser convertida: ");
	tempC = ler.nextDouble();
	
	tempF = (tempC*1.8+32);
	System.out.println(tempC + "° é equivalente a: " + tempF + "°F");
		
	ler.close();
	}

}