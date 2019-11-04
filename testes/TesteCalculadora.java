package testes;

import java.util.Scanner;

import calculadora.Calculadora;

public class TesteCalculadora {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		calc.somar(num1, num2);
		calc.subtrair(num1, num2);
		calc.multiplicar(4, num2);
		calc.dividir(num1, num2);
		
		System.out.println(calc.getSoma());
		System.out.println(calc.getSubtracao());
		System.out.println(calc.getMultiplicacao());
		System.out.println(calc.getDivisao());
		sc.close();
	}
}
