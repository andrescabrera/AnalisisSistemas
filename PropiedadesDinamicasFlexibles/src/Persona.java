import java.util.HashMap;
import java.util.Map;

public class Persona {
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	// Tengo un hashmap (clave, valor) (String, Object) (TIPO_PROPIEDAD,
	// VALOR_PROPIEDAD)
	// Puedo tener propiedades de distinto tipo

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}

	Map<String, Object> mapaPropiedades = new HashMap<String, Object>();

	// Propiedades dinamicas flexibles
	public void setValueOf(String key, Object value) {
		mapaPropiedades.put(key, value);
	}

	public Object getValueOf(String key) {
		return mapaPropiedades.get(key);
	}

	// Propiedades fijas
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
