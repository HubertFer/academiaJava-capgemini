package carro;

public class Garagem {
	Carro carroPasseio;
	
	Carro carroUtilitario;


	public static void main(String[] args) {
		Garagem g = new Garagem();
		

		
		g.carroPasseio = new Carro();
		g.carroUtilitario = new Carro();
		
		g.carroPasseio.modelo = "VW Jetta";
		g.carroPasseio.cor = "vermelho";
		g.carroPasseio.potencia = 2.3;
		
		g.carroUtilitario.modelo = "Renault Boxer";
		g.carroUtilitario.cor = "branco";
		g.carroUtilitario.potencia = 3.8;
		
		System.out.println("Carro de passeio");
		System.out.println(g.carroPasseio.modelo);
		System.out.println(g.carroPasseio.cor);
		System.out.println(g.carroPasseio.potencia);
		System.out.println("");
		System.out.println("Carro Utilitário");
		System.out.println(g.carroUtilitario.modelo);
		System.out.println(g.carroUtilitario.cor);
		System.out.println(g.carroUtilitario.potencia);
		
	}
}
