package br.com.residencia.poo.dinamicadeerros;

import java.util.Scanner;

public class AcheErroUm {

	public static void main(String[] args) {
		Scanner ler = new ( ScaNnerSystem.in); // Scanner ler = new scanner (System.in);
		
		
		String nome;
        String sobrenome;
        
        System.out.println("==============================");
		System.out.println("Bem-Vindo");
		System.out.println("==============================");
        System.out.println("Diga seu nome: ");
        nome = ler.nextLine();  // nome = ler.nextLine();
        System.out.println("Diga seu sobrenome: ");
        Sobrenome = ler.nextLine(); // sobrenome = ler.nextLine();
        System.out.println("============================: ");
        System.out.println("Olá " ,  nome , " " , sobrenome , ", seja bem-vinda ao universo da programação! "); //System.out.println("Olá " +  nome + " " + nome + ", seja bem-vinda ao universo da programação! ");
        System.out.println("==============================");
      
        ler.close();

	}

}

	}

}
