package decisao_composta;

import java.util.Scanner;

public class DecisaoComposta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		String numero = sc.nextLine();
		
		int numeroConvertido = Integer.parseInt(numero);
		
		try {
			if(numeroConvertido > 20) {
				System.out.println("NUMERO é maior");
			}
			else {
				System.out.println("NUMERO não é maior");
			}
		}catch (Exception e) {
			System.out.println("Número inválido");
		}
		
		sc.close();
	}
}
