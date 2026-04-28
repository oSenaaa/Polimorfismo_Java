package aula11;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		carro.setPlaca("HJA8I07");
		carro.setCor("Cinza");
		carro.setModelo("Porsche");
		carro.setQntdPortas("2");
		carro.setHorarioEntrada("19:20");
		
		carro.calcularPreco(5);
		
		moto.setCinlindradas(600);
		moto.setModelo("Hornet");
		moto.setCor("Preta");
		moto.setPlaca("SCCP1910");
		moto.setHorarioEntrada("20:30");
		
		moto.calcularPreco(5);

	}
	
	

}
