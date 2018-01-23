package br.com.danilo.oo;


/**
 * @author danilo righetto
 * @version 0.1
 * @category herança, reescrita e polimorfismo
 *
 */
public class TestaFuncionario {
	/* Testa a Classe Herança */
	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		joao.setSalario(1000.00);
		System.out.println("Bonus do Funcionario: "+ joao.getBonus());
		
		/* Testando a Classe Gerente */
		Gerente joaquim = new Gerente();
		joaquim.setSalario(3000.00);
		System.out.println("Bonus do Gerente: " + joaquim.getBonus());
	}
}
