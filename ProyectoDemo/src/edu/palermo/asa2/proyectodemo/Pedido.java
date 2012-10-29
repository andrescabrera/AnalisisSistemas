package edu.palermo.asa2.proyectodemo;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private Date fecha;
	private long id;
	private String notas;
	private Cliente clienteDelPedido;
	private ArrayList <ItemPedido> Itemp = new ArrayList <ItemPedido> (); 
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	public Cliente getClienteDelPedido() {
		return clienteDelPedido;
	}
	public void setClienteDelPedido(Cliente clienteDelPedido) {
		this.clienteDelPedido = clienteDelPedido;
	}
	public ArrayList <ItemPedido> getItemp() {
		return Itemp;
	}
	public void setItemp(ArrayList <ItemPedido> itemp) {
		Itemp = itemp;
	}
	
}
