package Visitor;

import dominio.CartaEnergy;
import dominio.CartaItem;
import dominio.CartaPokemon;
import dominio.CartaSupport;

public class CalculadorVisitor implements Visitor{
	@Override
	public double visitar(CartaPokemon pokemon) {
		//Daño / cantEnergias * 100
		//Comprobamos que las energias no sean 0 para que no explote
		if (pokemon.getCantEnergias() == 0) {
			return 0;
		}
		return ((double) pokemon.getDaño()/ pokemon.getCantEnergias()) * 100;
	}

	@Override
	public double visitar(CartaItem item) {
		//Bonificación * 20
		return item.getBonificacion() * 20;
	}

	@Override
	public double visitar(CartaSupport supp) {
		//EfectosPorTurno * 50
		return supp.getEfectoPorTurno() * 50;
	}

	@Override
	public double visitar(CartaEnergy energy) {
		//Todos tienen 1 por defecto
		return 1.0;
	}
	
}
