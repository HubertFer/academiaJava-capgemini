package decisao_composta;

import java.util.Scanner;

public class BonusSalarial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o salário: ");
		double salario = sc.nextDouble();
		
		System.out.println("Digite o tempo");
		double tempo = sc.nextDouble();
		
		if(tempo >= 5) {
			double bonus = salario * 0.20;
			System.out.println("O valor do bonus e: " + bonus);
		} else{
			double bonus = salario * 0.10;
			System.out.println("O valor do bonus é: " + bonus);
		}
		
		sc.close();
	}

}
