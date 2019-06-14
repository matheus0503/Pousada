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
import javax.swing.ImageIcon;

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
<<<<<<< Updated upstream
		setBounds(100, 100, 228, 161);
=======
		setBounds(100, 100, 377, 238);
>>>>>>> Stashed changes
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDigiteSeuCpf = new JLabel("Digite Seu CPF:");
<<<<<<< Updated upstream
		lblDigiteSeuCpf.setBounds(57, 22, 121, 14);
		contentPane.add(lblDigiteSeuCpf);
		
		txtLoginCpfFunc = new JTextField();
		txtLoginCpfFunc.setBounds(30, 47, 148, 20);
=======
		lblDigiteSeuCpf.setBounds(144, 109, 121, 14);
		contentPane.add(lblDigiteSeuCpf);
		
		txtLoginCpfFunc = new JTextField();
		txtLoginCpfFunc.setBounds(66, 134, 243, 20);
>>>>>>> Stashed changes
		contentPane.add(txtLoginCpfFunc);
		txtLoginCpfFunc.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ação do Botão verifica se CPF Funcionario existe e entra no sistema
				//Criar OBJ Fachada
				Fachada fachada1 = new Fachada();
				// Utiliza Funcção Buscar Func no ARRAY para verificar se CPF digitado existe na base de funcs.
<<<<<<< Updated upstream
				
				if(fachada1.procurarFunc(txtLoginCpfFunc.getText()).getCpf() == null) {
=======
				//Para usar com PASSWORD, ao invés de usar .getText() -> usar: .getPassword();
				if(txtLoginCpfFunc.getText().equals(fachada1.procurarFunc(txtLoginCpfFunc.getText()).getCpf())) {
>>>>>>> Stashed changes
					JOptionPane.showMessageDialog(null, "Funcionario Inexistente!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Login Realizado com Sucesso");
				}
			}
		});
<<<<<<< Updated upstream
		btnLogin.setBounds(57, 78, 89, 23);
		contentPane.add(btnLogin);
=======
		btnLogin.setBounds(135, 164, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/Images/PousadaProgT2.png")));
		lblNewLabel.setBounds(10, 22, 338, 76);
		contentPane.add(lblNewLabel);
>>>>>>> Stashed changes
	}
}
