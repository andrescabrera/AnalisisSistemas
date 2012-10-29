
public class Empresa {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + "]";
	}
	
}
