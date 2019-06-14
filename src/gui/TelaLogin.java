package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

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
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLoginCpfFunc;
	private TelaMenu irMenu = new TelaMenu();


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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 334, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteSeuCpf = new JLabel("Digite Seu CPF:");
		lblDigiteSeuCpf.setBounds(20, 99, 100, 14);
		contentPane.add(lblDigiteSeuCpf);
		
		txtLoginCpfFunc = new JTextField();
		txtLoginCpfFunc.setBounds(130, 96, 169, 20);
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
				if(txtLoginCpfFunc.getText().equals("12345678900")) {
					JOptionPane.showMessageDialog(null, "Login Realizado com Sucesso");
					irMenu = new TelaMenu();
					irMenu.setLocationRelativeTo(null);
					irMenu.setVisible(true);
					irMenu.setResizable(false);
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Funcionario Inexistente");
				}
			}
		});
		btnLogin.setBounds(191, 127, 108, 23);
		contentPane.add(btnLogin);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaLogin.class.getResource("/Image/PousadaProgT2.png")));
		label.setBounds(10, 11, 300, 77);
		contentPane.add(label);
	}
}
