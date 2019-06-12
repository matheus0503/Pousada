package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dados.Fachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLoginCpf;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 269, 148);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteSeuCpf = new JLabel("Digite seu CPF:");
		lblDigiteSeuCpf.setBounds(81, 11, 124, 14);
		contentPane.add(lblDigiteSeuCpf);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Função que verifica se o Funcionario do CPF digitado Existe
				Fachada fachada = new Fachada();
				if (fachada.procurarFunc(txtLoginCpf.getText()) == null) {
					JOptionPane.showMessageDialog(null, "Funcionario Incorreto");
				}
				else {
					JOptionPane.showMessageDialog(null, "Login Realizado com Sucesso");
				}
			}
		});
		btnLogin.setBounds(77, 67, 89, 23);
		contentPane.add(btnLogin);
		
		txtLoginCpf = new JTextField();
		txtLoginCpf.setBounds(36, 36, 169, 20);
		contentPane.add(txtLoginCpf);
		txtLoginCpf.setColumns(10);
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
