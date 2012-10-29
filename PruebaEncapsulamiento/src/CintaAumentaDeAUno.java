
public class CintaAumentaDeAUno implements ICinta {
	private int cmAncho;
	private int velocidadCinta = 0;
	
	/* (non-Javadoc)
	 * @see ICinta#getCmAncho()
	 */
	@Override
	public int getCmAncho() {
		return cmAncho;
	}

	/* (non-Javadoc)
	 * @see ICinta#setCmAncho(int)
	 */
	@Override
	public void setCmAncho(int cmAncho) {
		this.cmAncho = cmAncho;
	}
	
	/* (non-Javadoc)
	 * @see ICinta#aumentarVelocidad()
	 */
	@Override
	public void aumentarVelocidad() {
		velocidadCinta++;
	}
	
	/* (non-Javadoc)
	 * @see ICinta#disminuirVelocidad()
	 */
	@Override
	public void disminuirVelocidad() {
		velocidadCinta--;
	}

	/* (non-Javadoc)
	 * @see ICinta#getVelocidadCinta()
	 */
	@Override
	public int getVelocidadCinta() {
		return velocidadCinta;
	}

	/* (non-Javadoc)
	 * @see ICinta#setVelocidadCinta(int)
	 */
	@Override
	public void setVelocidadCinta(int velocidadCinta) {
		this.velocidadCinta = velocidadCinta;
	}
	
	
	
}
