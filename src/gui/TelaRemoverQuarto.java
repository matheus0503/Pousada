package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class TelaRemoverQuarto extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRemoverQuarto frame = new TelaRemoverQuarto();
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
	public TelaRemoverQuarto() {
		setClosable(true);
		setTitle("Remover Quarto");
		setBounds(100, 100, 200, 161);
		getContentPane().setLayout(null);
		
		JLabel lblNumeroDoQuarto = new JLabel("Selecione o Quarto:");
		lblNumeroDoQuarto.setBounds(10, 11, 120, 14);
		getContentPane().add(lblNumeroDoQuarto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 40, 149, 22);
		getContentPane().add(comboBox);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBackground(new Color(128, 0, 0));
		btnRemover.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnRemover.setForeground(SystemColor.textHighlightText);
		btnRemover.setBounds(10, 78, 149, 23);
		getContentPane().add(btnRemover);

	}

}