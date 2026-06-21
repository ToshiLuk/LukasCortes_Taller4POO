package logica;

import java.util.ArrayList;

import Strategy.OrdenamientoStrategy;
import dominio.Carta;

public interface Sistema {
	void guardarCartas();//Leemos Sobres.txt
	void actualizarCartas();//Sobrescribe el txt cuando se modifique
	
	boolean agregarCarta(Carta c);//Agregamos Carta 
	boolean eliminarCarta(String nombre);//Eliminamos Carta
	Carta buscarCarta(String nombre);//Buscamos Carta xd
	
	ArrayList<Carta> getColeccion();//Devuelve la colección
	
	void ordenarColeccion(OrdenamientoStrategy estrategia);
}
