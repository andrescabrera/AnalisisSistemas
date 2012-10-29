package edu.palermo.asa2.proyectodemo;

import java.util.Date;

public class Main {

	//Metodo main, que es el unico punto de entrada
	public static void main(String[] args) {
		
		Product unProducto = new Product();
		unProducto.setId(22);
		unProducto.setNombre("BGH Enova");
		unProducto.setPrecio(1500.24);
		
		ItemPedido unaFilaDeLaFactura = new ItemPedido();
		unaFilaDeLaFactura.setCantidad(20);
		
		Cliente unCliente = new Cliente();
		unCliente.setNombre("Felipe Jimenez");
		unCliente.setId(1);
		
		Pedido unPedido = new Pedido();
		unPedido.setFecha(new Date());
		unPedido.setId(1010);
		unPedido.setNotas("La descripcion de este pedido.");
		
		
		//Relaciones
		unaFilaDeLaFactura.setProductoDelItem(unProducto);
		
		unaFilaDeLaFactura.setPedido(unPedido);
		unPedido.getItemp().add(unaFilaDeLaFactura);
		
		unPedido.setClienteDelPedido(unCliente);
		
		
		unCliente.getPedidosDelCliente().add(unPedido);
		unaFilaDeLaFactura.setPedido(unPedido);
		
	}

}
