package Ejercicio1_Herencia;

public class Cuenta {
	//atributos
	//Saldo
	protected float saldo;
	//Número de consignaciones
	protected int NumConsignaciones = 0;
	//Número de retiros
	protected int NumRetiros = 0;
	//Tasa Anual (%)
	protected float TasaAnual;
	//comisión mensual
	protected float ComMensual = 0;
	
	//Constructor
	public Cuenta(float saldo, float tasaAnual) {
		super();
		this.saldo = saldo;
		this.TasaAnual = tasaAnual;
	}
//Getters and setters
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumConsignaciones() {
		return NumConsignaciones;
	}

	public void setNumConsignaciones(int numConsignaciones) {
		NumConsignaciones = numConsignaciones;
	}

	public int getNumRetiros() {
		return NumRetiros;
	}

	public void setNumRetiros(int numRetiros) {
		NumRetiros = numRetiros;
	}

	public float getTasaAnual() {
		return TasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		TasaAnual = tasaAnual;
	}

	public float getComMensual() {
		return ComMensual;
	}

	public void setComMensual(float comMensual) {
		ComMensual = comMensual;
	}
			
	//Metodos
	//Consignar una cantidad de dinero en la cuenta actualizando su saldo
	public void consignar (float cantidad) {
		saldo = saldo + cantidad;
		NumConsignaciones++;
	}
	
	/* Retirar una cantidad de dinero en la cuenta actualizando su saldo. 
	   El valor a retirar no debe superar el saldo.
	*/
	public void retirar (float cantidad) {
		if (cantidad < saldo) {
			saldo -= cantidad;
			NumRetiros ++;
		} else { 
			System.out.println("La cantidad a reitrar excede el valor del saldo actual");
		}
	}
	//Calcular el interés mensual de la cuenta y actualiza el saldo correspondien
	public void CalcularInteres() {
		//La tasa mensual parte de la tasa anual dividido entre sus 12 meses.
		float InteresMensual = (TasaAnual/12)*saldo;
		//Actualizando el saldo acutal
		saldo += InteresMensual;
	}
	/*
	 * Extracto mensual: actualiza el saldo restándole la comisión mensual 
	 * y calculando el interés mensual correspondiente (invoca el método 
	 * anterior)
	 */
	public void Extracto() {
		saldo -= ComMensual;
		CalcularInteres();
	}
	
	public void imprimir() {
		System.out.println("Saldo: " + saldo + " Dolares");
		System.out.println("Número de consignaciones: " + NumConsignaciones);
		System.out.println("Número de retiros: " + NumRetiros);
		System.out.println("Tasa anual: " + TasaAnual + " Dolares");
		System.out.println("Comisión mensual: " + ComMensual + " Dolares");
	}
}
