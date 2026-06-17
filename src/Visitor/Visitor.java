package Visitor;

import dominio.CartaEnergy;
import dominio.CartaItem;
import dominio.CartaPokemon;
import dominio.CartaSupport;

public interface Visitor {
	double visitar(CartaPokemon pokemon);
	double visitar(CartaItem item);
	double visitar(CartaSupport supp);
	double visitar(CartaEnergy energy);
}
