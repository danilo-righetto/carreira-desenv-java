package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category heran�a, reescrita e polimorfismo
 *
 */
public class ContaPoupanca extends Conta{
	/* Heran�a, reescrita e polimorfismo - Exercicio 3 - inicio */
	
	
	public void deposita(double deposito) {
		this.saldo += deposito - 0.10;
	}
	/* Heran�a, reescrita e polimorfismo - Exercicio 3 - fim */

	@Override
	protected void atualiza(double taxa) {
		this.saldo += this.saldo * ((taxa * 3) / 100);
	}
}
