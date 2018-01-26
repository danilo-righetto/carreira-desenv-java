package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category herança, reescrita e polimorfismo
 *
 */
public class Gerente extends Funcionario implements Autenticavel{
	public double getBonus() {
		return this.salario * 0.3;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
