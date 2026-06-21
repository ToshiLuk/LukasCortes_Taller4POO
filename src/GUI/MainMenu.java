package GUI;

import java.awt.Component;
import java.awt.Font;

import javax.swing.*;

import logica.Sistema;

public class MainMenu {
	private Sistema sistema;
	public MainMenu(Sistema sistema) {
		this.sistema = sistema;
	}
	public void iniciar() {
		JFrame mainMenu = new JFrame("Gestor de Coleccion de Pokemon TCG");
		//Dimensiones
		mainMenu.setSize(800, 600);
		//Se cierra al darle a la X
		mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Para que quede por el centro
		mainMenu.setLocationRelativeTo(null);
		//Esto me contiene las pestañas
		JTabbedPane pestañas = new JTabbedPane();
		pestañaAdmin();
	}
	private JPanel pestañaAdmin() {
		
		JPanel panelAdmin = new JPanel();
		panelAdmin.setLayout(new BoxLayout(panelAdmin, BoxLayout.Y_AXIS));
		panelAdmin.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		JLabel tituloAdmin = new JLabel("Administracion de Cartas");
		tituloAdmin.setFont(new Font("Arial", Font.BOLD, 24));
		tituloAdmin.setAlignmentX(Component.CENTER_ALIGNMENT);
		//Creamos botones para las distintas funciones
		JButton btnAgregar = new JButton("Agregar Carta");
		JButton btnModificar = new JButton("Modificar Carta");
		JButton btnEliminar = new JButton("Eliminar Carta");
		//Posicion para cada boton
		btnAgregar.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnModificar.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnEliminar.setAlignmentX(Component.CENTER_ALIGNMENT);
		//Funciones para los botones
		btnAgregar.addActionListener(e ->{
			System.out.println("PlaceHolder Boton agregar");
		});
		btnModificar.addActionListener(e ->{
			System.out.println("PlacheHolder Boton modificar");
		});
		btnEliminar.addActionListener(e ->{
			System.out.println("PlaceHolder Boton eliminar");
		});
		//Agregamos todo lo que creamos al JPanel
		panelAdmin.add(tituloAdmin);
		panelAdmin.add(Box.createVerticalStrut(30));
		panelAdmin.add(btnAgregar);
		panelAdmin.add(Box.createVerticalStrut(10));
		panelAdmin.add(btnModificar);
		panelAdmin.add(Box.createVerticalStrut(10));
		panelAdmin.add(btnEliminar);
		//Y se retorna el panel creado 
		//Martin Pinoguett
		return panelAdmin;
	}
}
