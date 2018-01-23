package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category herança, reescrita e polimorfismo
 *
 */
public class Funcionario {
	/* Heranca, Reescrita e Polimorfismo */
	
	protected String nome;
	protected double salario;
	protected int cargo;
	
	/* 1 - funcionario
	 * 2 - gerente
	 * 3 - 
	 * 
	 * */
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonus() {
		
		/* O codigo abaixo é um mal exemplo de implementação
		 * do bonus do Funcionario */
		if(cargo == 1) {
			return this.salario * 0.2;
		}else if(cargo == 2) {
			return this.salario * 0.3;
		}else if(cargo == 3) {
			return this.salario * 0.4;
		}else {
			return this.salario * 0.1;
		}
	}
	
}
