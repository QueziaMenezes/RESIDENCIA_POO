package br.com.residencia.poo.dinamicadeerros;

import java.util.Scanner;

public class AcheErroTres{
	

			   public static void main(String[] args) {
				   Scanner sc = new Scanner(System.in);
				   
				   int  soma = 0;
				   String idade; //esse
				   
				   for(int i = 0; i <= 5; i ++) { //esse
					   System.out.print("Qual é a idade do colega " + i + "? ");
					   idade = sc.nextLine(); //esse
					   soma = soma + idade;
				   }
				   
				   System.out.print("Qual é a minha idade? ");
				   idade = sc.nextLine(); //esse
				   soma = soma + idade;
				   System.out.print("O tempo de vida meu e dos meus colegas é " + soma + ".");
				   
				   sc.close();
			   }

}
