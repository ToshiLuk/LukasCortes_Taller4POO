package GUI;
import javax.swing.*;
import logica.Sistema;
import logica.SistemaImp;

public class VentanaPrincipal extends JFrame{
	private Sistema sistema;
	public VentanaPrincipal() {
		//Patron Singleton
		sistema = SistemaImp.getInstancia();
		sistema.guardarCartas();
		//Ventana
		setTitle("Gestor de Coleccion - Pokemon TCG");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//Contenedor de pestañas
		JTabbedPane pestañas = new JTabbedPane();
		//Paneles
		JPanel panelAdmin = crearPanelAdmin();
		JPanel panelColeccion = crearPanelColeccion();
		//Y se agregan los paneles a sus pestañas 
		pestañas.addTab("Admin", panelAdmin);
		pestañas.addTab("Ver Coleccion", panelColeccion);
		
		add(pestañas);
	}
	private JPanel crearPanelAdmin() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("PlaceholderAdmin"));
		return panel;
	}
	private JPanel crearPanelColeccion() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("PlaceHolderColeccion"));
		return panel;
	}
}
