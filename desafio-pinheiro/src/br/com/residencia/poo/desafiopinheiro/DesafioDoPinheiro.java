package br.com.residencia.poo.desafiopinheiro;

import java.util.Scanner;

public class DesafioDoPinheiro {

	public static void main(String[] args) {
		byte arvore;

		Scanner leia = new Scanner(System.in);
		System.out.printf("Digite um número INTEIRO entre 4 e 100: ");
		arvore = leia.nextByte();

		for (int a = 0; a < arvore; a++) {

			for (int b = a; b < arvore; b++) {

				System.out.print(" ");

			}

			System.out.print("*");

			for (int b = 0; b < a; b++) {

				System.out.print("**");

			}

			System.out.print("\n");

		}

		for (int a = 0; a < 3; a++) {
			for (int b = 0; b < arvore - 1; b++) {

				System.out.print(" ");

			}

			System.out.print(" *\n");
			leia.close();

		}

	}

}