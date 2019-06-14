package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu frame = new TelaMenu();
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
	public TelaMenu() {
		setTitle("Menu de Op\u00E7\u00F5es");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaMenu.class.getResource("/Image/PousadaProgT2.png")));
		label.setBounds(59, 11, 305, 68);
		contentPane.add(label);
		
		JLabel lblSelecioneAOpo = new JLabel("Selecione a Op\u00E7\u00E3o Desejada:");
		lblSelecioneAOpo.setBounds(59, 100, 227, 14);
		contentPane.add(lblSelecioneAOpo);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(332, 205, 73, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCriarFuncionrio = new JButton("Funcion\u00E1rio");
		btnCriarFuncionrio.setBounds(51, 137, 123, 23);
		contentPane.add(btnCriarFuncionrio);
		
		JButton btnCriarQuarto = new JButton("Quarto");
		btnCriarQuarto.setBounds(51, 171, 123, 23);
		contentPane.add(btnCriarQuarto);
		
		JButton btnCriarCliente = new JButton("Cliente");
		btnCriarCliente.setBounds(51, 205, 123, 23);
		contentPane.add(btnCriarCliente);
		
		JButton btnCriarEstadia = new JButton("Estadia");
		btnCriarEstadia.setBounds(184, 137, 123, 23);
		contentPane.add(btnCriarEstadia);
	}
}
