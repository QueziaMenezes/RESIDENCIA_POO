package br.com.residencia.poo.casa.atividades;

import java.util.Scanner;

public class AtividadeCasaTres {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);	
		
	double n1, n2, resultado1 = 0, resultado2 = 0, resultado3 = 0, resultado4 = 0;
	int oper;
		
	System.out.println ("                            DIGITE \n\n1 para SOMAR - 2 para SUBTRAIR - 3 para MULTIPLICAR - 4 para DIVIDIR - 0 para SAIR\n\n");
		oper = ler.nextInt();

		while (oper != 1 && oper != 2 && oper != 3 && oper != 4){
			System.out.println ("                      DIGITE UM NÚMERO VÁLIDO \n\n1 para SOMAR - 2 para SUBTRAIR - 3 para MULTIPLICAR - 4 para DIVIDIR - 0 para SAIR\n\n");
			
			
		
			
		}
		
		System.out.println("\nDigite um número: ");
		n1 = ler.nextDouble();
		System.out.println("\nDigite outro número: ");
		n2 = ler.nextDouble();

		if (oper == 1){
			
		resultado1 = (n1 + n2);
		System.out.println ("O resultado da subtração é: " + resultado1);
	 	
		}
		
		else if (oper == 2){
			
		resultado2 = (n1 - n2);
		System.out.println ("O resultado da subtração é: " + resultado2);
		
		}

		else if (oper == 3){
			
		resultado3 = (n1 * n2);
		System.out.println ("\nO resultado da multiplicação é: " + resultado3);
	 	
		}

		else if (oper == 4){
			
		if(n2 != 0){
			
			resultado4 = (n1 / n2);
			System.out.println ("\nO resultado da divisão é: " + resultado4);
		
		}
		
		else{
			
			System.out.println ("\nNão é possivel realizar divisão por 0!");
	 		
		}
		}
							
		ler.close();
		
	}

}
