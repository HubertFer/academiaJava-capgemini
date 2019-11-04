package decisao_composta;

import java.util.Scanner;

public class ProdutoECodigo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o c�digo do produto: ");
		int codigo = sc.nextInt();
		
		System.out.println("entre com o pre�o do produto: ");
		double preco = sc.nextDouble();
		
		switch (codigo) {
			case 1 : System.out.println("Origem: Sul - pre�o: " + preco);break;
			case 2 : System.out.println("Origem: Norte - pre�o: " + preco);break;
			case 3 :  System.out.println("Origem: Leste - pre�o: " + preco);break;
			case 4 :  System.out.println("Origem: Oeste - pre�o: " + preco);break;
			case 5 :
			case 6 : System.out.println("Origem: Nordeste - pre�o: " + preco);break;
			case 7 :
			case 8 :
			case 9 : System.out.println("Origem: Sudeste - pre�o: " + preco);break;
			}
		if (codigo >= 10 && codigo <= 20) {
			System.out.println("Origem: Centro-Oeste - pre�o: " + preco);
		} else if (codigo >= 25 && codigo <= 30) {
			System.out.println("Origem: Nordeste - pre�o: " + preco);
		}else if (codigo > 30){
			System.out.println("Origem: Importado - pre�o: " + preco);
		} else {
			System.out.println("Origem: Importado - pre�o: " + preco);
		}
		sc.close();
	}
}

