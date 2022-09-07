package br.com.residencia.poo.exercicios;


import java.util.Scanner;

public class EscrevaNome {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		
		System.out.println("Escreva seu nome: ");
		nome = ler.nextLine();
		System.out.println("Olá, " + nome);
		
		ler.close();

	}

}
