
public class Direccion {
	private String pais;
	private String calle;
	private String numeroDepto;
	
	@Override
	public String toString() {
		return "Direccion [pais=" + pais + ", calle=" + calle
				+ ", numeroDepto=" + numeroDepto + "]";
	}

	public Direccion(String pais, String calle, String numeroDepto) {
		super();
		this.pais = pais;
		this.calle = calle;
		this.numeroDepto = numeroDepto;
	}

	
	public void setPais(String pais){
		this.pais = pais;
	}
	
	public String getPais () {
		return pais;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public String getCalle(){
		return calle;
	}
	
	public void setNumeroDepto(String numeroDepto) {
		this.numeroDepto = numeroDepto;
	}
	
	public String getNumeroDepto(){
		return numeroDepto;
	}
}
