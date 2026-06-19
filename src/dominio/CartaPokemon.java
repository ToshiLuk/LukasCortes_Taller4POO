package dominio;
import Visitor.Visitor;
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
	
	public void setDaño(int daño) {
		this.daño = daño;
	}
	public void setCantEnergias(int cantEnergias) {
		this.cantEnergias = cantEnergias;
	}
	@Override
	public double aceptar(Visitor visitor) {
		//La carta se manda al visitor
		return visitor.visitar(this);
	}
	
}
