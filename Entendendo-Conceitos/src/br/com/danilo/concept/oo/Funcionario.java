package br.com.danilo.concept.oo;

public class Funcionario {
	private String nomeCompleto;
	private String departamento;
	private double salario;
	private Data dataEntrada;
	private String rg;
	
	public Funcionario(int dia, int mes, int ano) {
		super();
		this.dataEntrada = new Data(dia, mes, ano);
	}
	
	public Funcionario(String nomeCompleto) {
		this.setNomeCompleto(nomeCompleto);
	}
	
	public Funcionario() {
		
	}

	public void mostra() {
		System.out.println("---------- Dados do Funcionario ----------");
		System.out.println("Nome Completo: " + this.getNomeCompleto());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("Data Entrada - Dia: " + this.getDataEntrada().getDia());
		System.out.println("Data Entrada - Mes: " + this.getDataEntrada().getMes());
		System.out.println("Data Entrada - Ano: " + this.getDataEntrada().getAno());
		System.out.println("RG: " + this.getRg());
	}
	
	public void recebeAumento(double aumento) {
		this.setSalario(getSalario() + aumento); 
	}
	
	public double calculaGanhoAnual() {
		return this.getSalario() * 12;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	
	
}
