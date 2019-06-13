package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import dados.Fachada;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLoginCpfFunc;

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
		setResizable(false);
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 228, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteSeuCpf = new JLabel("Digite Seu CPF:");
		lblDigiteSeuCpf.setBounds(57, 109, 121, 14);
		contentPane.add(lblDigiteSeuCpf);
		
		txtLoginCpfFunc = new JTextField();
		txtLoginCpfFunc.setBounds(30, 134, 148, 20);
		contentPane.add(txtLoginCpfFunc);
		txtLoginCpfFunc.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ação do Botão verifica se CPF Funcionario existe e entra no sistema
				//Criar OBJ Fachada
				Fachada fachada1 = new Fachada();
				// Utiliza Funcção Buscar Func no ARRAY para verificar se CPF digitado existe na base de funcs.
				//Comentario teste
				if(fachada1.procurarFunc(txtLoginCpfFunc.getText()).getCpf() == null) {
					JOptionPane.showMessageDialog(null, "Funcionario Inexistente!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Login Realizado com Sucesso");
				}
			}
		});
		btnLogin.setBounds(57, 165, 89, 23);
		contentPane.add(btnLogin);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 174, 87);
		contentPane.add(panel);
	}
}
