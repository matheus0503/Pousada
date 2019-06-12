package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdFunc;
	private JTextField txtSalFunc;
	private JTextField txtNomeFunc;
	private JTextField txtFuncCpf;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Criar Funcion\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 292, 253);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCriarFuncionrio = new JLabel("Criar Funcion\u00E1rio");
		lblCriarFuncionrio.setBounds(12, 12, 117, 15);
		contentPane.add(lblCriarFuncionrio);
		
		JLabel lblIdFuncionrio = new JLabel("ID Funcion\u00E1rio:");
		lblIdFuncionrio.setBounds(22, 39, 98, 15);
		contentPane.add(lblIdFuncionrio);
		
		txtIdFunc = new JTextField();
		txtIdFunc.setBounds(102, 36, 124, 19);
		contentPane.add(txtIdFunc);
		txtIdFunc.setColumns(10);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setBounds(61, 124, 38, 14);
		contentPane.add(lblSalrio);
		
		txtSalFunc = new JTextField();
		txtSalFunc.setBounds(102, 121, 124, 19);
		contentPane.add(txtSalFunc);
		txtSalFunc.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(67, 68, 32, 14);
		contentPane.add(lblNome);
		
		txtNomeFunc = new JTextField();
		txtNomeFunc.setBounds(102, 65, 124, 19);
		contentPane.add(txtNomeFunc);
		txtNomeFunc.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setBounds(77, 96, 23, 14);
		contentPane.add(lblNewLabel);
		
		txtFuncCpf = new JTextField();
		txtFuncCpf.setBounds(102, 93, 124, 19);
		contentPane.add(txtFuncCpf);
		txtFuncCpf.setColumns(10);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnCriar.setAction(action);
		btnCriar.setBounds(98, 166, 114, 25);
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
