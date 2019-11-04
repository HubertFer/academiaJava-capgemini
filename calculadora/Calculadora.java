package calculadora;

public class Calculadora {
	
	private int soma; 
	private int subtracao;
	private int multiplicacao;
	private int divisao;
	
	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}

	public int getSubtracao() {
		return subtracao;
	}

	public void setSubtracao(int subtracao) {
		this.subtracao = subtracao;
	}

	public int getMultiplicacao() {
		return multiplicacao;
	}

	public void setMultiplicacao(int multiplicacao) {
		this.multiplicacao = multiplicacao;
	}

	public int getDivisao() {
		return divisao;
	}

	public void setDivisao(int divisao) {
		this.divisao = divisao;
	}

	public int somar(int num1, int num2) {
		return soma = num1 + num2;
	}
	
	public int subtrair(int num1, int num2) {
		return subtracao = num1 - num2;
	}

	public int multiplicar(int num1, int num2) {
		return multiplicacao = num1 * num2;
	}
	public int dividir(int num1, int num2) {
		return divisao = num1 / num2;
	}
}
