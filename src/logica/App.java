//Lukas Paolo Toshisuke Cortés Alfaro, 22.108.123-4, ICCI
package logica;

import GUI.MainMenu;

public class App {

	public static void main(String[] args) {
		Sistema sistema = SistemaImp.getInstancia();
		sistema.guardarCartas();
		
		MainMenu menu = new MainMenu(sistema);
		menu.iniciar();
	}

}
