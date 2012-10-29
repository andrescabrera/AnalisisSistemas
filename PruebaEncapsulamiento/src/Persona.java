
public class Persona implements IPersona {
	
	/* (non-Javadoc)
	 * @see IPersona#caminar()
	 */
	@Override
	public void caminarEnCualquierLado() {
		System.out.println("Estoy caminando");
	}
	
	public void correrEnCinta(ICinta cinta) {
		cinta.aumentarVelocidad();
		cinta.aumentarVelocidad();
		
		System.out.println("Subi la velocidad y estoy corriendo en la cinta.");
	}
	
}
