package br.com.danilo.concept.oo;

public class TestaTurma {
	public static void main(String[] args) {
		Turma fj11 = new Turma();
		
		fj11.alunos = new Aluno[10];
		
		fj11.alunos[0] = new Aluno();
		fj11.alunos[0].nome = "Danilo";
		fj11.alunos[0].nota = 9;
		
		fj11.alunos[1] = new Aluno();
		fj11.alunos[1].nome = "Carlos";
		fj11.alunos[1].nota = 7;
		
		fj11.imprimiNotas();
		
		//System.out.println("Notas: " + fj11.notas[0]);
		
		
	}
}
