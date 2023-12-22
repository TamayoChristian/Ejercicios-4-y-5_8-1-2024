package Ejercicio11_Interfaces_múltiples;

public class Vehículos_Terrestres extends Vehículo implements Motor{

	//Atributos
	public int Cantidad_Llantas;
	enum Clase{Militar,Civil};
	Clase tipologia;
	
	public Vehículos_Terrestres(double velocidad_Actual, double velocidad_Máxima, 
			int Cantidad_Llantas, Clase tipologia) {
		
		super(velocidad_Actual, velocidad_Máxima);
		this.Cantidad_Llantas=Cantidad_Llantas;
		this.tipologia=tipologia;
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
		System.out.println("Número de llantas: " + Cantidad_Llantas);
	}

	@Override
	public int Calcular_Revoluciones(int Fuerza, int Radio) {
		return Fuerza*Radio;
	}
	
}
