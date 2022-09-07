package br.com.residencia.poo.casasatividades;

import java.util.Scanner;

public class AtividadeCasaTres {

	public static void main(String[] args) {
	Scanner tex = new Scanner(System.in);	
		
	float n1, n2, resultado1, resultado2, resultado3, resultado4;
	int oper;
		
	System.out.println ("                            DIGITE \n\n1 para SOMAR - 2 para SUBTRAIR - 3 para MULTIPLICAR - 4 para DIVIDIR - 0 para SAIR\n\n");
		oper = tex.nextInt();

		while (oper != 0 && oper != 1 && oper != 2 && oper != 3 && oper != 4){
			System.out.println ("                      DIGITE UM NÚMERO VÁLIDO \n\n1 para SOMAR - 2 para SUBTRAIR - 3 para MULTIPLICAR - 4 para DIVIDIR - 0 para SAIR\n\n");
			
		}
		
		if (oper == 0){
			System.out.println ("\n\n                VOLTE QUANDO PRECISAR FAZER SUAS CONTAS!!!");
	 	
		}
		
		System.out.println("\nDigite um número: ");
		n1 = tex.nextFloat();
		System.out.println("\nDigite outro número: ");
		n2 = tex.nextFloat();

		if (oper == 1){
			
		resultado1 = soma (n1, n2);
		System.out.println ("O resultado da subtração é: ", resultado1);
	 	
		}
		
		else if (oper == 2){
			
		resultado2 = subtracao (n1, n2);
		System.out.println ("O resultado da subtração é: ", resultado2);
		
		}

		else if (oper == 3){
			
		resultado3 = multiplicacao (n1, n2);
		System.out.println ("\nO resultado da multiplicação é: ", resultado3);
	 	
		}

		else if (oper == 4){
			
		if(n2 != 0){
			
			resultado4 = divisao (n1, n2);
			System.out.println ("\nO resultado da divisão é: ", resultado4);
		
		}
		
		else{
			
			System.out.println ("\nNão é possivel realizar divisão por 0!");
	 		
		}
		}
		}
		
		function float soma (float a, float b){
				return a + b;
						
		}
		
		function float subtracao (float n1, float n2){
			return n1 - n2;
			
		}
		
		function float multiplicacao (float n1, float n2){
			return n1 * n2;
			
		}

		function float divisao (float n1, float n2){
				return n1 / n2;
							

	}

}
