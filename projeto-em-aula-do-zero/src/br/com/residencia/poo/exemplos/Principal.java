package br.com.residencia.poo.exemplos;

import br.com.residencia.poo.pessoas.Diretor;
import br.com.residencia.poo.pessoas.Funcionario;

public class Principal {

	public static void main(String[] args) {

		Funcionario objetoFuncionario = new Funcionario();
		
		Funcionario objetoFunc = new Funcionario("Quezia", "123", 1000.0, 111, "tess", "000");
		Funcionario objetoFuncUm = new Funcionario();
		System.out.println("Bonificação do funcionário " + objetoFunc.getBonificacao());
		
		Diretor objetoDir = new Diretor();
		Diretor objetoDiretor = new Diretor("123-4", 50000.0, "Tess", "123", 3000.0, 111, "tess", "000");
		System.out.println("Bonificação do funcionário " + objetoDiretor.getBonificacao());
		
		Funcionario objetoDiretorDois = new Diretor();

	}

}