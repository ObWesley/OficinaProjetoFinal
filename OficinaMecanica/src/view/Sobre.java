package view;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/carro1.png")));
		setTitle("MW.Mec\u00E2nica - Sobre");
		setBounds(100, 100, 570, 344);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Oficina Mec\u00E2nica - Cadastro de Clientes ");
		lblNewLabel.setBounds(30, 64, 395, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblAutoresMaxswell = new JLabel("Autor:  Wesley");
		lblAutoresMaxswell.setBounds(30, 89, 395, 14);
		getContentPane().add(lblAutoresMaxswell);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFocusTraversalPolicyProvider(true);
		lblNewLabel_1.setFocusCycleRoot(true);
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setIcon(new ImageIcon(Sobre.class.getResource("/img/GPL .png")));
		lblNewLabel_1.setBounds(439, 134, 64, 64);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sob Licen\u00E7a GPL -  General Public License.");
		lblNewLabel_2.setBounds(26, 192, 450, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u00C9 a designa\u00E7\u00E3o da licen\u00E7a de software. ");
		lblNewLabel_3.setBounds(26, 215, 291, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Vers\u00E3o 1.0");
		lblNewLabel_4.setBounds(90, 258, 83, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("www.oficinamecanica.com");
		lblNewLabel_5.setBounds(361, 266, 242, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(30, 109, 560, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_4_1 = new JLabel("20/10/2021");
		lblNewLabel_4_1.setBounds(439, 209, 83, 14);
		getContentPane().add(lblNewLabel_4_1);

	}
}
