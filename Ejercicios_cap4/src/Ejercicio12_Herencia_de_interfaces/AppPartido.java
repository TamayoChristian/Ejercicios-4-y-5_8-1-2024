package Ejercicio12_Herencia_de_interfaces;

public class AppPartido {

	public static void main(String[] args) {
		PartidoFutbolLigaEspañola partido = new PartidoFutbolLigaEspañola();
		System.out.println("Duración del partido: " + PartidoFutbolLigaEspañola.Duración_Partido);
		partido.setEquipoLocal("Sevilla FC");
		partido.setEquipoVisitante("Real Betis");
		partido.setGolesEquipoLocal(5);
		partido.setGolesEquipoVisitante(3);
		partido.imprimir();
	}

}
