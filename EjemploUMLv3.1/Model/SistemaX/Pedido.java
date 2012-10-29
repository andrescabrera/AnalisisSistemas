package SistemaX;

/**
 * @author acabrera
 * @version 1.0
 * @created 27-ago-2011 12:22:46 a.m.
 */
public class Pedido {

	private boolean fecha;
	private long id;
	private String notas;
	public Cliente m_Cliente;
	public ItemPedido m_ItemPedido;

	public Pedido(){

	}

	public void finalize() throws Throwable {

	}

	public double calcularTotal(){
		return 0;
	}

}