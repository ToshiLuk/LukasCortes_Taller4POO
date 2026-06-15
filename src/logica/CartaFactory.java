package logica;

import dominio.Carta;
import dominio.CartaPokemon;
import dominio.CartaEnergy;
import dominio.CartaItem;
import dominio.CartaSupport;
public class CartaFactory {
	//Metodo estatico que recibe Sobres.txt y crea las cartas
	public static Carta crearCarta(String lineaTxt) {
		String[] partes = lineaTxt.split(";");
		
		String nombre = partes[0].trim();
		int rareza = Integer.parseInt(partes[1].trim());
		String tipo = partes[2].trim();
		
		//Creamos cartas segun que tipo de carta sea
		switch(tipo) {
		case "Pokemon":
			int daño = Integer.parseInt(partes[3].trim());
			int cantEnergias = Integer.parseInt(partes[4].trim());
			return new CartaPokemon(nombre, rareza, tipo, daño, cantEnergias);
		case "Item":
			int bonificacion = Integer.parseInt(partes[3].trim());
			return new CartaItem(nombre, rareza, tipo, bonificacion);
		case "Supporter":
			int efectos = Integer.parseInt(partes[3].trim());
			return new CartaSupport(nombre, rareza, tipo, efectos);
		case "Energy":
			String elemento = partes[3].trim();
			return new CartaEnergy(nombre, rareza, tipo, elemento);
		default:
			//Por si el txt contiene un tipo de carta equivocado
			return null;
		}
	}
}
