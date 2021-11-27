package vehiculos;

public class Pais {
	
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		Fabricante f = Fabricante.fabricaMayorVentas();
		Pais pais = f.getPais();
		return pais;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
