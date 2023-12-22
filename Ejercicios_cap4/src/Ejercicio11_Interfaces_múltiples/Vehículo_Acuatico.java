package Ejercicio11_Interfaces_múltiples;

public class Vehículo_Acuatico extends Vehículo implements Motor, Vela{

	//Atributos
	enum Tipo{Superficie,Submarino};
	Tipo Clase;
	public int Cantidad_De_Pasajeros;
	//Constructor
	public Vehículo_Acuatico(double velocidad_Actual, 
			double velocidad_Máxima, Tipo Clase, int Cantidad_De_Pasajeros) {
	
		super(velocidad_Actual, velocidad_Máxima);
		this.Clase=Clase;
		this.Cantidad_De_Pasajeros=Cantidad_De_Pasajeros;
	}

	@Override
	public void Acelerar(double Vel) {
		Velocidad_Actual = Velocidad_Actual+Vel;
		if(Velocidad_Actual >= Velocidad_Máxima) {
			Velocidad_Actual = Velocidad_Máxima;
		}
	}

	@Override
	public void Frenar(double Vel) {
		Velocidad_Actual = Velocidad_Actual-Vel;
		if(Velocidad_Actual <= 0) {
			Velocidad_Actual = 0;
		}
	}

	@Override
	public void Imprimir() {
		System.out.println("Velocidad actual: " + Velocidad_Actual);
		System.out.println("Velocidad máxima: " + Velocidad_Máxima);
		System.out.println("Cantidad de pasajeros: " + Cantidad_De_Pasajeros);
		
	}

	@Override
	public void Recomendar_Velocidad(int Velocidad_Viento) {
		if(Velocidad_Viento>80||Velocidad_Viento<10) {
			Velocidad_Actual = 0;
			System.out.println("Se recomienda no navegar hoy");
		}
	}

	@Override
	public int Calcular_Revoluciones(int Fuerza, int Radio) {
		return (Fuerza*Radio);
	}

}
