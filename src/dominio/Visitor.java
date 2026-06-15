package dominio;

public interface Visitor {
	double visitar(CartaPokemon pokemon);
	double visitar(CartaItem item);
	double visitar(CartaSupport supp);
	double visitar(CartaEnergy energy);
}
