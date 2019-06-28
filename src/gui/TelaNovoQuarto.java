package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import business.Quarto;
import dados.Fachada;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

public class TelaNovoQuarto extends JInternalFrame {
	private JTextField txtNumQuarto;
	private JTextField txtCapacidadeQuarto;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private boolean banheiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNovoQuarto frame = new TelaNovoQuarto();
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
	public TelaNovoQuarto() {
		getContentPane().setBounds(new Rectangle(0, 30, 0, 0));
		setClosable(true);
		setTitle("Novo Quarto");
		setBounds(100, 100, 278, 180);
		getContentPane().setLayout(null);
		
		JLabel lblNmeroDoQuarto = new JLabel("N\u00FAmero do Quarto:");
		lblNmeroDoQuarto.setBounds(10, 11, 121, 14);
		getContentPane().add(lblNmeroDoQuarto);
		
		txtNumQuarto = new JTextField();
		txtNumQuarto.setBounds(127, 8, 57, 20);
		getContentPane().add(txtNumQuarto);
		txtNumQuarto.setColumns(10);
		
		JLabel lblCapacidade = new JLabel("Capacidade:");
		lblCapacidade.setBounds(42, 39, 89, 14);
		getContentPane().add(lblCapacidade);
		
		txtCapacidadeQuarto = new JTextField();
		txtCapacidadeQuarto.setBounds(127, 36, 57, 20);
		getContentPane().add(txtCapacidadeQuarto);
		txtCapacidadeQuarto.setColumns(10);
		
		JLabel lblPossuiBanheiro = new JLabel("Possui Banheiro ?");
		lblPossuiBanheiro.setBounds(10, 70, 107, 14);
		getContentPane().add(lblPossuiBanheiro);
		
		JRadioButton rdbBanheiroSim = new JRadioButton("SIM");
		buttonGroup.add(rdbBanheiroSim);
		rdbBanheiroSim.setBounds(116, 66, 57, 23);
		getContentPane().add(rdbBanheiroSim);
		
		JRadioButton rdbBanheiroNao = new JRadioButton("N\u00C3O");
		buttonGroup.add(rdbBanheiroNao);
		rdbBanheiroNao.setBounds(171, 66, 66, 23);
		getContentPane().add(rdbBanheiroNao);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbBanheiroSim.isSelected()) {
					banheiro = true;
				}
				else {
					banheiro = false;
				}
				
				Quarto q1 = new Quarto (txtNumQuarto.getText(), Integer.valueOf(txtCapacidadeQuarto.getText()), banheiro, false);
				
				Fachada fachada = new Fachada();
				fachada.criarQuarto(q1);
				
			}
		});
		btnCriar.setBounds(84, 111, 89, 23);
		getContentPane().add(btnCriar);

	}
}
