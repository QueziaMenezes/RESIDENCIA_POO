/*no exercicio balanço trimestral, acrescentar atributos 
para o ano todo e criar tres metodos de soma: 
trimestre, semestre e anuala*/

package br.com.residencia.poo.balancos;

public class BalancoTotal {

	public static void main(String[] args) {
				
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int soma = gastosJaneiro + gastosFevereiro + gastosMarco;

		BalancoSemestral Semestre = new BalancoSemestral (soma);
		BalancoAnual Ano = new BalancoAnual (Semestre.getSoma());
				
		System.out.println("O gasto total no Trimestre = " + soma);
		System.out.println("O gasto total no Semestre = " + Semestre.getSoma());
		System.out.println("O gasto total no Ano = " + Ano.getSoma());
	}
}