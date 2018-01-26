package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category heran�a, reescrita e polimorfismo
 *
 */
abstract class Conta {
	/* Exercicio 1 */
	protected double saldo;
	
	/* Heran�a, reescrita e polimorfismo - Exercicio 2 - Inicio */
	protected abstract void atualiza(double taxa);
	
	/*{
		this.saldo += this.saldo * (taxa / 100);
	}*/
	/* Heran�a, reescrita e polimorfismo - Exercicio 2 - Fim */
	
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
