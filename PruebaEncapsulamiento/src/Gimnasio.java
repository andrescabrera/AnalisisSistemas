
public class Gimnasio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ICinta cintaGrandeAumentaRapido = new CintaAumentaDeADiez();
		ICinta cintaChicaAumentaDespacio = new CintaAumentaDeAUno();
		
		Persona pepeGordo = new Persona();
		pepeGordo.correrEnCinta(cintaGrandeAumentaRapido);

	}

}
