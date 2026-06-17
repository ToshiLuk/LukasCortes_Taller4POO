package logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import dominio.Carta;

public class SistemaImp implements Sistema {
	// Singleton
	private static SistemaImp instancia;
	// Para guardar las Cartas
	private ArrayList<Carta> coleccion;
	public static Scanner lector;

	private SistemaImp() {
		coleccion = new ArrayList<Carta>();
	}

	public static SistemaImp getInstancia() {
		if (instancia == null) {
			instancia = new SistemaImp();// Se crea si es que no hay otra instancia ya creada
		}
		return instancia;
	}

	@Override
	public void guardarCartas() {
		try {
			File arch = new File("Datos/Sobres.txt");
			lector = new Scanner(arch);
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				//Manda la linea de texto al factory para que cree el objeto
				Carta carta = CartaFactory.crearCarta(linea);
				if(carta != null) {
					coleccion.add(carta);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error, no se pudo leer el archivo");
		}

	}

	@Override
	public void actualizarCartas() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean agregarCarta(Carta c) {
		if(c != null) {
			coleccion.add(c);
			return true;
		}
		return false;
	}

	@Override
	public boolean eliminarCarta(String nombre) {
		Carta carta = buscarCarta(nombre);
		if(carta != null) {
			coleccion.remove(carta);
			return true;
		}
		return false;
	}

	@Override
	public Carta buscarCarta(String nombre) {
		for(Carta c : coleccion) {
			if(c.getNombre().equalsIgnoreCase(nombre)) return c;
		}
		return null;
	}

	@Override
	public ArrayList<Carta> getColeccion() {
		// TODO Auto-generated method stub
		return null;
	}

}
