
public class CintaAumentaDeADiez implements ICinta {
	
	private int cmAncho = 100;
	private int velocidadCinta = 10;
	
	private int unaVariablePedorra = 151020;
	
	@Override
	public int getCmAncho() {
		return cmAncho;
	}

	@Override
	public void setCmAncho(int cmAncho) {	
		this.cmAncho = cmAncho;
	}

	@Override
	public void aumentarVelocidad() {
		velocidadCinta += 10;
	}

	@Override
	public void disminuirVelocidad() {
		velocidadCinta -= 5;
	}

	@Override
	public int getVelocidadCinta() {
		return velocidadCinta;
	}

	@Override
	public void setVelocidadCinta(int velocidadCinta) {
		this.velocidadCinta = velocidadCinta;
	}

	public int getUnaVariablePedorra() {
		return unaVariablePedorra;
	}

	public void setUnaVariablePedorra(int unaVariablePedorra) {
		this.unaVariablePedorra = unaVariablePedorra;
	}

}
