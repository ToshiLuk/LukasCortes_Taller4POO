package Strategy;

import java.util.ArrayList;

import dominio.Carta;

public class OrdenarPorRareza implements OrdenamientoStrategy {

	@Override
	public void ordenar(ArrayList<Carta> cartas) {
		cartas.sort((c1, c2) -> Integer.compare(c2.getRareza(), c1.getRareza()));

	}

}
