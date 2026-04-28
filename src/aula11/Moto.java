package aula11;

public class Moto extends Veiculo {
	
	protected int cinlindradas;

	public int getCinlindradas() {
		return cinlindradas;
	}

	public void setCinlindradas(int cinlindradas) {
		this.cinlindradas = cinlindradas;
	}
	
	@Override
	public void calcularPreco(int qtdHoras) {
		int calc = qtdHoras * 10;
		System.out.println("O valor a pagar é: $" + calc);
	}


}
