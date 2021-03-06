package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class Inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicial.class.getResource("/img/carro1.png")));
		setResizable(false);
		setTitle("MW.Mec\u00E2nica - Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 346);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnUsuarios = new JButton("");
		btnUsuarios.setContentAreaFilled(false);
		btnUsuarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUsuarios.setBorder(null);
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento actionPerformed (pressionar o botao)
				//exibir a tela de Usuario
				Usuario usuario = new Usuario();
				usuario.setVisible(true);
			}
		});
		btnUsuarios.setToolTipText("Usu\u00E1rios");
		btnUsuarios.setIcon(new ImageIcon(Inicial.class.getResource("/img/Usuario.png")));
		btnUsuarios.setBounds(10, 0, 128, 128);
		contentPane.add(btnUsuarios);
		JButton btnClientes = new JButton("");
		btnClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClientes.setContentAreaFilled(false);
		btnClientes.setBorder(null);
		btnClientes.setBackground(Color.LIGHT_GRAY);
		
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento actionPerformed (pressionar o botao)
				//exibir a tela de Clientes
				Cliente cliente = new Cliente();
				cliente.setVisible(true);
			}
		});
		btnClientes.setIcon(new ImageIcon(Inicial.class.getResource("/img/clientes.png")));
		btnClientes.setToolTipText("Clientes");
		btnClientes.setBounds(10, 160, 113, 118);
		contentPane.add(btnClientes);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel.setIcon(new ImageIcon(Inicial.class.getResource("/img/Cab.png")));
		lblNewLabel.setBounds(133, 85, 243, 118);
		contentPane.add(lblNewLabel);
		
		JButton btnSobre = new JButton("");
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setContentAreaFilled(false);
		btnSobre.setBorder(null);
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ativar a janela Sobre
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setToolTipText("Sobre");
		btnSobre.setIcon(new ImageIcon(Inicial.class.getResource("/img/interrogation.png")));
		btnSobre.setBounds(432, 204, 64, 64);
		contentPane.add(btnSobre);
		
		JLabel lblNewLabel_2 = new JLabel("Bem-Vindo(a)");
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(196, 11, 149, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sistema inicial de Cadastro de Usu\u00E1rio , Clientes e Ordem de Servi\u00E7o");
		lblNewLabel_3.setForeground(new Color(128, 128, 128));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(52, 280, 426, 27);
		contentPane.add(lblNewLabel_3);
	}
}
