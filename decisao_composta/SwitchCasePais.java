package decisao_composta;

public class SwitchCasePais {

	public static void main(String[] args) {
		String pais = "franca";

		switch(pais)
		{
		
		case "brasil":
		case "portugal":
			System.out.println("Bom dia!");
			break;
			
		case "franca":
			System.out.println("Bon jour!");
			break;
		case "mexico":
		case "argentina":
		case "espanha":
			System.out.println("Buenos dias!");
			break;
			default:
				System.out.println("Good Morning!");
		}
	}

}
