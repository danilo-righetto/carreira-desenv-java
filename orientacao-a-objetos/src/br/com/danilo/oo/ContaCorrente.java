package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category heran�a, reescrita e polimorfismo
 *
 */
public class ContaCorrente extends Conta {
	/* Heran�a, reescrita e polimorfismo - Exercicio 3 - inicio */
	protected void atualiza(double taxa) {
		this.saldo += this.saldo * ((taxa * 2) / 100);
	}
	/* Heran�a, reescrita e polimorfismo - Exercicio 3 - fim */
}
