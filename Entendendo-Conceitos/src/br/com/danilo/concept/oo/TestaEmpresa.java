package br.com.danilo.concept.oo;

public class TestaEmpresa {
	public static void main(String[] args) {
		Funcionario righetto = new Funcionario(7, 2, 2017);
		
		righetto.setSalario(1300.30);
		righetto.setDepartamento("TI");
		righetto.setNomeCompleto("Danilo Righetto");
		righetto.setRg("1234567-8");
		righetto.recebeAumento(200);
		
		Funcionario lucas = new Funcionario(8, 7, 2017);
		
		lucas.setSalario(1300.30);
		lucas.setDepartamento("TI");
		lucas.setNomeCompleto("Lucas Santos");
		lucas.setRg("1234567-8");
		lucas.recebeAumento(200);
		
		Empresa empresa = new Empresa();
		empresa.funcionarios = new Funcionario[10];
		empresa.adicionar(righetto);
		empresa.adicionar(lucas);
		
		//empresa.funcionarios[0].mostra();
		//empresa.funcionarios[1].mostra();
		
		empresa.mostraEmpregados();
	}
}
