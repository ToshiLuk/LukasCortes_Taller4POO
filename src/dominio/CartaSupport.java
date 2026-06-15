package dominio;

public class CartaSupport extends Carta{
	private int efectoPorTurno;

	public CartaSupport(String nombre, int rareza, String tipo, int efectoPorTurno) {
		super(nombre, rareza, tipo);
		this.efectoPorTurno = efectoPorTurno;
	}

	public int getEfectoPorTurno() {
		return efectoPorTurno;
	}

	public void setEfectoPorTurno(int efectoPorTurno) {
		this.efectoPorTurno = efectoPorTurno;
	}

	@Override
	public double aceptar(Visitor visitor) {
		return visitor.visitar(this);
	}
	
}
