package dados;

import javax.swing.JOptionPane;

import business.Quarto;
import interfaces.RepositorioQuarto;

public class ControleQuarto {

	RepositorioQuarto quartos = new DadosArray();
	
	public void criarQuarto(Quarto q) {
		//regras de neggocio
		if (q.getNumQuarto() != null && q.getCapacidade() != 0) {
			quartos.criarQuarto(q);
			JOptionPane.showMessageDialog(null, "Quarto "+q.getNumQuarto() +" Criado Com Sucesso!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Dados Inválidos !");
		}
			
	}
	
	public void removerQuarto(String numQuarto) {
		quartos.removerQuarto(numQuarto);
	}
	
	public void atualizarStatus(Quarto q, boolean status) {
		
	}
	
	public String listarNumQuarto (int posicao) {
			return quartos.listarNumQuarto(posicao);
	}
	
	public Quarto[] listar() {
		return quartos.listar();
	}
	

}
