package gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import business.Quarto;
import dados.Fachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class TelaCriarQuarto extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumQuarto;
	private JTextField txtCapacidadeQuarto;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final Action action = new SwingAction();
	private boolean banheiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriarQuarto frame = new TelaCriarQuarto();
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
	public TelaCriarQuarto() {
		setTitle("Criar Quarto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdQuarto = new JLabel("N\u00FAmero do Quarto:");
		lblIdQuarto.setBounds(21, 28, 121, 14);
		contentPane.add(lblIdQuarto);
		
		txtNumQuarto = new JTextField();
		txtNumQuarto.setBounds(152, 25, 96, 20);
		contentPane.add(txtNumQuarto);
		txtNumQuarto.setColumns(10);
		
		JLabel lblCapacidade = new JLabel("Capacidade:");
		lblCapacidade.setBounds(54, 59, 88, 14);
		contentPane.add(lblCapacidade);
		
		txtCapacidadeQuarto = new JTextField();
		txtCapacidadeQuarto.setBounds(152, 56, 49, 20);
		contentPane.add(txtCapacidadeQuarto);
		txtCapacidadeQuarto.setColumns(10);
		
		JLabel lblBanheiro = new JLabel("Banheiro:");
		lblBanheiro.setBounds(68, 87, 78, 14);
		contentPane.add(lblBanheiro);
		
		JRadioButton rdbBanheiroSim = new JRadioButton("Sim");
		buttonGroup.add(rdbBanheiroSim);
		rdbBanheiroSim.setBounds(152, 83, 60, 23);
		contentPane.add(rdbBanheiroSim);
		
		JRadioButton rdbBanheiroNao = new JRadioButton("N\u00E3o");
		buttonGroup.add(rdbBanheiroNao);
		rdbBanheiroNao.setBounds(214, 83, 69, 23);
		contentPane.add(rdbBanheiroNao);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbBanheiroSim.isSelected()) {
					banheiro = true;
				}
				else {
					banheiro = false;
				}
				
				Quarto q1 = new Quarto (Integer.valueOf(txtNumQuarto.getText()), Integer.valueOf(txtCapacidadeQuarto.getText()), banheiro, false);
				
				Fachada fachada = new Fachada();
				fachada.criarQuarto(q1);
				JOptionPane.showMessageDialog(null, "Quarto "+txtNumQuarto.getText() +" Criado Com Sucesso!");
				
				//Retorna para Tela de Menu
				
				
					TelaMenu irMenu = new TelaMenu();
					irMenu = new TelaMenu();
					irMenu.setLocationRelativeTo(null);
					irMenu.setVisible(true);
					irMenu.setResizable(false);
				
				
				
				
			}
		});
		btnCriar.setBounds(104, 123, 113, 23);
		contentPane.add(btnCriar);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
