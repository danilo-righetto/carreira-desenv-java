package br.com.danilo.concept.oo;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario righetto = new Funcionario(7, 2, 2017);
		
		righetto.setSalario(1300.30);
		righetto.setDepartamento("TI");
		righetto.setNomeCompleto("Danilo Righetto");
		righetto.setRg("1234567-8");
		righetto.recebeAumento(200);
		
		System.out.println("Salario com aumento: " + righetto.getSalario());
		System.out.println("Ganho anual: " + righetto.calculaGanhoAnual());
		
		righetto.mostra();
		
		Funcionario lucas = new Funcionario(8, 7, 2017);
		
		lucas.setSalario(1300.30);
		lucas.setDepartamento("TI");
		lucas.setNomeCompleto("Lucas Santos");
		lucas.setRg("1234567-8");
		lucas.recebeAumento(200);
		
		System.out.println("Salario com aumento: " + lucas.getSalario());
		System.out.println("Ganho anual: " + lucas.calculaGanhoAnual());
		
		lucas.mostra();
		
		if(righetto == lucas) {
			System.out.println("São Iguais");
		}else {
			System.out.println("São Diferentes");
		}
		
		/* Exercicio 5 */
		
		//righetto = lucas;
		
		
	}
}
