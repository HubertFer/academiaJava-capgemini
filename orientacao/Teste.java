package orientacao;

public class Teste {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.ano = 2010;
		c1.chassis = "ABC123456";
		c1.placa = "EWV5555";
		
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Humberto";
		p1.idade = 39;
		
		p1.carro = c1;

		
	}
}
