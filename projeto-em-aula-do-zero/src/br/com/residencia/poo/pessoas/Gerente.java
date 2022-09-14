package br.com.residencia.poo.pessoas;

public class Gerente extends Funcionario {

	
	private int numeroFuncionarios;
	private boolean controleCaixa;
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	
	
	
	public Gerente() {
		super();
		
	}


	public Gerente(String nome, String cpf, double salario, int senha, String login, String agencia) {
		super(nome, cpf, salario, senha, login, agencia);
		
	}



	public Gerente(int numeroFuncionarios, boolean controleCaixa) {
		super();
		this.numeroFuncionarios = numeroFuncionarios;
		this.controleCaixa = controleCaixa;
	}
	
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	


	public boolean isControleCaixa() {
		return controleCaixa;
	}
	public void setControleCaixa(boolean controleCaixa) {
		this.controleCaixa = controleCaixa;
	}

	
	
}
