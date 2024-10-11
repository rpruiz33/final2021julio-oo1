package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Almacen extends Stock {

private int unidadesDesables;
private int unidadesMinimas;
private List<Lote> lotes;
public Almacen(int idStock, Producto producto, int unidadesDesables, int unidadesMinimas) {
	super(idStock, producto);
	this.unidadesDesables = unidadesDesables;
	this.unidadesMinimas = unidadesMinimas;
	this.lotes = new ArrayList<Lote>();
}
public int getUnidadesDesables() {
	return unidadesDesables;
}
public void setUnidadesDesables(int unidadesDesables) {
	this.unidadesDesables = unidadesDesables;
}
public int getUnidadesMinimas() {
	return unidadesMinimas;
}
public void setUnidadesMinimas(int unidadesMinimas) {
	this.unidadesMinimas = unidadesMinimas;
}
public List<Lote> getLotes() {
	return lotes;
}
public void setLotes(List<Lote> lotes) {
	this.lotes = lotes;
}
@Override
public String toString() {
	return "\nAlmacen [unidadesDesables=" + unidadesDesables + ", unidadesMinimas=" + unidadesMinimas + ", lotes=" + lotes
			+ ", idStock=" + idStock + ", producto=" + producto + "]";
}




public boolean  agregarLote(LocalDate fecha, int cantidadInicial) {

return	lotes.add(new Lote( fecha, cantidadInicial, cantidadInicial));
}




}
