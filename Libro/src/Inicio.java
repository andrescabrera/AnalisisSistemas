import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Inicio {

	public static void main(String[] args) 
	{
		Random n = new Random();
		List<Libro> lib = new ArrayList<Libro>();
		int paginas = (int)(Math.random()*(900-50+1)+50);
		
		for(int i=0;i<paginas;i++)
		{
			String contenido[] = {"ninguno","ninguno2","ninguno3"};
			int aux = n.nextInt(3);
			
			lib.add(new Libro(contenido[aux],i+1));
		}
		
		for(Libro l:lib)
		{
			System.out.println("pagina :"+l.ObtenerPagina());
			System.out.println("contiene: "+l.obtenerContenido());
		}
		
	}

}
