package test;

import java.time.LocalDate;

import modelo.Almacen;
import modelo.Pedido;
import modelo.SistemaCooperativa;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaCooperativa sistema=new SistemaCooperativa();
		System.out.println("Test 1");
		try {
			System.out.println(sistema.agregarProducto("1111111111", "1", 100));
			System.out.println(sistema.agregarProducto("2222222222", "2", 200));
			System.out.println(sistema.agregarProducto("3333333333", "3", 300));
			System.out.println(sistema.agregarProducto("4444444444", "4", 400));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test 2");
		try {
			System.out.println(sistema.agregarProducto("111", "6", 300));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(sistema.agregarProducto("222", "7", 400));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sistema.getProductos());
		System.out.println("Test 3");
		System.out.println(sistema.agregarPedido(sistema.traerProducto("1111111111")));
		System.out.println(sistema.agregarPedido(sistema.traerProducto("2222222222")));
		System.out.println(sistema.getStocks());
		System.out.println(sistema.agregarAlmacen(sistema.traerProducto("2222222222") ,100, 80));
		System.out.println(sistema.agregarAlmacen(sistema.traerProducto("3333333333") ,120, 100));
		System.out.println(sistema.agregarAlmacen(sistema.traerProducto("4444444444") ,220, 200));
		System.out.println(sistema.getStocks());
		System.out.println("-----------------");
		System.out.println(sistema.traerStock(sistema.traerProducto("2222222222")));
		System.out.println(((Pedido) sistema.traerStock(1)).agregarNotaPedido(LocalDate.of(2021, 7, 14), 100,"1"));
		System.out.println(((Pedido) sistema.traerStock(1)).agregarNotaPedido(LocalDate.of(2021, 7, 14), 100,"2"));
		System.out.println(((Pedido) sistema.traerStock(1)).agregarNotaPedido(LocalDate.of(2021, 7, 14), 100,"3"));
		System.out.println(sistema.getStocks());
		System.out.println("-----------------");
		System.out.println(((Almacen) sistema.traerStock(3)).agregarLote(LocalDate.of(2021, 7, 14), 1000));
		System.out.println(((Almacen) sistema.traerStock(3)).agregarLote(LocalDate.of(2021, 7, 14), 1200));
		System.out.println(((Almacen) sistema.traerStock(3)).agregarLote(LocalDate.of(2021, 7, 14), 1500));
		System.out.println(sistema.getStocks());
	}
}