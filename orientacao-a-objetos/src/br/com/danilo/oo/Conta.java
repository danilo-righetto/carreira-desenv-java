package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category herança, reescrita e polimorfismo
 *
 */
abstract class Conta {
	/* Exercicio 1 */
	protected double saldo;
	
	/* Herança, reescrita e polimorfismo - Exercicio 2 - Inicio */
	protected abstract void atualiza(double taxa);
	
	/*{
		this.saldo += this.saldo * (taxa / 100);
	}*/
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
