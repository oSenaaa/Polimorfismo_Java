package aula11;


public class Veiculo {
	protected  String placa,cor,modelo,horarioEntrada;
 
	public String getPlaca() {
		return placa;
	}
 
	public void setPlaca(String placa) {
		this.placa = placa;
	}
 
	public String getCor() {
		return cor;
	}
 
	public void setCor(String cor) {
		this.cor = cor;
	}
 
	public String getModelo() {
		return modelo;
	}
 
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
 
	public String getHorarioEntrada() {
		return horarioEntrada;
	}
 
	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}
	
	public void calcularPreco(int qtdHoras) {
		int calc = qtdHoras * 15;
		
		System.out.println("O valor a pagar é: $" + calc);
	}
	
}