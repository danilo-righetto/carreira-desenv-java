package br.com.danilo.concept.oo;

public class Funcionario {
	private String nomeCompleto;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rg;
	
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
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
}