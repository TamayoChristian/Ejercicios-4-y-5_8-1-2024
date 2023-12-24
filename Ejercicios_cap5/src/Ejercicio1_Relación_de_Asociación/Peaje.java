package Ejercicio1_Relación_de_Asociación;

import java.util.Vector;

public class Peaje {
	//Atributos
	private String Nombre;
	private Vector<Vehículo> Vehículos;
	private int PeajeTotal;
	private static int Camiones=0;
	private static int Carros=0;
	private static int Motos=0;

	//Constructor
	public Peaje(String nombre) {
		super();
		Nombre = nombre;
		Vehículos = new Vector<Vehículo>();
	}

	//Getters and setters
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public Vector<Vehículo> getVehículos() {
		return Vehículos;
	}

	public void setVehículos(Vector<Vehículo> vehículos) {
		Vehículos = vehículos;
	}

	public int getPeajeTotal() {
		return PeajeTotal;
	}

	public void setPeajeTotal(int peajeTotal) {
		PeajeTotal = peajeTotal;
	}

	public static int getCamiones() {
		return Camiones;
	}

	public static void setCamiones(int camiones) {
		Camiones = camiones;
	}

	public static int getCarros() {
		return Carros;
	}

	public static void setCarros(int carros) {
		Carros = carros;
	}

	public static int getMotos() {
		return Motos;
	}

	public static void setMotos(int motos) {
		Motos = motos;
	}
	
	/*
	 * Esta clase va agregando los carros a una lista según 
	 * van llegando a la estación de pejaes
	 */
	public void AgregarVehículos(Vehículo NuevoVehiculo) {
		Vehículos.add(NuevoVehiculo);
	}
	/*
	 * Este metodo calcula el peaje según el pasaje
	 */
	public double Calcular(Vehículo Vehículos) {
		if(Vehículos instanceof Carro) {
			Carros++;
			PeajeTotal += Carro.peaje;
			return Carro.peaje;
		}
		else if(Vehículos instanceof Moto) {
			Motos++;
			PeajeTotal += Moto.peaje;
			return Moto.peaje;
		}
		else if(Vehículos instanceof Camión) {
			Camiones++;
			Camión camión = (Camión)Vehículos;
			PeajeTotal += camión.número_de_ejes*camión.peaje;
			return camión.número_de_ejes*camión.peaje;
		}
		else 
			return 0;
	}
	
	public void Imprimir() {
		System.out.println("Gaceta: " + getNombre());
		System.out.println("Total de carros que han pasado el día de hoy: " + Carros);
		System.out.println("Total de motos que han pasado el día de hoy: " + Motos);
		System.out.println("Total de camioness que han pasado el día de hoy: " + Camiones);
		System.out.println("Peaje total recaudado: $" + PeajeTotal);
	}
}
