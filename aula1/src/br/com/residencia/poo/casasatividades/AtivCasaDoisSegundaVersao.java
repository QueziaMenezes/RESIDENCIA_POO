package br.com.residencia.poo.casasatividades;
import java.util.Scanner;
public class AtivCasaDoisSegundaVersao {

	public static void main(String[] args) {

				   // float n1, n2, n3, n4, n5, minhaidade, soma;
				  
				 int idade = 0 , soma = 0, somanotas = 0, minhaidade=0;
			
					 @SuppressWarnings("resource")
						Scanner ler = new Scanner(System.in);
				     
					/* 	System.out.println("Diga sua idade: ");
				        n1 = ler.nextInt();
				        System.out.println("Diga sua idade: ");
				        n2 = ler.nextInt();
				        System.out.println("Diga sua idade: ");
				        n3 = ler.nextInt();
				        System.out.println("Diga sua idade: ");
				        n4 = ler.nextInt();
				        System.out.println("Diga sua idade: ");
				        n5 = ler.nextInt();
				        System.out.println("Vou digitar minha idade: ");
				        minhaidade = ler.nextInt();
				        soma = n1 + n2 + n3 + n4 + n5 + minhaidade;
				 
					 System.out.printf("O tempo de vida meu e dos meus colegas  " + soma);  */
				     
				     
				      for(int cont= 0; cont <= 4; cont++){
				    	  System.out.printf("Digite a idade do colega: ");
				          idade = ler.nextInt();
				          somanotas = (somanotas + idade);
				     }
				      System.out.printf("Vou Digitar minha Idade: ");
			          minhaidade = ler.nextInt();
			          somanotas = (somanotas + minhaidade);
				      
				      System.out.printf("A soma das nossas idades é, " + somanotas + ":");
				    	 ler.close();

	}

}
