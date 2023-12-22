package Ejercicio7_Clases_abstractas;

public class Leones extends Felinos{

	@Override
	public String getSonido() {
		return "Rugido";
	}

	@Override
	public String getAlimento() {
		return "Carnivoros";
	}

	@Override
	public String getHábitat() {
		return "Pradera";
	}

	@Override
	public String getNombre_cientifico() {
		return "Panthera leo";
	}
	
}
