package edu.curso.up.as2;

public class ItemPedido {

	private Producto producto;
	private Pedido pedido;
	private int cantidad;
	private double precio;
	
	
	public void asignarProducto(Producto productoNuevo, int nuevaCantidad) {
		precio = productoNuevo.getPrecio();
		producto = productoNuevo;
		cantidad = nuevaCantidad;
	}
	
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
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
