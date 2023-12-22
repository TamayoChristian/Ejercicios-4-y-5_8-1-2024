package Ejercicio12_Herencia_de_interfaces;

public interface Partido_De_Baloncesto extends MatchDeportivo{
	//Atributos
	public double Duración = 40; //Duración del partido
	//Métodos
	public void setCestasEquipoLocal(int Marcador);
	public void setCestasEquipoVisitante(int Marcador);
}
