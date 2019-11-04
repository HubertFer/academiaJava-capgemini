package decisao_composta;

import java.util.Scanner;

public class MediaBimestral {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com a nota 1:");
		double nota1 = sc.nextDouble();
		
		System.out.println("entre com a nota 2:");
		double nota2 = sc.nextDouble();
		
		System.out.println("entre com a nota 3:");
		double nota3 = sc.nextDouble();
		
		System.out.println("entre com a nota 4:");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 7) {
			System.out.println("A média é: " + media +" Aluno aprovado! Parabéns!");
		} else {
			System.out.println("A média é: " + media +" Aluno reprovado! Estude mais!");
		}
		
		sc.close();
	}
}
