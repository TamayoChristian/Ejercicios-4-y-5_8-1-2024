package Ejercicio7_Significado_de_la_relación_de_agregación;

import java.util.ArrayList;

public class Departamento {
	//Atributos
	public String nombre;
	ArrayList<Municipio> Lista_de_Municipios = new ArrayList<Municipio>();

	//Constructor
	public Departamento(String nombre) {
		super();
		this.nombre = nombre;
	}

	//Getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Agregar municipio
	public void AgregarMunicipio(Municipio Nuevo_Municipio) {
		Lista_de_Municipios.add(Nuevo_Municipio);
	}
	
	//Borrar un municipio
	public void EliminarMunicipio(Municipio Municipio_a_Borar) {
		Lista_de_Municipios.remove(Municipio_a_Borar);
	}
	
	//Buscar un municipio
	public void BuscarMunicipio(String Nombre_Municipio) {
		boolean Bandera = false;
		for(int i = 0; i < Lista_de_Municipios.size(); i++) {
			if (Nombre_Municipio.equals(Lista_de_Municipios.get(i).Nombre)) {
				System.out.println("Nombre: " + Lista_de_Municipios.get(i).Nombre);
				System.out.println("Población: "+Lista_de_Municipios.get(i).Población +
						" habitantes");
				System.out.println("Altitud: " + Lista_de_Municipios.get(i).Altitud + 
						" metros sobre el nivel del mar");
				System.out.println("Temperatura: "+Lista_de_Municipios.get(i).Temperatura + 
						"°C");
				Bandera =  true;
			} 
		}
		if(Bandera==false) {
			System.out.println("Dicho municipio no existe en este Departamento");
		}
	}
	
	public void ExistenMunicpiosMasPoblados(int Población_Referencia){
		boolean Bandera = false;
		for(int i = 0; i < Lista_de_Municipios.size(); i++) {
			if (Lista_de_Municipios.get(i).Población >= Población_Referencia) {
				System.out.println(Lista_de_Municipios.get(i).Nombre);
				Bandera =  true;
			}
		}
		if (Bandera == false) {
			System.out.println("No hay municipios con una población mayor o igual");
		}
	}
	
	public void Censo() {
		int Total = 0;
		for(int i = 0; i < Lista_de_Municipios.size(); i++) {
			Total += Lista_de_Municipios.get(i).Población;
		}
		System.out.println("Total habitantes en " + getNombre() + " es: "+ Total +
				" habitantes");
	}
}
