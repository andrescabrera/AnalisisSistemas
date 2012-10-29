import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Principal {

	public static void main(String[] args) {

//		recordatorioSobreMaps();
		
//		Prueba propiedades dinamicas flexibles
		Persona kent = new Persona("Kent de Barbie");
		Direccion direccionVacacionesKent = new Direccion("Argentina", "Moreno 666", "6 SCTO");
		Direccion direccionTrabajoKent = new Direccion("USA", "YankisDeMierdaaa", "$");
		Direccion direccionTrabajoKent2 = new Direccion("Venezuela", "Palacio de Miraflores", "4TO"); //Esta la reemplaza
		Empresa empresaDeKent = new Empresa("Barbie Inc.");

		kent.setValueOf("direccionVacaciones", direccionVacacionesKent);
		kent.setValueOf("direccionTrabajo", direccionTrabajoKent);
		
		//Tal como en propiedades fijas, dos variables podian hacer referencia al mismo objecto -direccionTrabajoKent2-
		kent.setValueOf("direccionVacaciones", direccionTrabajoKent2); //Esta reemplaza la anterior direccion de vacaciones
		kent.setValueOf("direccionTrabajo", direccionTrabajoKent2); //Esta reemplaza la anterior direccion de trabajo
		
		kent.setValueOf("empresa", empresaDeKent);
		
		//Obtengo las direcciones de kent
		Direccion direccionVacacionesObtenida1 = (Direccion) kent.getValueOf("direccionVacaciones");
		Direccion direccionVacacionesObtenida2 = (Direccion) kent.getValueOf("direccionTrabajo");
		Type tipoKent = kent.getClass();
		Class tipoKent2 = kent.getClass();
		//Obtengo la empresa que es de kent
		Empresa empresaDeKentObtenida = (Empresa) kent.getValueOf("empresa");
		System.out.println("Hola soy: " + kent);
		System.out.println("Consigo la propiedad direccionVacaciones de Kent: " + direccionVacacionesObtenida1);
		System.out.println("Consigo la propiedad direccionTrabajo de Kent: " + direccionVacacionesObtenida2);
		System.out.println("Consigo la propiedad empresa de Kent " + empresaDeKentObtenida);
	}
	
	public static void recordatorioSobreMaps () {
		// Recordatorio sobre Mapas
		// En un Mapa, podemos tener muchas claves con un mismo valor, pero no al
		// reves
		// Map<String,String> hm = new HashMap<String,String>();
		// hm.put("A","Amaya");
		// hm.put("A","Andres"); //Nos va a devolver Andres, porque al hacer
		// hm.put... reemplaza a Amaya
		// hm.put("B","Bartolo");
		// hm.put("B","Buenisimo");
		// System.out.println(hm.get("B"));

		// Para que funcione el diccionario tiene que estar al reves...
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("Amaya", "A");
		hm.put("Andres", "A"); // Nos va a devolver Andres, porque al hacer
								// hm.put... reemplaza a Amaya
		hm.put("Bartolo", "B");
		hm.put("Buenisimo", "B");
		System.out.println("Andres está en: " + hm.get("Andres"));
		System.out.println("Buenisimo está en: " + hm.get("Buenisimo"));

		System.out.println("Recorremos solo la letra \"A\" del Mapa -Diccionario-");
		for (Entry<String, String> entradaDelMap : hm.entrySet()) {
			if (entradaDelMap.getValue().equals("A"))
				System.out.println("clave: " + entradaDelMap.getKey() + " valor: "
						+ entradaDelMap.getValue());
		}
	}
}
