package br.com.danilo.concept.oo;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario righetto = new Funcionario();
		
		righetto.setSalario(1300.30);
		righetto.setDepartamento("TI");
		righetto.setNomeCompleto("Danilo Righetto");
		righetto.setRg("1234567-8");
		righetto.recebeAumento(200);
		
		System.out.println("Salario com aumento: " + righetto.getSalario());
		System.out.println("Ganho anual: " + righetto.calculaGanhoAnual());
		
		righetto.mostra();
	}
}
