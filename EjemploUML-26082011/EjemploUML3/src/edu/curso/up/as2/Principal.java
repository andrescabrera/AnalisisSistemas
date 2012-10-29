package edu.curso.up.as2;

import java.util.Date;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto();
		producto1.setId(1);
		producto1.setNombre("TV LCD 32");
		producto1.setPrecio(3800);
		
		Producto producto2 = new Producto();
		producto2.setId(2);
		producto2.setNombre("PC MAC");
		producto2.setPrecio(9200);
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(9876);
		cliente1.setNombre("Lucas");
		
		Pedido pedido1 = new Pedido();
		pedido1.setId(23343);
		pedido1.setFecha(new Date());
		pedido1.setNotas("Pedido vip para lucas");
		cliente1.agregarPedido(pedido1);
		
		ItemPedido itemPedido1 = new ItemPedido();
		itemPedido1.asignarProducto(producto1, 10);
		
		pedido1.agregarItem(itemPedido1);
		
		ItemPedido itemPedido2 = new ItemPedido();
		itemPedido2.asignarProducto(producto2, 5);
		
		pedido1.agregarItem(itemPedido2);
		
		pedido1.listarProductos();
		double total = pedido1.calcularTotal();
		System.out.println("El total es " + total);

	}

}
