package decisao_composta;

import java.util.Scanner;

public class ProdutoECodigo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o código do produto: ");
		int codigo = sc.nextInt();
		
		System.out.println("entre com o preço do produto: ");
		double preco = sc.nextDouble();
		
		switch (codigo) {
			case 1 : System.out.println("Origem: Sul - preço: " + preco);break;
			case 2 : System.out.println("Origem: Norte - preço: " + preco);break;
			case 3 :  System.out.println("Origem: Leste - preço: " + preco);break;
			case 4 :  System.out.println("Origem: Oeste - preço: " + preco);break;
			case 5 :
			case 6 : System.out.println("Origem: Nordeste - preço: " + preco);break;
			case 7 :
			case 8 :
			case 9 : System.out.println("Origem: Sudeste - preço: " + preco);break;
			}
		if (codigo >= 10 && codigo <= 20) {
			System.out.println("Origem: Centro-Oeste - preço: " + preco);
		} else if (codigo >= 25 && codigo <= 30) {
			System.out.println("Origem: Nordeste - preço: " + preco);
		}else if (codigo > 30){
			System.out.println("Origem: Importado - preço: " + preco);
		} else {
			System.out.println("Origem: Importado - preço: " + preco);
		}
		sc.close();
	}
}

