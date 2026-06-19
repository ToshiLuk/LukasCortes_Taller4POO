package Strategy;

import java.util.ArrayList;

import Visitor.CalculadorVisitor;
import dominio.Carta;

public class OrdenarPorPoder implements OrdenamientoStrategy {

	@Override
	public void ordenar(ArrayList<Carta> cartas) {
		CalculadorVisitor visitor = new CalculadorVisitor();
		cartas.sort((c1,c2)-> Double.compare(c2.aceptar(visitor), c1.aceptar(visitor)));

	}

}
