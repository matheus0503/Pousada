package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import business.Cliente;
import business.Quarto;
import dados.Fachada;

public class TelaNovoCliente extends JInternalFrame {
	private JTextField txtIdCliente;
	private JTextField txtNomeCliente;
	private JTextField txtCpfCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNovoCliente frame = new TelaNovoCliente();
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
	public TelaNovoCliente() {
		setTitle("Novo Cliente");
		setClosable(true);
		setBounds(100, 100, 430, 170);
		getContentPane().setLayout(null);
		
		JLabel lblIdDoCliente = new JLabel("ID do Cliente:");
		lblIdDoCliente.setBounds(27, 11, 81, 14);
		getContentPane().add(lblIdDoCliente);
		
		JLabel lblNomeDoCliente = new JLabel("Nome do Cliente:");
		lblNomeDoCliente.setBounds(10, 42, 110, 14);
		getContentPane().add(lblNomeDoCliente);
		
		JLabel lblCpfDoCliente = new JLabel("CPF do Cliente:");
		lblCpfDoCliente.setBounds(20, 73, 100, 14);
		getContentPane().add(lblCpfDoCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(118, 8, 51, 20);
		getContentPane().add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setColumns(10);
		txtNomeCliente.setBounds(118, 39, 271, 20);
		getContentPane().add(txtNomeCliente);
		
		txtCpfCliente = new JTextField();
		txtCpfCliente.setColumns(10);
		txtCpfCliente.setBounds(118, 70, 135, 20);
		getContentPane().add(txtCpfCliente);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtNomeCliente.getText() == "" || txtIdCliente.getText() == "" || txtCpfCliente.getText() == ""){
					JOptionPane.showMessageDialog(null, "Erro !  Campos Inválidos!");
				}
				
				Cliente c1 = new Cliente (txtNomeCliente.getText(), txtCpfCliente.getText(), Integer.valueOf(txtIdCliente.getText()));
				
				Fachada fachada = new Fachada();
				fachada.criarCliente(c1);
				JOptionPane.showMessageDialog(null, "Cliente "+c1.getIdCliente() +" Criado Com Sucesso!");
				
			}
		});
		btnFinalizar.setBounds(289, 94, 89, 23);
		getContentPane().add(btnFinalizar);

	}

}
