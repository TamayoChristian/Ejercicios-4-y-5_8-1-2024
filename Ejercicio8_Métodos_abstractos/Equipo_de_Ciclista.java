package Ejercicio8_Métodos_abstractos;

import java.util.Vector;

public class Equipo_de_Ciclista {
	//Atributos
	private String Nombre_Equipo;
	private static double Tiempo_Total; //Tiempo en minutos
	private String Pais;
	Vector<Ciclista> ListaDeCiclistas;
	
	//constructor vacio
	
	public Equipo_de_Ciclista() {
		
	}
	
	//Constructor con atributos
	public Equipo_de_Ciclista(String nombre_Equipo, String pais) {
		super();
		this.Nombre_Equipo = nombre_Equipo;
		this.Pais = pais;
		Tiempo_Total=0;
		ListaDeCiclistas = new Vector<Ciclista>();
	}



	//Getters and setters
	public String getNombre_Equipo() {
		return Nombre_Equipo;
	}
	public void setNombre_Equipo(String nombre_Equipo) {
		Nombre_Equipo = nombre_Equipo;
	}
	public static double getTiempo_Total() {
		return Tiempo_Total;
	}
	public static void setTiempo_Total(double tiempo_Total) {
		Tiempo_Total = tiempo_Total;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	
	protected void Imprimir() {
		System.out.println("Nombre del equipo: " + Nombre_Equipo);
		System.out.println("País: "+Pais);
		System.out.println("Tiempo total: "+Tiempo_Total + " min");
	}
	
	protected void AñadirCiclista(Ciclista CiclistaPorAgregar) {
		ListaDeCiclistas.add(CiclistaPorAgregar);
	}
	
	protected double Calcular_Tiempo() {
		Tiempo_Total = 0;
		for(int contador=0; contador < ListaDeCiclistas.size(); contador++) {
			//Recupera todos los atributos de la clase Ciclista
			Ciclista tiempo = (Ciclista) ListaDeCiclistas.elementAt(contador);
			
			//Asigsna que el tiempo total del equipo es igual al tiempo del ciclista
			//más el valor anterior del tiempo total
			Tiempo_Total = Tiempo_Total + tiempo.getTiempo();
		}
		return Tiempo_Total;
	}
	
	//Este metodo imprime una lista de nombres de los ciclistas que conforman el equipo. 
	protected void Lista() {
		for(int contador=0; contador < ListaDeCiclistas.size(); contador++) {
			Ciclista nombre = (Ciclista) ListaDeCiclistas.elementAt(contador);
			
			System.out.println(contador+1 + ".- " + nombre.getNombre_Ciclista());
		}
	}
	
	//Este metodo busca dentro de la lista un ciclista en particular usando su ID
	protected void Busqueda(int ID) {
		boolean bandera = false;
		for(int contador=0; contador < ListaDeCiclistas.size() && bandera == false ; contador++) {
			Ciclista id = (Ciclista) ListaDeCiclistas.elementAt(contador);
			if(id.getId() == ID) {
				System.out.println("Ciclista encontrado");
				System.out.println("Id: " + id.getId());
				System.out.println("Nombre: " + id.getNombre_Ciclista());
				System.out.println("Tiempo: " + id.getTiempo());
				bandera = true;
			}
		}
		if (bandera==false) {
			System.out.println("Ciclista no encontrado");
		}
	}
}
