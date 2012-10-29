
public class Libro 
{
	private String Contenido;
	private int NumeroPagina;
	
	public Libro(String contenido,int numeropagina)
	{
		this.Contenido = contenido;
		this.NumeroPagina = numeropagina;
	}
	public String obtenerContenido()
	{
		return Contenido;
	}
	public int ObtenerPagina()
	{
		return NumeroPagina;
	}
	
	public String toString()
	{
		return "Numero de pagina: "+NumeroPagina+"Contenido: "+Contenido;
	}
}
