package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category heran�a, reescrita e polimorfismo
 *
 */
public class Desenvolvedor extends Funcionario{
	public double getBonus() {
		return this.salario * 0.25;
	}
}
