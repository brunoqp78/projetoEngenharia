package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class TelaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JDesktopPane desktop = new JDesktopPane();
		desktop.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(desktop, BorderLayout.CENTER);
		
		JMenuBar menu = new JMenuBar();
		menu.setFont(new Font("Arial", Font.PLAIN, 12));
		frame.setJMenuBar(menu);
		
		JMenu menuCadastrar = new JMenu("Cadastrar");
		menu.add(menuCadastrar);
		
		JMenuItem menuCadastrarVeterinario = new JMenuItem("Veterin\u00E1rio");
		menuCadastrar.add(menuCadastrarVeterinario);
		
		JMenu menuConsultar = new JMenu("Consultar");
		menu.add(menuConsultar);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		menu.add(menuAjuda);
		
		JMenuItem menuSobre = new JMenuItem("Sobre");
		menuSobre.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		menuAjuda.add(menuSobre);
	}
}
