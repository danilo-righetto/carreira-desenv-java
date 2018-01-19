package br.com.danilo.concept.oo;

public class Conta {
	/* Atributos */
	int numero;
	double saldo;
	String titular;
	int agencia;
	String cpf;
	String dataDeNascimento;
	
	
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
