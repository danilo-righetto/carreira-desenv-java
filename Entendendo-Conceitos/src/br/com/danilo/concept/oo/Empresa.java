package br.com.danilo.concept.oo;

public class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int livre = 0;
	
	public void adicionar(Funcionario f) {
		this.funcionarios[this.funcionarios.length+1] = f;
		/* Outro modo: 
		 * 
		 * this.funcionarios[livre] = f;
		 * livre++;
		 * */
	}
}
