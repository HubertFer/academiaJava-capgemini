package decisao_composta;

import java.util.Scanner;

public class DecisaoComposta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		String numero = sc.nextLine();
		
		int numeroConvertido = Integer.parseInt(numero);
		
		try {
			if(numeroConvertido > 20) {
				System.out.println("NUMERO � maior");
			}
			else {
				System.out.println("NUMERO n�o � maior");
			}
		}catch (Exception e) {
			System.out.println("N�mero inv�lido");
		}
		
		sc.close();
	}
}
