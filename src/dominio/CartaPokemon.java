package dominio;

public class CartaPokemon extends Carta{
	private int daño;
	private int cantEnergias;
	public CartaPokemon(String nombre, int rareza, String tipo, int daño, int cantEnergias) {
		super(nombre, rareza, tipo);
		this.daño = daño;
		this.cantEnergias = cantEnergias;
	}
	public int getDaño() {
		return daño;
	}
	public int getCantEnergias() {
		return cantEnergias;
	}
	
}
