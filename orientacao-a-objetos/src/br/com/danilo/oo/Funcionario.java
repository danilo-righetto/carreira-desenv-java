package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category heran�a, reescrita e polimorfismo
 *
 */
abstract class Funcionario {
	/* Heranca, Reescrita e Polimorfismo */
	
	protected String nome;
	protected double salario;
	protected int cargo;
	//private int senha;
	
	/* 1 - funcionario
	 * 2 - gerente
	 * 3 - 
	 * 
	 * */
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public abstract double getBonus();
		/* O codigo abaixo � um mal exemplo de implementa��o
		 * do bonus do Funcionario */
		/*
		if(cargo == 1) {
			return this.salario * 0.2;
		}else if(cargo == 2) {
			return this.salario * 0.3;
		}else if(cargo == 3) {
			return this.salario * 0.4;
		}else {
			return this.salario * 0.1;
		}
		*/


	/*
	public boolean autentica(int senha) {
		return this.senha == senha;
	}*/
	
	
}
