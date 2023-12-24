package Ejercicio1_Relación_de_Asociación;
/**
* Método main crea una estación de peaje, y luego se agregan los vehiculos 
* y se calcula el total recaudado en el día
*/
public class AppPeaje {
	public static void main(String[] args) {
		//Creando carros
		Carro carro1 = new Carro("ASN-3232");
		Carro carro2 = new Carro("SKS-3632");
		Carro carro3 = new Carro("ORE-7454");
		Carro carro4 = new Carro("KDS-9564");
		Carro carro5 = new Carro("ALD-3495");
		Carro carro6 = new Carro("DLS-5034");
		
		//Creando motos
		Moto moto1 = new Moto("DAL-0295");
		Moto moto2 = new Moto("OPL-0295");
		Moto moto3 = new Moto("DRH-0235");
		Moto moto4 = new Moto("LDL-0795");
		Moto moto5 = new Moto("VPL-9452");
		Moto moto6 = new Moto("ZOW-5385");
		
		//Creando Camiones
		Camión camión1 = new Camión("JDS-9537", 2);
		Camión camión2 = new Camión("IBA-2382", 4);
		Camión camión3 = new Camión("FIF-2934", 5);
		Camión camión4 = new Camión("DLC-8732", 3);
		Camión camión5 = new Camión("KFC-3048", 6);
		Camión camión6 = new Camión("KFS-7930", 2);
		
		Peaje Gaceta = new Peaje("Estación sur #52");
		//Agregando vehiculos
		Gaceta.AgregarVehículos(carro1);
		Gaceta.AgregarVehículos(carro2);
		Gaceta.AgregarVehículos(carro3);
		Gaceta.AgregarVehículos(carro4);
		Gaceta.AgregarVehículos(carro5);
		Gaceta.AgregarVehículos(carro6);
		Gaceta.AgregarVehículos(moto1);
		Gaceta.AgregarVehículos(moto2);
		Gaceta.AgregarVehículos(moto3);
		Gaceta.AgregarVehículos(moto4);
		Gaceta.AgregarVehículos(moto5);
		Gaceta.AgregarVehículos(moto6);
		Gaceta.AgregarVehículos(camión1);
		Gaceta.AgregarVehículos(camión2);
		Gaceta.AgregarVehículos(camión3);
		Gaceta.AgregarVehículos(camión4);
		Gaceta.AgregarVehículos(camión5);
		Gaceta.AgregarVehículos(camión6);
		
		//Calculando peaje
		Gaceta.Calcular(carro1);
		Gaceta.Calcular(carro2);
		Gaceta.Calcular(carro3);
		Gaceta.Calcular(carro4);
		Gaceta.Calcular(carro5);
		Gaceta.Calcular(carro6);
		Gaceta.Calcular(moto1);
		Gaceta.Calcular(moto2);
		Gaceta.Calcular(moto3);
		Gaceta.Calcular(moto4);
		Gaceta.Calcular(moto5);
		Gaceta.Calcular(moto6);
		Gaceta.Calcular(camión1);
		Gaceta.Calcular(camión2);
		Gaceta.Calcular(camión3);
		Gaceta.Calcular(camión4);
		Gaceta.Calcular(camión5);
		Gaceta.Calcular(camión6);
		
		carro1.Imprimir();
		System.out.println();
		moto1.Imprimir();
		System.out.println();
		camión1.Imprimir();
		System.out.println();
		Gaceta.Imprimir();
	}
}
