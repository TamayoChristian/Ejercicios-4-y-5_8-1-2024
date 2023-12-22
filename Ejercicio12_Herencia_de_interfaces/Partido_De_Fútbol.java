package Ejercicio12_Herencia_de_interfaces;

public interface Partido_De_Fútbol extends MatchDeportivo{
	public static final double Duración_Partido = 90; //Duración del partido en minutos
	
	//Métodos
	public void setGolesEquipoLocal(int Marcador);
	public void setGolesEquipoVisitante(int Marcador);
	
}
