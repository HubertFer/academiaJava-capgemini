package testes;

import models.Aluno;

public class TestaAluno {
	public static void main(String[] args) {
		Aluno joao = new Aluno();
		Aluno maria = new Aluno();
		Aluno marcos = new Aluno();
		
		joao.setNome("João");
		maria.setNome("Maria");
		marcos.setNome("Marcos");
		
		Aluno.contadorAlunos = 1;
	}
}
