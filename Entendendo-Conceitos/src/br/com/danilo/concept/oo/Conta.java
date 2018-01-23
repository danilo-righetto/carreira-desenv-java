package br.com.danilo.concept.oo;

public class Conta {
	/* Atributos */
	private int numero;
	private double saldo;
	private String titular;
	private int agencia;
	private String cpf;
	private String dataDeNascimento;
	public static int numeroIncremental;
	
	public static int x() {
		return 2 * numeroIncremental;
	}
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}


	public double getSaldo() {
		return saldo;
	}

	public Conta(int numero, double saldo, String titular, int agencia, String cpf, String dataDeNascimento) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
		this.agencia = agencia;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public Conta() {
		this.numero = numeroIncremental;
		numeroIncremental++;
	}

	/* Metodos */
	void deposita(double valorASerDepositado){
		this.saldo += valorASerDepositado;
	}
	
	void saca(double valorASerSacado) {
		if(this.saldo >= valorASerSacado) {
			this.saldo -= valorASerSacado;
		}
	}
	
	void transfere(double valor, Conta destino) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
}
