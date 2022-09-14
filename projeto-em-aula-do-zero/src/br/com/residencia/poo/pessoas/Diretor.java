package br.com.residencia.poo.pessoas;

public class Diretor extends Funcionario {

	private String listaAgencias;
	private double capitalBruto;
	
	public Diretor() {
		super();
		
	}
	
	public Diretor(String listAagencias, double capitalBruto, String nome, 
			String cpf, double salario, int senha, String login, String agencia) {
		super(nome, cpf, salario, senha, login, agencia);
		this.listaAgencias = listAagencias;
		this.capitalBruto = capitalBruto;
	}
	
	public String getListAagencias() {
		return listaAgencias;
	}
	public double getCapitalBruto() {
		return capitalBruto;
	}
	
	public double getBonificacao() {
		return getSalario() * 0.20;
	}

}
