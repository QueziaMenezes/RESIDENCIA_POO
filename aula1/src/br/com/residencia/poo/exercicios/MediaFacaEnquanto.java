package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class MediaFacaEnquanto {

	public static void main(String[] args) {
		Scanner text = new Scanner(System.in);
		
		double nota, totalNotas = 0.0, media;
		int cont = 1;
		String disciplina, nome;
				
				System.out.println("Digite seu nome: ");
				nome = text.nextLine();
				System.out.println("Digite sua disciplina: ");
				disciplina = text.nextLine();
				
				do {
					System.out.println ("\nInsira a nota " + cont + ": ");
					nota = text.nextDouble();
					totalNotas += nota;
					cont++;
					
				}while (cont < 4);
					{ media = totalNotas/3;
							System.out.println ("\nOlá, " + nome + "\nNa disciplina de " + disciplina + ", sua média é de " + media);
				 }
				
				text.close();
	}
}