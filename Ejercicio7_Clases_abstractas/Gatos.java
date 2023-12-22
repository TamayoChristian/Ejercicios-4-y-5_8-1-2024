package Ejercicio7_Clases_abstractas;

public class Gatos extends Felinos {

	@Override
	public String getSonido() {
		return "Maullido";
	}

	@Override
	public String getAlimento() {
		return "Ratones";
	}

	@Override
	public String getHábitat() {
		return "Domestico";
	}

	@Override
	public String getNombre_cientifico() {
		return "Felis silvestris catus";
	}

}
