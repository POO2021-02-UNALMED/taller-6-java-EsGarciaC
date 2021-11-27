package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private int cantidad;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante fabricaMayor = fabricantes.get(0); 
		for(int i = 0; i < fabricantes.size(); i++) {
			if (fabricantes.get(i).cantidad > fabricaMayor.cantidad) {
				fabricaMayor = fabricantes.get(i);
			}
		}
		return fabricaMayor;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
