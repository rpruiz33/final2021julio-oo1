package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends Stock {
private List<NotaPedido> notasPedidos;

public List<NotaPedido> getNotasPedidos() {
	return notasPedidos;
}

public void setNotasPedidos(List<NotaPedido> notasPedidos) {
	this.notasPedidos = notasPedidos;
}

public Pedido(int idStock, Producto producto) {
	super(idStock, producto);
	this.notasPedidos = new ArrayList<NotaPedido>();
}

@Override
public String toString() {
	return "\nPedido [notasPedidos=" + notasPedidos + ", idStock=" + idStock + ", producto=" + producto + "]";
}
public  boolean agregarNotaPedido(LocalDate fecha, int cantidad, String cliente) {
	return notasPedidos.add(new NotaPedido(fecha, cantidad, cliente));
	
	
}

}
