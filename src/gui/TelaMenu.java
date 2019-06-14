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
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import java.awt.SystemColor;

public class TelaMenu extends JFrame {

	private JPanel contentPane;
	JDesktopPane desktopPane = new JDesktopPane();

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
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("Menu de Op\u00E7\u00F5es");
		setBounds(100, 100, 684, 469);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Menu");
		setJMenuBar(menuBar);
		
		JMenu menu_2 = new JMenu("Estadia");
		menu_2.setIcon(new ImageIcon(TelaMenu.class.getResource("/Image/login (1).png")));
		menuBar.add(menu_2);
		
		JMenuItem menuItem_6 = new JMenuItem("Nova");
		menu_2.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("Renovar");
		menu_2.add(menuItem_7);
		
		JMenuItem menuItem_8 = new JMenuItem("Finalizar");
		menu_2.add(menuItem_8);
		
		JMenu mnQuarto = new JMenu("Quarto");
		mnQuarto.setIcon(new ImageIcon(TelaMenu.class.getResource("/Image/home (1).png")));
		menuBar.add(mnQuarto);
		
		JMenuItem mntmCriar = new JMenuItem("Criar");
		mntmCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Criando Janela Interna CriarQuarto
				TelaNovoQuarto criarQuarto = new TelaNovoQuarto();
				criarQuarto = new TelaNovoQuarto();
				criarQuarto.setVisible(true);
				desktopPane.add(criarQuarto);
				
			}
		});
		mnQuarto.add(mntmCriar);
		
		JMenuItem mntmEditar = new JMenuItem("Editar");
		mnQuarto.add(mntmEditar);
		
		JMenuItem mntmRemover = new JMenuItem("Remover");
		mntmRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaRemoverQuarto removerQuarto = new TelaRemoverQuarto();
				removerQuarto = new TelaRemoverQuarto();
				removerQuarto.setVisible(true);
				desktopPane.add(removerQuarto);
			}
		});
		mnQuarto.add(mntmRemover);
		
		JMenu menu = new JMenu("Cliente");
		menu.setIcon(new ImageIcon(TelaMenu.class.getResource("/Image/add-user.png")));
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Criar");
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Editar");
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Remover");
		menu.add(menuItem_2);
		
		JMenu menu_1 = new JMenu("Funcionario");
		menu_1.setIcon(new ImageIcon(TelaMenu.class.getResource("/Image/add-user-func.png")));
		menuBar.add(menu_1);
		
		JMenuItem menuItem_3 = new JMenuItem("Criar");
		menu_1.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("Editar");
		menu_1.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("Remover");
		menu_1.add(menuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(583, 364, 73, 23);
		contentPane.add(btnNewButton);
		desktopPane.setBackground(SystemColor.menu);
		desktopPane.setDragMode(1);
		
		desktopPane.setBounds(12, 12, 644, 340);
		contentPane.add(desktopPane);
		desktopPane.setLayout(null);
		

	}
}
