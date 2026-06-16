package logica;

import java.util.ArrayList;

import dominio.Carta;

public class SistemaImp implements Sistema{
	//Singleton
	private static SistemaImp instancia;
	//Para guardar las Cartas
	private ArrayList<Carta> coleccion;
	
	private SistemaImp() {
		coleccion = new ArrayList<Carta>();
	}
	
	public static SistemaImp getInstancia() {
		if(instancia == null) {
			instancia = new SistemaImp();//Se crea si es que no hay otra instancia ya creada
		}
		return instancia;
	}

	@Override
	public void guardarCartas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarCartas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean agregarCarta(Carta c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarCarta(String nombre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Carta buscarCarta(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Carta> getColeccion() {
		// TODO Auto-generated method stub
		return null;
	}

}
