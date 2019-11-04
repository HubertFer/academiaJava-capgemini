package operadores;

import java.util.Locale;
import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor B: ");
		double B = scan.nextDouble();
		
		System.out.println("Entre com o valor h: ");
		double h = scan.nextDouble();
		
		double s = B * h / 2;
		
		System.out.println("O valor da área do triangula é: " + s);
		
		scan.close();

	}

}
