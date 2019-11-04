package fonte;

public class Exemplo1 {

	public static void main(String[] args) {
		
		int num1  = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		int sum = num1 + num2 + num3; 
		
		System.out.println("Olá: " + sum);
		
	
		int total = 0;
		for(int i = 0; i< args.length; i ++) {
			
			int argumento = Integer.parseInt(args[i]);
			total = argumento + total;
		}
		System.out.println(total);

	}

}
