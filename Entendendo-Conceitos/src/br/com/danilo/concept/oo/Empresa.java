package br.com.danilo.concept.oo;

public class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int livre = 0;
	
	public void adicionar(Funcionario f) {
		this.funcionarios[livre] = f;
		livre++;
	}
	
	public void mostraEmpregados() {
		for (int i = 0; i < this.funcionarios.length; i++) {
			Funcionario func = this.funcionarios[i];
			if(func == null) continue; 
			System.out.println("----------- Dados os Funcionarios -----------");
			System.out.println("Nome completo: " + this.funcionarios[i].getNomeCompleto());
			System.out.println("Departamento: " + this.funcionarios[i].getDepartamento());
			System.out.println("RG: " + this.funcionarios[i].getRg());
			System.out.println("Salario - R$ " + this.funcionarios[i].getSalario());
			System.out.println("Data entrada: " + this.funcionarios[i].getDataEntrada());
		}
	}
	
	public void mostraTodasAsInformacoes() {
		for (int i = 0; i < this.funcionarios.length; i++) {
			this.funcionarios[i].mostra();
		}
	}
}
