package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category herança, reescrita e polimorfismo
 *
 */
public class ContaCorrente extends Conta {
	/* Herança, reescrita e polimorfismo - Exercicio 3 - inicio */
	protected void atualiza(double taxa) {
		this.saldo += this.saldo * ((taxa * 2) / 100);
	}
	/* Herança, reescrita e polimorfismo - Exercicio 3 - fim */
}
