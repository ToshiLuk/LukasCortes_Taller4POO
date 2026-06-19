package dominio;

import Visitor.Visitor;

public class CartaItem extends Carta{
	private int bonificacion;

	public CartaItem(String nombre, int rareza, String tipo, int bonificacion) {
		super(nombre, rareza, tipo);
		this.bonificacion = bonificacion;
	}
	
	public int getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}

	@Override
	public double aceptar(Visitor visitor) {
		return visitor.visitar(this);
	}
	
}
