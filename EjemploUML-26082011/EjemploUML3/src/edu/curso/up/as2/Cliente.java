package edu.curso.up.as2;

import java.util.ArrayList;

public class Cliente {

	private long id;
	private String nombre;
	
	public void agregarPedido(Pedido pedido) {
		pedidos.add(pedido);
		pedido.setCliente(this);
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
}
