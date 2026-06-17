package Strategy;

import java.util.ArrayList;
import java.util.Comparator;

import dominio.Carta;

public class OrdenarPorNombre implements OrdenamientoStrategy{

	@Override
	public void ordenar(ArrayList<Carta> cartas) {
		//Ordena por orden alfabetico 
		cartas.sort(Comparator.comparing(Carta::getNombre));
		
	}

}
