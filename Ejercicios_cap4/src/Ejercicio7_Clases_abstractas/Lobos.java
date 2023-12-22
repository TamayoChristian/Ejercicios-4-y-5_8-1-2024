package Ejercicio7_Clases_abstractas;

public class Lobos extends Cánidos{

	@Override
	public String getSonido() {
		return "Aullido";
	}

	@Override
	public String getAlimento() {
		return "Carnivoro";
	}

	@Override
	public String getHábitat() {
		return "Bosque";
	}

	@Override
	public String getNombre_cientifico() {
		return "Canis Lupus";
	}

}
