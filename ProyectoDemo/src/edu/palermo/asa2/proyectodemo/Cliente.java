package edu.palermo.asa2.proyectodemo;

import java.util.ArrayList;

public class Cliente {
	//Variables de estado
	private long id;
	private String nombre;
	private ArrayList<Pedido> pedidosDelCliente = new ArrayList<Pedido>();
	
	//Constructor vacío
	public Cliente () { }
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ArrayList<Pedido> getPedidosDelCliente() {
		return pedidosDelCliente;
	}

	public void setPedidosDelCliente(ArrayList<Pedido> pedidosDelCliente) {
		this.pedidosDelCliente = pedidosDelCliente;
	}
}
