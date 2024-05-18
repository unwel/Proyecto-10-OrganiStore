package clases;

public abstract class ProductoOrganico {

	// atributos
	private String nombre, tipo;
	private double precio;

	// constructor
	public ProductoOrganico(String nombre, String tipo, double precio) {

		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}

	// Setter y Getter para nombre
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Setter y Getter para tipo
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Setter y Getter para precio
	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String informacionProducto() {
		return "nombre: " + nombre + "tipo: " + tipo + "precio: " + precio;
	}
	
}
