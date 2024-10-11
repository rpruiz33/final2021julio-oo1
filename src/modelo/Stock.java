package modelo;

public class Stock {
protected int  idStock;
protected Producto producto;
public int getIdStock() {
	return idStock;
}
public void setIdStock(int idStock) {
	this.idStock = idStock;
}
public Producto getProducto() {
	return producto;
}
public void setProducto(Producto producto) {
	this.producto = producto;
}
public Stock(int idStock, Producto producto) {
	super();
	this.idStock = idStock;
	this.producto = producto;
}
@Override
public String toString() {
    return "\nStock [idStock=" + idStock + ", producto=" + producto + "]";
}


}
