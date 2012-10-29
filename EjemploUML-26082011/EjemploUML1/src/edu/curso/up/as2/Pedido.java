package edu.curso.up.as2;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private long id;
	private Date fecha;
	private String notas;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	private Cliente cliente;
	private ArrayList<ItemPedido> items = new ArrayList<ItemPedido>();
	
	public ArrayList<ItemPedido> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemPedido> items) {
		this.items = items;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
