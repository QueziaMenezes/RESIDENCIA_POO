package br.com.residencia.poo.casa.atividades;

import java.util.Scanner;

public class AtividadeCasaDois {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cont = 1, idade, minhaIdade, totalDeles = 0, totalGeral = 0;
		
		System.out.println("Qual é a sua idade: ");
		minhaIdade = ler.nextInt();
		
		do {
			System.out.println ("\nQual é a idade do colega " + cont + "? ");
			idade = ler.nextInt();
			totalDeles += idade;
			cont++;
			
		}while (cont <= 5);{
			totalGeral += totalDeles + minhaIdade;
			
					System.out.println ("\nO tempo de vida meu e dos meus colegas é de: " + totalGeral + " anos.");
		
				ler.close();	
		}
	}

}