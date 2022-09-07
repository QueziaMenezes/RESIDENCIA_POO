package br.com.residencia.poo.casasatividades;

import java.util.Scanner;

public class AtividadeCasaUm {

	public static void main(String[] args) {
		Scanner tex = new Scanner(System.in);
		String nome, sobrenome;
		
		System.out.println("Escreva seu nome: ");
		nome = tex.nextLine();
		System.out.println("Escreva seu sobrenome: ");
		sobrenome = tex.nextLine();
		System.out.println("\n                Olá, " + nome +" "+ sobrenome+"!\n\n      "
		+ "Seja bem-vindo (a) ao universo da programação!");
		
		tex.close();

	}

}