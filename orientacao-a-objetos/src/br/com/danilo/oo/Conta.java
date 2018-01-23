package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category herança, reescrita e polimorfismo
 *
 */
public class Conta {
	/* Exercicio 1 */
	private double saldo;
	
	/* Herança, reescrita e polimorfismo - Exercicio 2 - Inicio */
	public void atualiza(double taxa) {
		double soma = this.saldo * (taxa / 100);
		this.saldo += soma;
	}
	/* Herança, reescrita e polimorfismo - Exercicio 2 - Fim */
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double deposito) {
		this.saldo += deposito;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
}
