package cap5lab1;

public class Cap5_Lab1 {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = "Humberto";
		funcionario.cargo = "Programador";
		funcionario.sobrenome = "Fernandez";
		funcionario.salario = 2700;
		
		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Sobrenome: " + funcionario.sobrenome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Salário: " + funcionario.salario);
	}
}
