package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category herança, reescrita e polimorfismo
 *
 */
public class TotalizadorDeBonus {
	private double total = 0;
	
	public void adiciona(Funcionario f) {
		total +=f.getBonus();
	}
	
	public double getTotal() {
		return this.total;
	}
}
