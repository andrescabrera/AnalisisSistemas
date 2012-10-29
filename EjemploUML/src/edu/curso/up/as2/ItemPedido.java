package edu.curso.up.as2;

public class ItemPedido {
	private Producto producto;
	private Pedido pedido;
	private int cantidad;
	private double precio;
	
	public void asignarProducto(Producto producto) {
		precio = producto.getPrecio();
		this.producto = producto;
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
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
}
