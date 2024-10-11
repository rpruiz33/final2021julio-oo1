package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaCooperativa {
private List<Producto> productos;
private List<Stock> stocks;
public List<Producto> getProductos() {
	return productos;
}
public void setProductos(List<Producto> productos) {
	this.productos = productos;
}
public List<Stock> getStocks() {
	return stocks;
}
public void setStocks(List<Stock> stocks) {
	this.stocks = stocks;
}
public SistemaCooperativa() {
	super();
	this.productos = new ArrayList<Producto>();
	this.stocks =  new ArrayList<Stock>();
}
public Producto traerProducto(String codigo) {
	int i=0;
	Producto pro=null;
			while(i<productos.size()&& pro==null) {
				if(productos.get(i).getCodigo().equals(codigo) ) {
				pro=productos.get(i);
				}
				i++;
				}
			return pro;
}
public boolean agregarProducto(String codigo,String nombre, double precio)throws Exception {
	Producto p=traerProducto(codigo);
	if(p!=null) {
	if(!p.getCodigo().equals(codigo)) {
	throw new Exception ("el producto es invalido");
	}
	}
	int id=1;
	if(productos.size()>0) {
		id=productos.get(productos.size()-1).getIdProducto()+1;
	}
	
	return productos.add(new Producto(id ,codigo, nombre, precio));
			
}

public Stock traerStock(int idStock) {
	Stock sto=null;
			int i=0;
	while(i<stocks.size() && sto==null) {
		if(stocks.get(i).getIdStock()==idStock) {
			sto=stocks.get(i);
		}
		
		i++;
	}
	return sto;
}
public boolean agregarPedido(Producto producto) {
	int id=0;
	

		
	if(stocks.size()>0)  {
		id=stocks.get(stocks.size()-1).getIdStock()+1;
	}

	return stocks.add(new Pedido(id, producto));
}

public boolean agregarAlmacen(Producto producto, int unidadesDesable, int unidadesMinima) {
	int id=1;

	if(stocks.size()>0) {
		id=stocks.get(stocks.size()-1).getIdStock()+1;	
		}
	return stocks.add(new Almacen (id,producto,unidadesDesable,  unidadesMinima));
	
}
public List<Stock> traerStock(Producto producto){
	List<Stock> aux=new ArrayList<Stock>();
	for (int i=0;i<stocks.size();i++) {
		if(stocks.get(i).getProducto().equals(producto)) {
			aux.add(stocks.get(i));
		}
	}
	return aux;
}



}
