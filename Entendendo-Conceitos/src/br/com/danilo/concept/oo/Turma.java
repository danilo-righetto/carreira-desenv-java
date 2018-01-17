package br.com.danilo.concept.oo;

public class Turma {
	/* Trabalhando com Arrays */
	Aluno[] alunos;
	
	public void imprimiNotas() {
		for (int i = 0; i < this.alunos.length; i++) {
			Aluno aluno = this.alunos[i];
			if(aluno == null) continue; 
			System.out.println(aluno.nota);
		}
	}
}
