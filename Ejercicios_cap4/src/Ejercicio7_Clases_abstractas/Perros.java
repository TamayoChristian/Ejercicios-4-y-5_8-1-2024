package Ejercicio7_Clases_abstractas;

public class Perros extends Cánidos{
	public String getSonido() {
		return "Ladrido";
	}
	
	public String getAlimento() {
		return "Carnivora";
	}

	@Override
	public String getHábitat() {
		return "Domestico";
	}

	@Override
	public String getNombre_cientifico() {
		return "Canis Lupus Familiaris";
	}
}
