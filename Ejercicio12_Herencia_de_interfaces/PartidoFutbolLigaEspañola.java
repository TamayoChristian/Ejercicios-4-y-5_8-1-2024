package Ejercicio12_Herencia_de_interfaces;

public class PartidoFutbolLigaEspañola implements Partido_De_Fútbol{
	//Atributos
	public String EquipoLocal;
	public String EquipoVisitante;
	public int GolesEquipoLocal;
	public int GolesEquipoVisitante;
	
	//Constructores
	public PartidoFutbolLigaEspañola() {
		
	}
	
	public PartidoFutbolLigaEspañola(String equipoLocal, String equipoVisitante, int golesEquipoLocal,
			int golesEquipoVisitante) {
		super();
		EquipoLocal = equipoLocal;
		EquipoVisitante = equipoVisitante;
		GolesEquipoLocal = golesEquipoLocal;
		GolesEquipoVisitante = golesEquipoVisitante;
	}

	//Getters and setters
	
	public String getEquipoLocal() {
		return EquipoLocal;
	}

	public String getEquipoVisitante() {
		return EquipoVisitante;
	}

	public int getGolesEquipoLocal() {
		return GolesEquipoLocal;
	}

	public int getGolesEquipoVisitante() {
		return GolesEquipoVisitante;
	}

	
	@Override
	public void setEquipoLocal(String Nombre) {
		this.EquipoLocal=Nombre;
		
	}

	@Override
	public void setEquipoVisitante(String Nombre) {
		this.EquipoVisitante=Nombre;
		
	}

	@Override
	public void setGolesEquipoLocal(int Marcador) {
		this.GolesEquipoLocal=Marcador;
		
	}

	@Override
	public void setGolesEquipoVisitante(int Marcador) {
		this.GolesEquipoVisitante=Marcador;
		
	}
	
	public void imprimir() {
		System.out.println("Marcador");
		System.out.println(EquipoLocal + " " + getGolesEquipoLocal() + " - "+
				getGolesEquipoVisitante() + " " + EquipoVisitante);
	}
}
