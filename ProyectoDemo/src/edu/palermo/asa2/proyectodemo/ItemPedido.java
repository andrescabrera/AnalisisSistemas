package edu.palermo.asa2.proyectodemo;

public class ItemPedido {
	
	private int cantidad;
	private double precio;
	private Pedido pedido;
	private Product productoDelItem;
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Product getProductoDelItem() {
		return productoDelItem;
	}

	public void setProductoDelItem(Product productoDelItem) {
		this.productoDelItem = productoDelItem;
	}
	
}