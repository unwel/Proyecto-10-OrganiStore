package clases;

public class Fruta extends ProductoOrganico{
 
	private String tipoFruta;
	private double precioVenta = 0;
	
	public Fruta(String nombre, String tipo, double precio, String tipoFruta) {
		
		super(nombre, tipo, precio);
		this.tipoFruta = tipoFruta;
	}
	
	public double calcularPrecioVenta() {
		return precioVenta;
	}
}
