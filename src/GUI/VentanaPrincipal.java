package GUI;
import javax.swing.*;
import logica.Sistema;
import logica.SistemaImp;

public class VentanaPrincipal extends JFrame{
	private Sistema sistema;
	public VentanaPrincipal() {
		sistema = SistemaImp.getInstancia();
		sistema.guardarCartas();
		
		setTitle("Gestor de Coleccion - Pokemon TCG");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JTabbedPane pestañas = new JTabbedPane();
		JPanel panelAdmin = crearPanelAdmin();
		JPanel panelColeccion = crearPanelColeccion();
	}
	private JPanel crearPanelAdmin() {
		// TODO Auto-generated method stub
		return null;
	}
	private JPanel crearPanelColeccion() {
		// TODO Auto-generated method stub
		return null;
	}
}
