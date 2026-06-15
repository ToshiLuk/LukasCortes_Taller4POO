package dominio;

public class CartaEnergy extends Carta{
	private String elemento;

	public CartaEnergy(String nombre, int rareza, String tipo, String elemento) {
		super(nombre, rareza, tipo);
		this.elemento = elemento;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	@Override
	public double aceptar(Visitor visitor) {
		return visitor.visitar(this);
	}
	
}
