package decisao_composta;

import java.util.Scanner;

public class OrdemDecrescente {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(10^5);

		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		sc.close();
	}
}
