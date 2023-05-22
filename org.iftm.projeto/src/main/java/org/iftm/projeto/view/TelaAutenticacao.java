package org.iftm.projeto.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaAutenticacao extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAutenticacao frame = new TelaAutenticacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaAutenticacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBounds(10, 11, 414, 50);
		contentPane.add(painelTitulo);
		painelTitulo.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Autentica\u00E7\u00E3o");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(10, 11, 394, 28);
		painelTitulo.add(lblTitulo);
		
		JPanel painelDados = new JPanel();
		painelDados.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		painelDados.setBounds(10, 76, 414, 96);
		contentPane.add(painelDados);
		painelDados.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login : ");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLogin.setBounds(10, 11, 46, 14);
		painelDados.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(66, 9, 338, 20);
		painelDados.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha : ");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(10, 55, 46, 14);
		painelDados.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(66, 53, 338, 20);
		painelDados.add(txtSenha);
		
		JPanel painelBotoes = new JPanel();
		painelBotoes.setBounds(10, 183, 414, 50);
		contentPane.add(painelBotoes);
		painelBotoes.setLayout(null);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(315, 11, 89, 23);
		painelBotoes.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(216, 11, 89, 23);
		painelBotoes.add(btnCancelar);
	}
}
