package br.com.residencia.poo.pessoas;

public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	private String login;
	private String agencia;

	public Funcionario() {
		super();

	}

	public Funcionario(String nome, String cpf, double salario, int senha, String login, String agencia) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
		this.login = login;
		this.agencia = agencia;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getSenha() {
		return senha;
	}

	public String getLogin() {
		return login;
	}

	public double getBonificacao() {
		return this.salario * 0.10;
	
	}
	
}
