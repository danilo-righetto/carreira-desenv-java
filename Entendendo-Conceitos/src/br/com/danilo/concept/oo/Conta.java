package br.com.danilo.concept.oo;

public class Conta {
	/* Atributos */
	int numero;
	double saldo;
	String titular;
	int agencia;
	String cpf;
	String dataDeNascimento;
	
	
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
